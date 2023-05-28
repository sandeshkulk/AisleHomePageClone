package com.example.aisle.viewmodel

import android.util.Log
import androidx.compose.runtime.getValue
import androidx.compose.runtime.*
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.aisle.domain.RepositoryImp
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.launch
import org.json.JSONObject
import javax.inject.Inject


@HiltViewModel
class AisleViewModel @Inject constructor(private val repositoryImp: RepositoryImp):ViewModel()
{
    init {
        viewModelScope.launch {
            response()
            responseotp()
        }
    }
    suspend fun response(){
        var jsonObject by mutableStateOf(JSONObject())

        // Example of adding data to the JSON object
        jsonObject.put("number","+919876543212")

        // Print the JSON object
        println(jsonObject.toString())
      //  Log.d("Phone","${repositoryImp.PhoneNumberAPI(jsonObject).body()?.status}")
    //    Log.d("Phone number test log","${createJsonObject("+919876543212")}")
       // repositoryImp.PhoneNumberAPI(jsonObject).body()?.status
    }

    suspend fun responseotp(){
        var jsonObject by mutableStateOf(JSONObject())

        // Example of adding data to the JSON object
        jsonObject.put("number","+919876543212")
        jsonObject.put("otp","1234")

        // Print the JSON object
        println(jsonObject.toString())
//        Log.d("OTP","${repositoryImp.OTPAPI(jsonObject).body()?.token}")
//        Log.d("otp test log","${jsonObject.toString()}")
//        repositoryImp.OTPAPI(jsonObject).body()?.token
    }

    fun createJsonObject(number: String): JSONObject {
        val jsonObject = JSONObject()
        jsonObject.put("number", number)
        return jsonObject
    }
}



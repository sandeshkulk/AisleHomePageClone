package com.example.aisle.data

import com.example.aisle.domain.OTPModel
import com.example.aisle.domain.PhoneNumberModel
import com.example.aisle.domain.RepositoryImp
import org.json.JSONObject
import retrofit2.Call
import retrofit2.Response

class Repository( private val api: NetworkService):RepositoryImp {
    override suspend fun PhoneNumberAPI(jsonObject: JSONObject): Call<PhoneNumberModel> {
        return api.phoneNumberAPI(jsonObject)
    }

    override suspend fun OTPAPI(jsonObject: JSONObject): Call<OTPModel> {
        return api.otpAPI(jsonObject)
    }

}
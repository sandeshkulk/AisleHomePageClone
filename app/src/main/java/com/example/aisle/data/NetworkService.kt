package com.example.aisle.data

import com.example.aisle.domain.OTPModel
import com.example.aisle.domain.PhoneNumberModel
import org.json.JSONObject
import retrofit2.Call
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.POST

interface NetworkService {

    @POST("users/phone_number_login")
    suspend fun phoneNumberAPI(@Body Requestor: JSONObject):Call<PhoneNumberModel>

    @POST("users/verify_otp")
    suspend fun otpAPI(@Body Requestor:JSONObject):Call<OTPModel>
}
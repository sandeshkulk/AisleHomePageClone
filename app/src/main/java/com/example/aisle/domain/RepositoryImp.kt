package com.example.aisle.domain

import org.json.JSONObject
import retrofit2.Call
import retrofit2.Response

interface RepositoryImp {
    suspend fun PhoneNumberAPI(jsonObject: JSONObject):Call<PhoneNumberModel>
    suspend fun OTPAPI(jsonObject: JSONObject):Call<OTPModel>
}
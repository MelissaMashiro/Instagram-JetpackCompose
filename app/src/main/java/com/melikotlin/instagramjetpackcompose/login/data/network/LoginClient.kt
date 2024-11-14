package com.melikotlin.instagramjetpackcompose.login.data.network

import com.melikotlin.instagramjetpackcompose.login.data.network.response.LoginResponse
import retrofit2.Response
import retrofit2.http.GET

interface  LoginClient {
    @GET("/v3/d650656c-4dda-4a26-b6d8-aa689d949590")
    suspend fun  doLogin(): Response<LoginResponse>
}
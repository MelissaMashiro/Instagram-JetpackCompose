package com.melikotlin.instagramjetpackcompose.login.data.network

import com.melikotlin.instagramjetpackcompose.core.di.NetworkModule
import com.melikotlin.instagramjetpackcompose.core.network.RetrofitHelper
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.withContext
import retrofit2.Retrofit
import javax.inject.Inject

class LoginService @Inject constructor(private val loginClient: LoginClient){

   // private val retrofit = RetrofitHelper.getRetrofit()

    suspend fun doLogin(user: String, password: String): Boolean {
        return withContext(Dispatchers.IO) {
            try {
                // val response = retrofit.create(LoginClient::class.java).doLogin(user, password)
               // val response = retrofit.create(LoginClient::class.java).doLogin()
                val response = loginClient.doLogin()

                delay(2000)

                response.body()?.success
                    ?: false //success es el nombre de la variable que viene en el LoginResponse

            } catch (e: Exception) {
                print("exception----> $e")
                false
            }

        }
    }
}
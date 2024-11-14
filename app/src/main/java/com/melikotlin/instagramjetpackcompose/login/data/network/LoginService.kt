package com.melikotlin.instagramjetpackcompose.login.data.network

import com.melikotlin.instagramjetpackcompose.core.network.RetrofitHelper
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.withContext

class LoginService {

    private val retrofit = RetrofitHelper.getRetrofit()

    suspend fun doLogin(user: String, password: String): Boolean {
        return withContext(Dispatchers.IO) {
            try {

                val response = retrofit.create(LoginClient::class.java).doLogin()
                // La linea de abajo se usaria suponiendo q es un servicio real de login. en este caso da error si lo dejo, ya que es un valor q no se usa en el request fake
                // val response = retrofit.create(LoginClient::class.java).doLogin(user, password)
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
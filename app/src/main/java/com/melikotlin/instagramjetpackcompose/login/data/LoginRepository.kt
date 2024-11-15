package com.melikotlin.instagramjetpackcompose.login.data

import com.melikotlin.instagramjetpackcompose.login.data.network.LoginService
import javax.inject.Inject


class LoginRepository @Inject constructor(private val api:LoginService){
    //val api = LoginService()

    suspend fun doLogin(user:String, password:String):Boolean{
        //aca es donde en caso de tener un local storage, decido de donde sacar la info
        return api.doLogin(user,password)
    }
}
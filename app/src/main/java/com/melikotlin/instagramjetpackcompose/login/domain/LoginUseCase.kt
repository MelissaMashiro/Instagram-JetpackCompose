package com.melikotlin.instagramjetpackcompose.login.domain

import com.melikotlin.instagramjetpackcompose.login.data.LoginRepository

class LoginUseCase {

    val repository = LoginRepository()

    suspend operator fun invoke(user:String,password:String):Boolean{
        return repository.doLogin(user,password)
    }

}
package com.melikotlin.instagramjetpackcompose.login.domain

import com.melikotlin.instagramjetpackcompose.login.data.LoginRepository
import javax.inject.Inject

class LoginUseCase @Inject constructor(private val repository: LoginRepository) {

   // val repository = LoginRepository()

    suspend operator fun invoke(user:String,password:String):Boolean{
        return repository.doLogin(user,password)
    }

}
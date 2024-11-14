package com.melikotlin.instagramjetpackcompose.login.data.network.response

import com.google.gson.annotations.SerializedName

//data class LoginResponse (val success:Boolean)
//serializedname es para poner un custom name a usar si no quiero usar el nombre "sucess"
//IMPORTANTE: Igualmente es recomendable usar la etiqueta serialize auqnue se deje el mismo nombre, porque al obfuscar el codigo
// puede haber conflicto y podria fallar
data class LoginResponse (@SerializedName("success") val success:Boolean)
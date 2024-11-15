package com.melikotlin.instagramjetpackcompose.core.network

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitHelper {
    // FORMA MANUAL - Antes de la DI - Ahora se movio al NetworkModule para poder inyectarlo en otras clases
    /*
  // Retrofit initialization method
  fun getRetrofit(): Retrofit {



      return Retrofit.Builder()
          .baseUrl("https://run.mocky.io/")
          .addConverterFactory(GsonConverterFactory.create())
          .build()

    }
     */

}
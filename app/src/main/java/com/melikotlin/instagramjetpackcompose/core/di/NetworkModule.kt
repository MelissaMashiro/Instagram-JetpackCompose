package com.melikotlin.instagramjetpackcompose.core.di

import com.melikotlin.instagramjetpackcompose.login.data.network.LoginClient
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton


@Module
//InstallIn nos sirve para definis el alcance (scope)
//EJ: Cuando pongo un scope a nivel de Activity, entonces cuando muera ese activity, esa dependencia muere tambien
// En este caso, como el networkmodule es una clase generica en toda la aplicacion. Le pondremos un scope de Application.
// Para este scope, se usa la etiquetea 'SingletonComponent'. )solo tiene es enombre pero no lo hace funcionar como singleton)
@InstallIn(SingletonComponent::class)
class NetworkModule {

    // Con la etiqueta @Provides, Dagger sabe que si en algun momento le pides inyectar retrofit,
    //el va a pasartelo desde aqui
    @Singleton //esto si lo hace un singleton de verdad
    @Provides
    fun provideRetrofit():Retrofit{
         return Retrofit.Builder()
            .baseUrl("https://run.mocky.io/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    @Singleton
    @Provides
    fun provideLoginClient(retrofit: Retrofit):LoginClient{
        return retrofit.create(LoginClient::class.java)
    }
}
package com.example.bobsburgers.di

import com.example.bobsburgers.data.BobsBurgersService
import dagger.Module
import dagger.Provides
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

@Module
class NetworkModule {

    @Provides
    fun provideRetrofit(): Retrofit {
        return Retrofit.Builder()
            .baseUrl("https://bobsburgers-api.herokuapp.com/characters/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    @Provides
    fun provideBobsBurgersService(retrofit: Retrofit): BobsBurgersService{
        return retrofit.create(BobsBurgersService::class.java)
    }
}
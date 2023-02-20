package com.example.bobsburgers.data

import retrofit2.Response
import retrofit2.http.GET

interface BobsBurgersService {

    @GET("1")
    suspend fun getCharacter(): Response<NetworkCharacter>

}
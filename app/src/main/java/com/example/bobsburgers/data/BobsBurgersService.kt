package com.example.bobsburgers.data

import com.example.bobsburgers.data.response.NetworkCharacter
import retrofit2.Response
import retrofit2.http.GET

interface BobsBurgersService {

    @GET("7")
    suspend fun getCharacter(): Response<NetworkCharacter>

}
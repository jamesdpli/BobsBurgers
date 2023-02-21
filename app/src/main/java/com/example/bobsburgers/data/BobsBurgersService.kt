package com.example.bobsburgers.data

import com.example.bobsburgers.data.response.NetworkCharacter
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path

interface BobsBurgersService {

    @GET("{id}")
    suspend fun getCharacter(@Path("id") id: String): Response<NetworkCharacter>
}
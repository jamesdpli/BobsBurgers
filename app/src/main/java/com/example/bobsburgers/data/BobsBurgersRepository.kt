package com.example.bobsburgers.data

import com.example.bobsburgers.data.response.NetworkCharacter
import retrofit2.Response
import javax.inject.Inject

class BobsBurgersRepository @Inject constructor(
    private val service: BobsBurgersService
) {

    suspend fun getCharacterById(id: String): Response<NetworkCharacter> {
        return service.getCharacter(id)
    }
}
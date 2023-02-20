package com.example.bobsburgers.data.response

data class NetworkCharacter(
    val firstEpisode: String,
    val gender: String,
    val hairColor: String,
    val id: Int,
    val image: String,
    val name: String,
    val occupation: String,
    val relatives: List<Any>,
    val url: String,
    val voicedBy: String,
    val wikiUrl: String
)
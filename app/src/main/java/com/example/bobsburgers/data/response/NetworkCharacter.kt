package com.example.bobsburgers.data.response

data class NetworkCharacter(
    val age: String,
    val firstEpisode: String,
    val gender: String,
    val hairColor: String,
    val id: Int,
    val image: String,
    val name: String,
    val occupation: String,
    val networkRelatives: List<NetworkRelative>,
    val url: String,
    val voicedBy: String,
    val wikiUrl: String
) {
    data class NetworkRelative(
        val _id: String,
        val name: String,
        val relationship: String,
        val url: String,
        val wikiUrl: String
    )
}
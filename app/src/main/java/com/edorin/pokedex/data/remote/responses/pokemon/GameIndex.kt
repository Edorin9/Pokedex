package com.edorin.pokedex.data.remote.responses.pokemon

import com.google.gson.annotations.SerializedName

data class GameIndex(
    @SerializedName("game_index") val gameIndex: Int,
    val version: Version
)

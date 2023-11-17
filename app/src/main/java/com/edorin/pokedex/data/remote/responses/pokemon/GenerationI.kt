package com.edorin.pokedex.data.remote.responses.pokemon

import com.google.gson.annotations.SerializedName

data class GenerationI(
    @SerializedName("red-blue") val redBlue: RedBlue,
    val yellow: Yellow
)

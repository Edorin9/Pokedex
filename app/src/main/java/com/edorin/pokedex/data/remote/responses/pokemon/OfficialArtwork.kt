package com.edorin.pokedex.data.remote.responses.pokemon

import com.google.gson.annotations.SerializedName

data class OfficialArtwork(
    @SerializedName("front_default") val frontDefault: String,
    @SerializedName("front_shiny") val frontShiny: String
)

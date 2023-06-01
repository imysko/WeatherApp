package com.olya.weather.data.model.response

import com.google.gson.annotations.SerializedName

data class CurrentWeatherResponse(
    val temperature: Float,
    @SerializedName("weathercode")
    val weatherCode: Int,
    val time: String
)

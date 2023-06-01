package com.olya.weather.data.model.response

import com.google.gson.annotations.SerializedName

data class HourlyForecastResponse(
    val time: List<String>,
    @SerializedName("temperature_2m")
    val temperature: List<Float>,
    @SerializedName("weathercode")
    val weatherCode: List<Int>,
)

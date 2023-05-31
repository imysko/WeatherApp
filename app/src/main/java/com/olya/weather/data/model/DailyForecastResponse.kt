package com.olya.weather.data.model

import com.google.gson.annotations.SerializedName

data class DailyForecastResponse(
    @SerializedName("time")
    val date: List<String>,
    @SerializedName("temperature_2m_max")
    val temperatureMax: List<Float>,
    @SerializedName("temperature_2m_min")
    val temperatureMin: List<Float>,
    @SerializedName("weathercode")
    val weatherCode: List<Int>,
)
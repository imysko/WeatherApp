package com.olya.weather.domain.model

data class HourlyForecast(
    val time: String,
    val temperature: Float,
    val weatherCode: Int,
)

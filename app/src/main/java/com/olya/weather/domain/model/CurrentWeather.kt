package com.olya.weather.domain.model

data class CurrentWeather(
    val temperature: Float,
    val maxTemperature: Float,
    val minTemperature: Float,
    val weatherCode: Int,
    val time: String
)

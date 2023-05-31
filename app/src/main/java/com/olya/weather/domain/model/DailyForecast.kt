package com.olya.weather.domain.model

data class DailyForecast(
    val date: String,
    val temperatureMax: Float,
    val temperatureMin: Float,
    val weatherCode: Int,
)
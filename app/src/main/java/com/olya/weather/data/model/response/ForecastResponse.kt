package com.olya.weather.data.model.response

import com.google.gson.annotations.SerializedName

data class ForecastResponse(
    val latitude: Float,
    val longitude: Float,
    val timezone: String,
    @SerializedName("current_weather")
    val currentWeather: CurrentWeatherResponse,
    val hourly: HourlyForecastResponse,
    val daily: DailyForecastResponse
)

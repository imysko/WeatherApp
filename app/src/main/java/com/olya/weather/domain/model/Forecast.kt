package com.olya.weather.domain.model

data class Forecast(
    val currentWeather: CurrentWeather,
    val hourly: List<HourlyForecast>,
    val daily: List<DailyForecast>
)

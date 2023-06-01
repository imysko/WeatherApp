package com.olya.weather.data.service

import com.olya.weather.data.model.response.ForecastResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface ForecastService {
    @GET("/v1/forecast")
    suspend fun getForecast(
        @Query("latitude") latitude: Float,
        @Query("longitude") longitude: Float,
        @Query("timezone") timezone: String,
        @Query("current_weather") currentWeather: Boolean = true,
        @Query("hourly") hourly: List<String> = listOf("temperature_2m", "weathercode"),
        @Query("daily") daily: List<String> = listOf("temperature_2m_max", "temperature_2m_min", "weathercode"),
        @Query("forecast_days") forecastDays: Int = 7,
        @Query("past_days") pastDays: Int = 0,
    ): Response<ForecastResponse>
}

package com.olya.weather.data.service

import com.olya.weather.data.model.response.GeocodingResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface GeocodingService {
    @GET("/v1/search")
    suspend fun searchGeocoding(
        @Query("name") name: String,
        @Query("count") count: Int = 10,
        @Query("format") format: String = "json",
        @Query("language") language: String = "ru",
    ): Response<GeocodingResponse>
}
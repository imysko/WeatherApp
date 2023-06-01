package com.olya.weather.data.model.response

import com.olya.weather.domain.model.Geocoding

data class GeocodingResponse(
    val results: List<Geocoding>?
)

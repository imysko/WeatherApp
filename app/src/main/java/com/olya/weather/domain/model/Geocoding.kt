package com.olya.weather.domain.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "town")
data class Geocoding(
    @PrimaryKey val id: Int,
    val latitude: Float,
    val longitude: Float,
    val name: String,
    val country: String,
    val timezone: String,
    val admin1: String?,
)

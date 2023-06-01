package com.olya.weather.data.db

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.olya.weather.domain.model.Geocoding

@Dao
interface TownDao {
    @Query("SELECT * FROM town")
    fun getAll(): List<Geocoding>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insert(town: Geocoding)

    @Delete
    fun delete(town: Geocoding)
}
package com.olya.weather.ui.page.town

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.olya.weather.data.db.AppDatabase
import com.olya.weather.data.service.GeocodingService
import com.olya.weather.domain.model.Geocoding
import kotlinx.coroutines.launch
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class TownViewModel(
    private val _db: AppDatabase
) : ViewModel() {

    private val _townDao = _db.townDao()

    private val _favouriteTownList = MutableLiveData<List<Geocoding>>()
    val favouriteTownList: LiveData<List<Geocoding>> = _favouriteTownList

    private val _townList = MutableLiveData<List<Geocoding>>()
    val townList: LiveData<List<Geocoding>> = _townList

    private val _retrofit = Retrofit.Builder()
        .addConverterFactory(GsonConverterFactory.create())
        .baseUrl("https://geocoding-api.open-meteo.com")
        .build()
        .create(GeocodingService::class.java)

    init {
        getFavouriteTownList()
    }

    fun getFavouriteTownList() = viewModelScope.launch {
        _favouriteTownList.postValue(_townDao.getAll())
    }

    fun addToFavouriteList(town: Geocoding) = viewModelScope.launch {
        _townDao.insert(town)
        getFavouriteTownList()
    }

    fun deleteFromFavouriteList(town: Geocoding) = viewModelScope.launch {
        _townDao.delete(town)
        getFavouriteTownList()
    }

    fun getGeocoding(name: String) = viewModelScope.launch {
        try {
            val response = _retrofit.searchGeocoding(
                name = name,
            ).body()

            response?.let {
                _townList.postValue(it.results ?: emptyList())
            }

        } catch (e: Exception) {
            Log.e("Geocoding response", e.message.toString())
        }
    }
}
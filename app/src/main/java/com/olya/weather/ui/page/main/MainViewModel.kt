package com.olya.weather.ui.page.main

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.olya.weather.data.db.AppDatabase
import com.olya.weather.data.service.ForecastService
import com.olya.weather.domain.model.CurrentWeather
import com.olya.weather.domain.model.DailyForecast
import com.olya.weather.domain.model.Forecast
import com.olya.weather.domain.model.Geocoding
import com.olya.weather.domain.model.HourlyForecast
import kotlinx.coroutines.launch
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class MainViewModel(
    private val _db: AppDatabase
) : ViewModel() {
    private val _forecast = MutableLiveData<Forecast>()
    val forecast: LiveData<Forecast> = _forecast

    private val _selectedTown = MutableLiveData<Geocoding?>()
    val selectedTown: LiveData<Geocoding?> = _selectedTown

    private val _retrofit = Retrofit.Builder()
        .addConverterFactory(GsonConverterFactory.create())
        .baseUrl("https://api.open-meteo.com")
        .build()
        .create(ForecastService::class.java)

    fun getFirstTown() = viewModelScope.launch {
        _selectedTown.value = _db.townDao().getAll().firstOrNull()
    }

    fun getForecast() = viewModelScope.launch {
        _selectedTown.value?.let { town ->
            try {
                val response = _retrofit.getForecast(
                    latitude = town.latitude,
                    longitude = town.longitude,
                    timezone = town.timezone
                ).body()

                response?.let {
                    val hourly = it.hourly.time.zip(it.hourly.temperature).zip(it.hourly.weatherCode)
                        .map { pair ->
                            HourlyForecast(
                                time = pair.first.first,
                                temperature = pair.first.second,
                                weatherCode = pair.second
                            )
                        }

                    val daily = it.daily.date.zip(it.daily.temperatureMax)
                        .zip(it.daily.temperatureMin).zip(it.daily.weatherCode)
                        .map { pair ->
                            DailyForecast(
                                date = pair.first.first.first,
                                temperatureMax = pair.first.first.second,
                                temperatureMin = pair.first.second,
                                weatherCode = pair.second
                            )
                        }

                    Forecast(
                        currentWeather = CurrentWeather(
                            temperature = it.currentWeather.temperature,
                            maxTemperature = it.daily.temperatureMax.first(),
                            minTemperature = it.daily.temperatureMax.first(),
                            weatherCode = it.currentWeather.weatherCode,
                            time = it.currentWeather.time
                        ),
                        hourly = hourly,
                        daily = daily
                    )

                    _forecast.value = Forecast(
                        currentWeather = CurrentWeather(
                            temperature = it.currentWeather.temperature,
                            maxTemperature = it.daily.temperatureMax.first(),
                            minTemperature = it.daily.temperatureMax.first(),
                            weatherCode = it.currentWeather.weatherCode,
                            time = it.currentWeather.time
                        ),
                        hourly = hourly,
                        daily = daily
                    )
                }

            } catch (e: Exception) {
                Log.e("Forecast response", e.message.toString())
            }
        }
    }
}
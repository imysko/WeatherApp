package com.olya.weather.ui.page.main

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.olya.weather.data.service.ForecastService
import com.olya.weather.domain.model.CurrentWeather
import com.olya.weather.domain.model.DailyForecast
import com.olya.weather.domain.model.Forecast
import com.olya.weather.domain.model.HourlyForecast
import kotlinx.coroutines.launch
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class MainViewModel : ViewModel() {
    private val _forecast = MutableLiveData<Forecast>()
    val forecast: LiveData<Forecast> = _forecast

    private val _latitude = MutableLiveData<Float>().apply {
        value = 52.25f
    }

    private val _longitude = MutableLiveData<Float>().apply {
        value = 104.25f
    }

    private val _timezone = MutableLiveData<String>().apply {
        value = "Asia/Irkutsk"
    }

    // private val _currentDateTime = MutableLiveData<LocalDateTime>().apply {
    //     value = LocalDateTime.now()
    // }

    // private val _gson = GsonBuilder()
    //     .setDateFormat("yyyy-MM-dd'T'HH:mm:ss")
    //     .create()

    private val _retrofit = Retrofit.Builder()
        .addConverterFactory(GsonConverterFactory.create())
        .baseUrl("https://api.open-meteo.com")
        .build()
        .create(ForecastService::class.java)

    init {
        getForecast()
    }

    fun getForecast() = viewModelScope.launch {
        try {
            val response = _retrofit.getForecast(
                latitude = _latitude.value!!,
                longitude = _longitude.value!!,
                timezone = _timezone.value!!
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
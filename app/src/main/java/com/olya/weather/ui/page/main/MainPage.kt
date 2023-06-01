package com.olya.weather.ui.page.main

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.LocationCity
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavHostController
import com.olya.weather.R
import com.olya.weather.data.db.AppDatabase
import com.olya.weather.data.enums.WeatherCode
import com.olya.weather.domain.model.CurrentWeather
import com.olya.weather.domain.model.DailyForecast
import com.olya.weather.domain.model.Forecast
import com.olya.weather.domain.model.Geocoding
import com.olya.weather.domain.model.HourlyForecast
import com.olya.weather.ui.theme.WeatherTheme
import com.olya.weather.util.NavDestinations
import java.time.LocalDate
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

@Composable
fun MainPage(
    navController: NavHostController,
    viewModel: MainViewModel = viewModel(
        factory = MainViewModelFactory(AppDatabase.getInstance(LocalContext.current))
    ),
) {
    val selectedTown by viewModel.selectedTown.observeAsState()
    val forecast by viewModel.forecast.observeAsState()

    LaunchedEffect(Unit) {
        viewModel.getFirstTown()
        viewModel.getForecast()
    }

    MainPage(
        selectedTown = selectedTown,
        forecast = forecast,
        onTownClick = {
            navController.navigate(NavDestinations.TownPage)
        },
    )
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MainPage(
    selectedTown: Geocoding?,
    forecast: Forecast?,
    onTownClick: () -> Unit,
) {
    Scaffold(
        topBar = {
            TopAppBar(
                modifier = Modifier.fillMaxWidth(),
                title = {
                    Text(text = stringResource(id = R.string.forecast))
                },
                actions = {
                    IconButton(
                        onClick = { onTownClick() },
                        content = {
                            Icon(
                                imageVector = Icons.Rounded.LocationCity,
                                contentDescription = stringResource(id = R.string.towns),
                            )
                        },
                    )
                },
            )
        },
        content = { padding ->
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(top = padding.calculateTopPadding()),
                verticalArrangement = Arrangement.spacedBy(20.dp),
            ) {
                if (selectedTown != null) {
                    Text(
                        modifier = Modifier.padding(start = 30.dp),
                        text = selectedTown.name,
                        style = MaterialTheme.typography.displaySmall,
                    )
                }
                else {
                    Text(
                        modifier = Modifier.padding(start = 30.dp),
                        text = stringResource(id = R.string.town_not_selected),
                        style = MaterialTheme.typography.displaySmall,
                    )
                }

                forecast?.let { forecast ->
                    CurrentWeatherCard(currentWeather = forecast.currentWeather)

                    HourlyForecastList(hourlyForecastList = forecast.hourly)

                    DailyForecastList(dailyForecastList = forecast.daily)
                }
            }
        },
    )
}

@Composable
fun CurrentWeatherCard(
    currentWeather: CurrentWeather
) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(start = 25.dp),
        verticalArrangement = Arrangement.spacedBy(5.dp),
    ) {
        Text(text = "")

        Row(verticalAlignment = Alignment.Bottom) {
            Text(
                text = "${currentWeather.temperature}°",
                style = MaterialTheme.typography.displayLarge,
            )

            val weatherCode = WeatherCode from currentWeather.weatherCode
            weatherCode?.let { code ->
                Text(
                    modifier = Modifier.padding(bottom = 15.dp),
                    text = code.title,
                    style = MaterialTheme.typography.titleMedium,
                )
            }
        }

        Row {
            Text(
                text = "${currentWeather.maxTemperature}° / ${currentWeather.minTemperature}°",
                style = MaterialTheme.typography.titleMedium,
            )
        }
    }
}

@Composable
fun HourlyForecastList(
    hourlyForecastList: List<HourlyForecast>
) {
    LazyRow(
        modifier = Modifier.fillMaxWidth(),
        contentPadding = PaddingValues(horizontal = 15.dp),
        horizontalArrangement = Arrangement.spacedBy(15.dp),
    ) {
        items(hourlyForecastList.take(24)) { forecast ->
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.spacedBy(10.dp),
            ) {
                Text(
                    text = LocalDateTime.parse(
                        forecast.time,
                        DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm")
                    ).format(DateTimeFormatter.ofPattern("HH:mm"))
                )

                val weatherCode = WeatherCode from forecast.weatherCode
                weatherCode?.let { code ->
                    Icon(
                        imageVector = code.icon,
                        contentDescription = code.title,
                    )
                }

                Text(text = "${forecast.temperature}°")
            }
        }
    }
}

@Composable
fun DailyForecastList(
    dailyForecastList: List<DailyForecast>
) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 15.dp),
    ) {
        Column(
            modifier = Modifier.padding(10.dp),
            verticalArrangement = Arrangement.spacedBy(10.dp),
        ) {
            dailyForecastList.forEach { forecast ->
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween,
                ) {
                    Text(
                        modifier = Modifier.width(50.dp),
                        text = LocalDate.parse(
                            forecast.date,
                            DateTimeFormatter.ofPattern("yyyy-MM-dd")
                        ).format(DateTimeFormatter.ofPattern("d.MM")),
                    )

                    val weatherCode = WeatherCode from forecast.weatherCode
                    weatherCode?.let { code ->
                        Text(text = code.title)
                    }

                    Text(text = "${forecast.temperatureMax}°/${forecast.temperatureMin}°")
                }
            }
        }
    }
}

@Composable
@Preview(showBackground = true)
fun CurrentWeatherCardPreview() {
    WeatherTheme {
        CurrentWeatherCard(
            currentWeather = CurrentWeather(
                temperature = 12f,
                maxTemperature = 14f,
                minTemperature = 10f,
                weatherCode = WeatherCode.RAIN_HEAVY.code,
                time = "",
            ),
        )
    }
}

@Composable
@Preview(showBackground = true)
fun HourlyForecastListPreview() {
    WeatherTheme {
        HourlyForecastList(
            hourlyForecastList = listOf(
                HourlyForecast(
                    time = "2023-06-01T00:00",
                    temperature = 10f,
                    weatherCode = WeatherCode.RAIN_HEAVY.code,
                ),
                HourlyForecast(
                    time = "2023-06-01T01:00",
                    temperature = 15f,
                    weatherCode = WeatherCode.CLEAR_SKY.code,
                ),
            ),
        )
    }
}

@Composable
@Preview(showBackground = true)
fun DailyForecastListPreview() {
    WeatherTheme {
        DailyForecastList(
            dailyForecastList = listOf(
                DailyForecast(
                    date = "2023-06-01",
                    temperatureMin = 10f,
                    temperatureMax = 19f,
                    weatherCode = WeatherCode.CLEAR_SKY.code,
                ),
                DailyForecast(
                    date = "2023-06-12",
                    temperatureMin = 10f,
                    temperatureMax = 19f,
                    weatherCode = WeatherCode.OVERCAST.code,
                ),
            ),
        )
    }
}

@Composable
@Preview(showBackground = true)
fun MainPagePreview() {
    WeatherTheme {
        MainPage(
            selectedTown = null,
            forecast = Forecast(
                currentWeather = CurrentWeather(
                    temperature = 12f,
                    maxTemperature = 14f,
                    minTemperature = 10f,
                    weatherCode = WeatherCode.RAIN_HEAVY.code,
                    time = "",
                ),
                hourly = listOf(
                    HourlyForecast(
                        time = "2023-06-01T00:00",
                        temperature = 10f,
                        weatherCode = WeatherCode.RAIN_HEAVY.code,
                    ),
                    HourlyForecast(
                        time = "2023-06-01T01:00",
                        temperature = 15f,
                        weatherCode = WeatherCode.CLEAR_SKY.code,
                    ),
                ),
                daily = listOf(
                    DailyForecast(
                        date = "2023-06-01",
                        temperatureMin = 10f,
                        temperatureMax = 19f,
                        weatherCode = WeatherCode.CLEAR_SKY.code,
                    ),
                    DailyForecast(
                        date = "2023-06-12",
                        temperatureMin = 10f,
                        temperatureMax = 19f,
                        weatherCode = WeatherCode.OVERCAST.code,
                    ),
                ),
            ),
            onTownClick = { },
        )
    }
}
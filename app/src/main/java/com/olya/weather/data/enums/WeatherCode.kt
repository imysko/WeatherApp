package com.olya.weather.data.enums

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Thunderstorm
import androidx.compose.ui.graphics.vector.ImageVector
import com.olya.weather.ui.icons.Drizzle
import com.olya.weather.ui.icons.Foggy
import com.olya.weather.ui.icons.PartlyCloudy
import com.olya.weather.ui.icons.RainyLight
import com.olya.weather.ui.icons.RainyShowers
import com.olya.weather.ui.icons.Snowing
import com.olya.weather.ui.icons.SnowingShowers
import com.olya.weather.ui.icons.Sunny

enum class WeatherCode(
    val code: Int,
    val icon: ImageVector,
    val title: String
) {
    CLEAR_SKY(
        code = 0,
        icon = Icons.Sunny,
        title = "Ясно"
    ),

    MAINLY_CLEAR(
        code = 1,
        icon = Icons.PartlyCloudy,
        title = "В основном ясно"
    ),

    PARTLY_CLOUDY(
        code = 2,
        icon = Icons.PartlyCloudy,
        title = "Переменная облачность"
    ),

    OVERCAST(
        code = 3,
        icon = Icons.PartlyCloudy,
        title = "Пасмурно"
    ),

    FOGGY(
        code = 45,
        icon = Icons.Foggy,
        title = "Туман"
    ),

    RIME_FOG(
        code = 48,
        icon = Icons.Foggy,
        title = "Иней"
    ),

    DRIZZLE_LIGHT(
        code = 51,
        icon = Icons.Drizzle,
        title = "Лёгкий моросящий дождь"
    ),

    DRIZZLE_MODERATE(
        code = 53,
        icon = Icons.Drizzle,
        title = "Умеренный моросящий дождь"
    ),

    DRIZZLE_DENSE(
        code = 55,
        icon = Icons.Drizzle,
        title = "Густой моросящий дождь"
    ),

    FREEZING_DRIZZLE_LIGHT(
        code = 56,
        icon = Icons.Drizzle,
        title = "Лёгкий моросящий дождь"
    ),

    FREEZING_DRIZZLE_DENSE(
        code = 57,
        icon = Icons.Drizzle,
        title = "Густой моросящий дождь"
    ),

    RAIN_SLIGHT(
        code = 61,
        icon = Icons.RainyLight,
        title = "Небольшой дождь"
    ),

    RAIN_MODERATE(
        code = 63,
        icon = Icons.RainyLight,
        title = "Умеренный дождь"
    ),

    RAIN_HEAVY(
        code = 65,
        icon = Icons.RainyLight,
        title = "Сильный дождь"
    ),

    FREEZING_RAIN_LIGHT(
        code = 66,
        icon = Icons.RainyLight,
        title = "Небольшой дождь"
    ),

    FREEZING_RAIN_HEAVY(
        code = 67,
        icon = Icons.RainyLight,
        title = "Сильный дождь"
    ),

    SNOW_SLIGHT(
        code = 71,
        icon = Icons.Snowing,
        title = "Небольшой снег"
    ),

    SNOW_MODERATE(
        code = 73,
        icon = Icons.Snowing,
        title = "Умеренный снег"
    ),

    SNOW_HEAVY(
        code = 75,
        icon = Icons.Snowing,
        title = "Сильный снег"
    ),

    SNOW_GRAINS(
        code = 77,
        icon = Icons.Snowing,
        title = "Снег"
    ),

    RAIN_SHOWERS_SLIGHT(
        code = 80,
        icon = Icons.RainyShowers,
        title = "Небольшой ливень"
    ),

    RAIN_SHOWERS_MODERATE(
        code = 81,
        icon = Icons.RainyShowers,
        title = "Ливень"
    ),

    RAIN_SHOWERS_VIOLENT(
        code = 82,
        icon = Icons.RainyShowers,
        title = "Сильный ливень"
    ),

    SNOW_SHOWERS_SLIGHT(
        code = 85,
        icon = Icons.SnowingShowers,
        title = "Снегопад"
    ),

    SNOW_SHOWERS_HEAVY(
        code = 86,
        icon = Icons.SnowingShowers,
        title = "Сильный снегопад"
    ),

    THUNDERSTORM_SLIGHT(
        code = 95,
        icon = Icons.Outlined.Thunderstorm,
        title = "Небольшая гроза"
    ),

    THUNDERSTORM(
        code = 96,
        icon = Icons.Outlined.Thunderstorm,
        title = "Гроза"
    ),

    THUNDERSTORM_HAIL(
        code = 99,
        icon = Icons.Outlined.Thunderstorm,
        title = "Гроза с градом"
    );

    companion object {
        infix fun from(code: Int): WeatherCode? = WeatherCode.values().firstOrNull { it.code == code }
    }
}
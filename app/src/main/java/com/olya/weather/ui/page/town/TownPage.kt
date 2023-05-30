package com.olya.weather.ui.page.town

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.progcorp.weather.ui.theme.WeatherTheme

@Composable
fun TownPage(
    navController: NavHostController
) {

}

@Composable
@Preview(showBackground = true)
fun TownPagePreview() {
    WeatherTheme {
        TownPage(
            navController = rememberNavController(),
        )
    }
}
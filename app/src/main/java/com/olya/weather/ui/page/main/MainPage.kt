package com.olya.weather.ui.page.main

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.progcorp.weather.ui.theme.WeatherTheme

@Composable
fun MainPage(
    navController: NavHostController
) {
    Scaffold(
        topBar = {

        },
        content = { padding ->
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(padding),
                verticalArrangement = Arrangement.Center,
            ) {
            }
        },
    )
}

@Composable
@Preview(showBackground = true)
fun MainPagePreview() {
    WeatherTheme {
        MainPage(
            navController = rememberNavController(),
        )
    }
}
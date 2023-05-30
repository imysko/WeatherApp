package com.olya.weather.ui.component.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.olya.weather.ui.page.main.MainPage
import com.olya.weather.ui.page.town.TownPage
import com.olya.weather.util.NavDestinations

@Composable
fun NavGraph(
    navController: NavHostController
) {
    NavHost(
        navController = navController,
        startDestination = NavDestinations.MainPage
    ) {

        composable(
            route = NavDestinations.MainPage
        ) {
            MainPage(navController)
        }

        composable(
            route = NavDestinations.TownPage
        ) {
            TownPage(navController)
        }
    }
}
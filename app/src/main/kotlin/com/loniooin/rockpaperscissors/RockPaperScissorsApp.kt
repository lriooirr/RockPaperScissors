package com.loniooin.rockpaperscissors

import androidx.compose.foundation.layout.padding
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.loniooin.rockpaperscissors.navigation.Route
import com.loniooin.rockpaperscissors.ui.home.HomeScreen
import com.loniooin.rockpaperscissors.ui.theme.AppTheme

@Composable
fun RockPaperScissorsApp() {
    val navController = rememberNavController()
    AppTheme {
        Scaffold(content = {
            NavHost(
                navController = navController,
                startDestination = Route.HomeScreen,
                modifier = Modifier.padding(it)
            ) {
                mainScreenRoute(navController = navController)
            }
        })
    }
}

private fun NavGraphBuilder.mainScreenRoute(navController: NavController) {
    composable(Route.HomeScreen) {
        HomeScreen()
    }
}
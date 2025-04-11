// 6. Navigation einbauen:
// 3 Routen (Startseite, Liste, Detailansicht)
// basierend auf ID des Gärtners

package com.example.sexygaertner.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.merys_gaertner.screens.GaertnerDetailScreen
import com.example.merys_gaertner.screens.Startseite
import com.example.sexygaertner.data.Gaertner
import com.example.sexygaertner.screens.GaertnerListeScreen

@Composable
fun AppNavigation(navController: NavHostController, gaertnerList: List<Gaertner>) {
    NavHost(navController = navController, startDestination = "start") {
        composable("start") {
            Startseite(navController = navController)
        }
        composable("liste") {
            GaertnerListeScreen(
                gaertnerList = gaertnerList,
                onSelect = { selected ->
                    navController.navigate("detail/${selected.id}")
                },
                navController = navController
            )
        }
        composable("detail/{id}") { backStackEntry ->
            val id = backStackEntry.arguments?.getString("id")?.toIntOrNull()
            val gaertner = gaertnerList.find { it.id == id }
            gaertner?.let {
                GaertnerDetailScreen(gaertner = it, navController = navController)
            }
        }

    }
}
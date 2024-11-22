package com.example.jetpackcompose.Navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.example.jetpackcompose.Screens.AppChat
import com.example.jetpackcompose.Screens.AppInicio


@Composable
fun AppNavigation(){
    val navControlador= rememberNavController()
    NavHost(navController= navControlador,
        startDestination = AppScreen.InicioScreen.route){
        composable(AppScreen.InicioScreen.route) {
            AppInicio(navControlador)
        }
        composable(
            AppScreen.ChatScreen.route + "/{text}",
            arguments = listOf(navArgument(name = "text") {
                type = NavType.StringType
            })
        ) {
            it.arguments?.getString("text")?.let { it1 -> AppChat(navControlador, it1) }
        }
    }
}

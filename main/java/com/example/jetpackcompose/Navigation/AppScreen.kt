package com.example.jetpackcompose.Navigation

sealed class AppScreen (val route:String){
    object InicioScreen:AppScreen("InicioWhatsApp")
    object ChatScreen:AppScreen("ChatWhatsApp")
}
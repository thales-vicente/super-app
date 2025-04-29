package com.example.superapp.presentation.screens

sealed class Screen (val route: String){
    data object HomeScreen: Screen ( route = "Home_screen")
}
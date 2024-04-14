package com.example.myjetpackcompose

sealed class Routes(val route: String) {
    object Login : Routes("Login")
}
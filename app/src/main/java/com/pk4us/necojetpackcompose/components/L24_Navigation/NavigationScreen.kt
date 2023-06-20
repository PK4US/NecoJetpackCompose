package com.pk4us.necojetpackcompose.components.L24_Navigation

import android.annotation.SuppressLint
import android.content.Context
import androidx.compose.material.rememberScaffoldState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun NavigationScreen(context: Context) {
    val navController = rememberNavController()
    val coroutineScope = rememberCoroutineScope()
    val scaffoldState = rememberScaffoldState()

    NavHost(
        navController = navController,
        startDestination = "screen_1"
    ) {
        composable("screen_1") {
            Screen1 {
                navController.navigate("screen_2")
            }
        }
        composable("screen_2") {
            Screen2 {
                navController.navigate("screen_3")
            }
        }
        composable("screen_3") {
            Screen3 {
                navController.navigate("screen_1") {
                    popUpTo("screen_1") {
                        inclusive = true
                    }
                }
            }
        }
    }
}
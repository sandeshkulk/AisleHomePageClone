package com.example.aisle.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.aisle.presentation.NotesScreenUI
import com.example.aisle.presentation.OTPScreenUI
import com.example.aisle.presentation.PhoneNumberScreenUI

@Composable
fun NavGraph(navController: NavHostController){
    NavHost(navController = navController, startDestination = NavigationScreens.PhoneScreen.route){
        composable(NavigationScreens.PhoneScreen.route){
            PhoneNumberScreenUI(navController)
        }
        composable(NavigationScreens.OTPScreen.route){
            OTPScreenUI(navController)
        }
        composable(NavigationScreens.NotesScreen.route){
            NotesScreenUI(navController)
        }
    }
}
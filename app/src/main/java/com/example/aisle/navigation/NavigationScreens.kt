package com.example.aisle.navigation

sealed class NavigationScreens(var route:String){
    object PhoneScreen:NavigationScreens("PhoneNumberScreen")
    object OTPScreen:NavigationScreens("OTPScreen")
    object NotesScreen:NavigationScreens("NotesScreen")
}

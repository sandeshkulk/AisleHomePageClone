package com.example.aisle.navigation

import androidx.compose.material.Icon
import androidx.compose.ui.graphics.vector.ImageVector
import com.example.aisle.R

sealed class BottomNavigationItems(
    var route:String,
    var icon:Int,
    var title:String
){

    object Discover: BottomNavigationItems("discover",
        R.drawable.discover_icon,
        "Discover")

    object Notes: BottomNavigationItems("notes",
        R.drawable.notes_icon,
        "Notes")

    object Matches: BottomNavigationItems("matches",
        R.drawable.matches_icon,
        "Matches")

    object Profile: BottomNavigationItems("profile",
        R.drawable.profile_icon,
        "Profile")
}

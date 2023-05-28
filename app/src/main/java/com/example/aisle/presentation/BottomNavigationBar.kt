package com.example.aisle.presentation

import androidx.compose.foundation.layout.*
import androidx.compose.material.BottomNavigation
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.example.aisle.R
import com.example.aisle.navigation.BottomNavigationItems


@Composable
fun BottomNavigationBar(){
    val item = listOf(
        BottomNavigationItems.Discover,
        BottomNavigationItems.Notes,
        BottomNavigationItems.Matches,
        BottomNavigationItems.Profile
    )
    BottomNavigation(
        backgroundColor = Color.Transparent, modifier = Modifier.fillMaxWidth().height(80.dp)
      //  contentColor = Color.Black
    ) {
    val navBackStackEntry by rememberNavController().currentBackStackEntryAsState()
        val currentRoute = navBackStackEntry?.destination?.route
        item.forEach{item ->
            BottomNavigationItem(
                selected = currentRoute==item.route,
                icon = { Icon(painter = painterResource(id = item.icon),
                    contentDescription = "", tint = Color.Black)},
                label = { Text(text = item.title, color = Color.Black)},
                selectedContentColor = Color.Black,
                unselectedContentColor = Color.White, alwaysShowLabel = true, onClick = {}
            )

        }

    }
}
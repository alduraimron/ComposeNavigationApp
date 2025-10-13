package com.example.composenavigationapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.navigation.compose.rememberNavController
import com.example.composenavigationapp.ui.theme.ComposeNavigationAppTheme
import com.example.composenavigationapp.ui.navigation.RootNavGraph

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeNavigationAppTheme {
                val navController = rememberNavController()
                RootNavGraph(navController = navController)
            }
        }
    }
}
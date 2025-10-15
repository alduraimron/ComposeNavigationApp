package com.example.composenavigationapp.ui.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Groups
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun NegroScreen() {
    val contributors = listOf(
        "225150207111004" to "Mochammad Zainur Ridho",
        "235150201111018" to "Aldura Armanu Shaufa Imron",
        "235150207111052" to "Syifani Adillah Salsabila",
        "235150200111018" to "Muhammad Fatih Satrio"
    )
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Icon(
            imageVector = Icons.Filled.Groups,
            contentDescription = "contributors",
            modifier = Modifier.size(50.dp)
        )
        contributors.forEach { it ->
            Text(
                text = it.second,
                style = MaterialTheme.typography.headlineSmall
            )
            Text(
                text = "(${it.first})",
                style = MaterialTheme.typography.headlineSmall
            )
        }
    }
}

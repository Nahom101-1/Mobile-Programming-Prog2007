package com.example.hobbyapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.example.hobbyapplication.ui.theme.theme.HobbyApplicationTheme
import com.example.hobbyapplication.ui.theme.screens.Homescreen

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            HobbyApplicationTheme {
                Homescreen()
            }
        }
    }
}
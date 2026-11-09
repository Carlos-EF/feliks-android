package com.feliks.app

// Fundamental Android resources
import android.os.Bundle

// Responsible class that represent a Android screen
import androidx.activity.ComponentActivity

// Enables building with Jetpack Compose
import androidx.activity.compose.setContent

// Interface elements
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding

// Material Design 3 visual components
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.darkColorScheme

// Interface state management
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue

// Graphics | Posicionings resources
import androidx.compose.ui.Aligment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

// Color pallets
// para estudo pessoal: val => valor constante que não pode ser reatribuida.
private val FeliksColors = darkColorScheme(
    // Primary Color
    primary = Color(0xFFE3A857),

    // Color used with primary
    onPrimary = Color(0xFF12161C),

    // Background App Color
    background = Color(0xFF0C0F13),

    // Text on top of background
    onBackground = Color(0xFFFFFFFF),

    // Surface components Colors
    surface = Color(0xFF12161C),

    // Text on top of surface
    onSurface = Color(0xFFFFFFFF)
)

// Main APP Android
class MainActivity : ComponentActivity() {
    // When starts a screen
    override fun onCreate(savedInstanceState: Bundle?) {

        // Starts class
        super.onCreate(savedInstanceState)

        // Make the interface with Compose
        setContent {

            // Apply the color scheme
            MaterialTheme(
                colorScheme = FeliksColors
            ) {
                // Surface
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    // Show the first screen
                    WelcomeScreen()
                }
            }
        }
    }
}
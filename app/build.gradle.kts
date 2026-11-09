plugins {
    // Android
    id("com.android.application")

    // Jetpack Compose
    id("org.jetbrains.kotlin.plugin.compose")
}

android {
    // Identifier
    namespace = "com.feliks.app"

    // SDK version
    compileSdk = 36

    defaultConfig {
        // Unique identifier
        applicationId = "com.feliks.app"

        // Min Android version
        minSdk = 26

        // Target Android version
        targetSdk = 36

        // intern number version
        versionCode = 1

        // User version
        versionName = "1.0"
    }

    // Enables the hability to build with Jetpack Compose
    buildFeatures {
        compose = true
    }
}

dependencies {
    // BOM (keep Compose versions compatible)
    val composeBom = platform(
        "androidx.compose:compose-bom:2026.05.01"
    )

    implementation(composeBom)

    // Android Activity => Jetpack Compose
    implementation("androidx.activity:activity-compose:1.13.0")

    // Material 3
    implementation("androidx.compose.material3:material3")

    // Jetpack Compose - Importants components
    implementation("androidx.compose.ui:ui")

    // Compose Tooling Preview
    implementation("androidx.compose.ui:ui-tooling-preview")

    // DEV tools
    debugImplementation("androidx.compose.ui:ui-tooling")
}
plugins {
    // Android
    id("com.android.application") version "9.5.0" apply false

    // Jetpack Compose
    id("org.jetbrains.kotlin.plugin.compose") version "2.4.10" apply false
}

dependecies {

    // BOM (keep Compose versions compatible)
    val composeBom = platform(
        "androidx.compose:compose-bom:2026-09-00"
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

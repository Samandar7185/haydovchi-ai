plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
    id("com.google.dagger.hilt.android")
}

android {
    namespace = "uz.haydovchi.ai"
    compileSdk = 34
    defaultConfig {
        applicationId = "uz.haydovchi.ai"
        minSdk = 26
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"
    }
}

dependencies {
    implementation("androidx.compose.ui:ui")
    // more dependencies
}
plugins {
    alias(libs.plugins.kotlin.android)
    alias(libs.plugins.android.library)
    alias(libs.plugins.kotlin.serialization)
}

android {
    namespace = "com.example.handson.network"
    compileSdk = 33

    defaultConfig {
        minSdk = 24
        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
    kotlinOptions {
        jvmTarget = "17"
    }
}

dependencies {

    implementation(libs.androidx.core)
    implementation(libs.androidx.appcompat)
    implementation(libs.androidx.material)
    implementation(libs.kotlin.serialization.json)

    implementation(libs.di.koin.core)

    implementation(libs.network.ktor.serialization)
    implementation(libs.network.ktor.content.negotiation)
    implementation(libs.network.ktor.client)
    implementation(libs.network.ktor.loggin)
    implementation(libs.androidx.paging.common.ktx)

    testImplementation(libs.test.junit4)
    androidTestImplementation(libs.test.android.junit.ktx)
    androidTestImplementation(libs.test.android.espresso)
}
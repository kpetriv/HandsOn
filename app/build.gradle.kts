plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.kotlin.android)
    id(libs.plugins.firebase.gms.get().pluginId)
}

android {
    namespace = "com.example.handson"
    compileSdk = 33

    defaultConfig {
        applicationId = "com.example.handson"
        minSdk = 24
        targetSdk = 33
        versionCode = 1
        versionName = "1.0"
        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }

    kotlinOptions {
        jvmTarget = "11"
    }

    android.sourceSets.all {
        java.srcDir("src/$name/kotlin")
    }

    buildTypes {
        release {
            isMinifyEnabled = true
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }

    buildFeatures {
        compose = true
    }

    composeOptions {
        kotlinCompilerExtensionVersion = "1.4.7"
    }
}

dependencies {
    implementation(project(":network"))

    implementation(libs.bundles.androidx)

    testImplementation(libs.test.junit4)
    androidTestImplementation(libs.test.android.junit.ktx)
    androidTestImplementation(libs.test.android.espresso)

    implementation(libs.di.koin.core)
    implementation(libs.di.koin.android.compat)
    implementation(libs.di.koin.android)
    implementation(libs.di.koin.androidx.compose)
    implementation(libs.di.koin.androidx.navigation)

    val composeBom = platform(libs.compose.bom)
    implementation(composeBom)
    implementation(libs.bundles.compose)

    androidTestImplementation(composeBom)
    debugImplementation(libs.compose.ui.tooling)

    val firebaseBom = platform(libs.firebase.bom)
    implementation(firebaseBom)
    implementation(libs.firebase.analytics)
}
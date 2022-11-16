plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.kotlin.android)
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

    buildTypes {
        getByName("release") {
            isMinifyEnabled = true
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
}

dependencies {
    implementation(libs.core)
    implementation(libs.appcompat)
    implementation(libs.material)
    implementation(libs.constraint.layout)

    testImplementation(libs.junit4)

    androidTestImplementation(libs.test.junit.ktx)
    androidTestImplementation(libs.test.espresso)
}
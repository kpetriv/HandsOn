buildscript {
    repositories {
        google()
        mavenCentral()
    }
    dependencies {
        classpath(libs.firebase.gms)
    }
}

plugins {
    alias(libs.plugins.android.application) apply false
    alias(libs.plugins.android.library) apply false
    alias(libs.plugins.kotlin.android) apply false
    alias(libs.plugins.kotlin.serialization) apply false
    alias(libs.plugins.firebase.gms) apply false
}
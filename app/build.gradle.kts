plugins {
    kotlin("android")
    id("com.android.application")
}

android {
    compileSdk = BuildVersion.compileSdk

    defaultConfig {
        applicationId = BuildVersion.applicationId
        minSdk = BuildVersion.minSdk
        targetSdk = BuildVersion.targetSdk
        versionCode = BuildVersion.versionCode
        versionName = BuildVersion.versionName
    }

    buildTypes {
        getByName("release") {
            isMinifyEnabled = true
            isShrinkResources = true
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"))
        }
    }

    buildFeatures {
        compose = true
    }

    composeOptions {
        kotlinCompilerExtensionVersion = "1.2.0"
    }
}

dependencies {
    implementation(Dep.AndroidX.Core.ktx)
    implementation(Dep.AndroidX.Core.splashscreen)
    implementation(Dep.AndroidX.Compose.ui)
    implementation(Dep.AndroidX.Compose.uiTooling)
    implementation(Dep.AndroidX.Compose.runtime)
    implementation(Dep.AndroidX.Compose.material)
    implementation(Dep.AndroidX.Compose.materialIcon)
    implementation(Dep.AndroidX.Compose.activity)
    implementation(Dep.AndroidX.Compose.animation)
    implementation(Dep.AndroidX.Compose.foundation)
    implementation(Dep.Google.Accompanist.sysUiController)
    implementation(Dep.Google.Accompanist.placeholderMaterial)
}
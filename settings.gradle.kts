include(":app")

pluginManagement {
    repositories {
        google()
        gradlePluginPortal()
    }

    plugins {
        val kotlinVersion = extra["kotlin.version"] as String
        val androidVersion = extra["android.version"] as String

        kotlin("android").version(kotlinVersion)
        id("com.android.library").version(androidVersion)
        id("com.android.application").version(androidVersion)
    }
}

dependencyResolutionManagement {
    repositories {
        google()
        mavenCentral()
    }
}
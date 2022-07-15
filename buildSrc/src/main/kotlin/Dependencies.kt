object BuildVersion {
    const val minSdk = 21
    const val targetSdk = 32
    const val compileSdk = 32
    const val versionCode = 1
    const val versionName = "Alpha01"
    const val applicationId = "com.loniooin.rockpaperscissors"
}

object Dep {
    object AndroidX {
        object Core {
            private const val KTX_VERSION = "1.8.0"
            private const val SPLASHSCREEN_VERSION = "1.0.0-rc01"

            const val ktx = "androidx.core:core-ktx:$KTX_VERSION"
            const val splashscreen = "androidx.core:core-splashscreen:$SPLASHSCREEN_VERSION"
        }

        object Compose {
            private const val COMPOSE_VERSION = "1.2.0-rc03"
            private const val ACTIVITY_VERSION = "1.5.0"

            const val ui = "androidx.compose.ui:ui:$COMPOSE_VERSION"
            const val uiTooling = "androidx.compose.ui:ui-tooling:$COMPOSE_VERSION"
            const val runtime = "androidx.compose.runtime:runtime:$COMPOSE_VERSION"
            const val material = "androidx.compose.material:material:$COMPOSE_VERSION"
            const val materialIcon =
                "androidx.compose.material:material-icons-core:$COMPOSE_VERSION"
            const val activity = "androidx.activity:activity-compose:$ACTIVITY_VERSION"
            const val animation = "androidx.compose.animation:animation:$COMPOSE_VERSION"
            const val foundation = "androidx.compose.foundation:foundation:$COMPOSE_VERSION"
        }
    }

    object Google {
        object Accompanist {
            private const val ACCOMPANIST_VERSION = "0.24.13-rc"

            const val sysUiController =
                "com.google.accompanist:accompanist-systemuicontroller:$ACCOMPANIST_VERSION"
            const val placeholderMaterial =
                "com.google.accompanist:accompanist-placeholder-material:$ACCOMPANIST_VERSION"
        }
    }
}

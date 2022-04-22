
plugins { listPlugins.forEach { id(it) }  }

android {
    compileSdk = 31
    defaultConfig {
        applicationId = "com.example.youtubeplayer"; minSdk = 26; targetSdk = 31; versionCode = 1
        versionName = "1.0"
        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        vectorDrawables { useSupportLibrary = true }
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
            with(JavaVersion.VERSION_11) { sourceCompatibility = this; targetCompatibility = this }
        }

        kotlinOptions {
            jvmTarget = "11"
            freeCompilerArgs = listOf("-Xjvm-default=all", "-opt-in=kotlin.RequiresOptIn")
        }

        buildFeatures { compose = true; viewBinding = true }

        composeOptions { kotlinCompilerExtensionVersion = composeVersion }
        packagingOptions { resources { excludes += "/META-INF/{AL2.0,LGPL2.1}" } }
    }
}

repositories{ myRepository() }

dependencies {
    implementation (files("libs\\YouTubeAndroidPlayerApi.jar"))
    impl() }


repositories { myRepository() }

dependencies {
    impl()
}



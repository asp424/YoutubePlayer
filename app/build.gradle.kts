
plugins { pluginsList.forEach { id(it) } }
dependencies { implementations(files(localPath)) }
android {
    compileSdk = 31
    defaultConfig {
        applicationId = appId
        minSdk = 26
        targetSdk = 31
        versionCode = 1
        versionName = appVersion
        testInstrumentationRunner = testRunner
        vectorDrawables { useSupportLibrary = true }
        buildTypes {
            release {
                isMinifyEnabled = false
                proguardFiles(getDefaultProguardFile(proGName), proGRules)
            }
        }
        compileOptions { sourceCompatibility = javaVersion; targetCompatibility = javaVersion }
        kotlinOptions { jvmTarget = jvm; freeCompilerArgs = argsList }
        buildFeatures { viewBinding = true }
        packagingOptions { resources { excludes += res } }
    }
}






plugins {
    id ("com.android.application")
    id ("kotlin-android")
    id("com.hiya.jacoco-android")
}

android {
    compileSdk = (ConfigData.compileSdkVersion)
    buildToolsVersion = (ConfigData.buildToolsVersion)

    defaultConfig {
        applicationId = "com.team07.kotlindsl_jacocodemo"
        minSdk = (ConfigData.minSdkVersion)
        targetSdk = (ConfigData.targetSdkVersion)
        versionCode = (ConfigData.versionCode)
        versionName  = (ConfigData.versionName)

        testInstrumentationRunner  = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
        getByName("debug"){
            isTestCoverageEnabled = true
        }
    }
}

dependencies {
    implementation(Deps.coreKTX)
    implementation(Deps.appCompat)
    implementation(Deps.materialDesign)
    implementation(Deps.constraintLayout)
    testImplementation(Testlibs.junit)
}
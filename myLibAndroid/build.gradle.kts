plugins {
    id("com.android.library")
    id("kotlin-android")
    id("com.hiya.jacoco-android")
}

android {
    compileSdk = (ConfigData.compileSdkVersion)
    buildToolsVersion = (ConfigData.buildToolsVersion)
}

dependencies {
    implementation(Deps.coreKTX)
    implementation(Deps.appCompat)
    implementation(Deps.materialDesign)
    implementation(Deps.constraintLayout)
    testImplementation(Testlibs.junit)
}
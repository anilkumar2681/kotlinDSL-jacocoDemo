import org.gradle.kotlin.dsl.`kotlin-dsl`

plugins {
    `kotlin-dsl`
}
repositories {
    mavenCentral()
    jcenter()
    google()
    maven {
        url = uri("https://plugins.gradle.org/m2/")
    }
}

dependencies {
    implementation("org.jacoco:org.jacoco.core:0.8.7")
    implementation("com.hiya:jacoco-android:0.2")
}

plugins {
    id("com.android.library")
    id("org.jetbrains.kotlin.android")
    id("maven-publish")
}

android {
    compileSdk = 33
    namespace="com.hsb.loadialog"
    defaultConfig {
        minSdk = 24
        targetSdk = 33
        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }

    kotlinOptions {
        jvmTarget = "1.8"
    }

    buildFeatures {
        viewBinding = true
    }
}

dependencies {
    implementation("androidx.core:core-ktx:1.9.0")
    implementation("androidx.appcompat:appcompat:1.6.1")
    implementation("com.google.android.material:material:1.10.0")
    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.5")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")
}

publishing {
    publications {
        create<MavenPublication>("mavenJava") {

            groupId = "com.hsb.loadialog"
            artifactId = "loadialog"
            version = "1.0.1"

            pom {
                name.set("My Face Recognition Library")
                description.set("A library for face recognition")
                licenses {
                    license {
                        name.set("Kabootar")
                        url.set("https://syedhaseeb1.github.io")
                    }
                }
            }
        }
    }

    repositories {
        mavenCentral()
    }
}

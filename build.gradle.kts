plugins {
    kotlin("jvm") version "1.4.20-RC-227"
    application
}

group = "dev.omainegra"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
    maven("https://dl.bintray.com/kotlin/kotlin-eap")
    maven("https://dl.bintray.com/kotlin/kotlin-dev")
}

dependencies {
    implementation("io.kotlintest:kotlintest-core:3.4.2")
    implementation("io.arrow-kt:arrow-data:0.8.2")
}

kotlin {
    target.compilations.all {
        kotlinOptions.jvmTarget = "1.8"
    }
}

application {
    mainClassName = "MainKt"
}
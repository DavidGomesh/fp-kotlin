plugins {
    kotlin("jvm") version "1.8.0"
    application
}

group = "org"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))
    testImplementation("io.kotest:kotest-runner-junit5:5.6.2")
    testImplementation("org.jetbrains.kotlinx:kotlinx-collections-immutable:0.3.5")
}

tasks.test {
    useJUnitPlatform()
}

kotlin {
    jvmToolchain(11)
}

application {
    mainClass.set("MainKt")
}
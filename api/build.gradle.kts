/*
 * This file was generated by the Gradle 'init' task.
 */

plugins {
    id("gradle.hot.reload.kotlin-application-conventions")
}

dependencies {
    implementation(project(":lib"))
}

application {
    // Define the main class for the application.
    mainClass.set("gradle.hot.reload.api.AppKt")
}
/*
 * This file was generated by the Gradle 'init' task.
 *
 * This generated file contains a sample Java application project to get you started.
 * For more details on building Java & JVM projects, please refer to https://docs.gradle.org/8.7/userguide/building_java_projects.html in the Gradle documentation.
 */

plugins {
    // Apply the application plugin to add support for building a CLI application in Java.
    id("jacoco")
    id("java")
    id("application")
    id("org.sonarqube") version "5.0.0.4638"
}

description = "Example of SonarQube Scanner for Gradle Usage"
version = 1.0

sonarqube {
    properties {
        property("sonar.projectName", "GitHub / Actions / monorepo Gradle")
        property("sonar.projectKey", "demo:github-actions-mono-gradle")
        property("sonar.sources", "src/main")
        property("sonar.tests", "src/test")
    }
}

repositories {
    // Use Maven Central for resolving dependencies.
    mavenCentral()
}

dependencies {
    // Use JUnit test framework.
    testImplementation(libs.junit)

    // This dependency is used by the application.
    implementation(libs.guava)
}

// Apply a specific Java toolchain to ease working on different environments.
java {
    toolchain {
        languageVersion = JavaLanguageVersion.of(17)
    }
}

application {
    // Define the main class for the application.
    mainClass = "org.example.App"
}

// tasks.test {
//     // Use JUnit Platform for unit tests.
//     useJUnitPlatform()
//     finalizedBy(tasks.jacocoTestReport)
// }

// jacoco {
//     toolVersion = "0.8.11"
// }

// tasks.jacocoTestReport {
//     dependsOn(tasks.test)
//     reports {
//         xml.required = true
//         html.outputLocation = layout.buildDirectory.dir("jacocoHtml")
//     }
// }
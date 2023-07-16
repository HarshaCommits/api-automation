import io.qameta.allure.gradle.task.AllureReport

plugins {
    kotlin("jvm") version "1.5.10"
    id("io.qameta.allure") version "2.8.1"
}

group = "thoughtworks.harsha"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation(kotlin("stdlib"))
    implementation("io.rest-assured:rest-assured:5.3.0")
    implementation("io.rest-assured:rest-assured:5.3.0")
    testImplementation("io.qameta.allure:allure-junit5:2.13.8")
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.7.0")
    implementation("com.fasterxml.jackson.module:jackson-module-kotlin:2.15.2")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:5.7.0")
}

tasks.test {
    useJUnitPlatform()
    testLogging {
        events("passed", "skipped", "failed")
    }
}

allure {
    version = "2.13.8"
    autoconfigure = true
}
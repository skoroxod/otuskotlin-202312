plugins {
    kotlin("jvm") apply false
}

group = "ru.skoroxod.urdm"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

subprojects {
    repositories {
        mavenCentral()
    }
    group = rootProject.group
    version = rootProject.version
}
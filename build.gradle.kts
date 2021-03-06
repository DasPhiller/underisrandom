import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") version "1.6.10"
    id("io.papermc.paperweight.userdev") version "1.3.4-SNAPSHOT"
}

group = "de.philgamer"
version = "1.0.0"

repositories {
    mavenCentral()
}

dependencies {
      // PaperMC Dependency
    paperDevBundle("1.18.1-R0.1-SNAPSHOT")
    
    //Helpings
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.6.0")
    
    // KSpigot dependency
    implementation("net.axay", "kspigot", "1.18.0")
}

tasks {
    withType<KotlinCompile> {
        kotlinOptions {
            jvmTarget = "17"
        }
    }
}

java {
    sourceCompatibility = JavaVersion.VERSION_17
}

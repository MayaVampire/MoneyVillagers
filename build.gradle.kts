import java.net.URI

plugins {
    id("fabric-loom") version "1.2.+"
}

group = "net.moneyvillagers"
version = "1.0.0"
java.sourceCompatibility = JavaVersion.VERSION_17

repositories {
    mavenCentral()
    maven { url = URI("https://maven.fabricmc.net/") }
}

dependencies {
    minecraft("com.mojang:minecraft:1.20.1")
    mappings("net.fabricmc:yarn:1.20.1+build.5:v2")
    modImplementation("net.fabricmc:fabric-loader:0.15.5")
    modImplementation("net.fabricmc.fabric-api:fabric-api:0.86.0+1.20.1")
}

tasks.withType<JavaCompile> {
    options.release.set(17)
}

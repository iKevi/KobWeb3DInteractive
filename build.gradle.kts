plugins {
    kotlin("jvm") version "1.9.10"
    id("org.springframework.boot") version "3.1.4"
    id("io.spring.dependency-management") version "1.1.3"
    id("com.varabyte.kobweb") version "0.10.0"
}

group = "com.fwd"
version = "0.0.1-SNAPSHOT"
java.sourceCompatibility = JavaVersion.VERSION_17

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.springframework.boot:spring-boot-starter-web")
    implementation("org.springframework.boot:spring-boot-starter-data-jpa")
    implementation("org.jetbrains.kotlin:kotlin-reflect")
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")
    implementation("com.varabyte.kobweb:kobweb-core:0.10.0")
    implementation("com.varabyte.kobweb:kobweb-spring-boot-starter:0.10.0")
    implementation("com.varabyte.kobweb:kobweb-openrendr:0.10.0")
    testImplementation("org.springframework.boot:spring-boot-starter-test")
}

tasks.withType<Test> {
    useJUnitPlatform()
}

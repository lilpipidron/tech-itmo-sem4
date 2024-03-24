plugins {
    id("java")
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.9.1"))
    testImplementation("org.junit.jupiter:junit-jupiter")

    implementation("org.hibernate:hibernate-core:5.4.32.Final")
    implementation("org.postgresql:postgresql:42.7.0")
    implementation("org.flywaydb:flyway-core:7.15.0")

    implementation("org.hibernate:hibernate-core:5.4.32.Final")

    implementation(project(":model"))
}

tasks.test {
    useJUnitPlatform()
}
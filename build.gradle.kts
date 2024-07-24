plugins {
    id("java-library")
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}


dependencies {
    //testImplementation(platform("org.junit:junit-bom:5.10.0"))
    testImplementation("org.junit.jupiter:junit-jupiter:5.10.3")
    testImplementation("org.seleniumhq.selenium:selenium-java:4.22.0")
    testImplementation("org.seleniumhq.selenium:selenium-chrome-driver:4.23.0")

}

tasks.test {
    useJUnitPlatform{}

}
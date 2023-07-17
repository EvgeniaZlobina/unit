plugins {
    id("java")
}

group = "ru.netology"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    //testImplementation(platform("org.junit:junit-bom:5.9.1"))
    testImplementation ("org.junit.jupiter', name: 'junit-jupiter', version: '5.10.0-RC1")

}

tasks.test {
    useJUnitPlatform()
}
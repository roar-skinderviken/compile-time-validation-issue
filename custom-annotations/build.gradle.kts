plugins {
    kotlin("jvm") version "2.0.0"
}

kotlin { jvmToolchain(21) }

dependencies {
    compileOnly("io.micronaut.validation:micronaut-validation:4.6.0")
}
plugins {
    kotlin("jvm") version "2.0.0"
    id("io.micronaut.application") version "4.4.0"
}

kotlin { jvmToolchain(21) }

dependencies {
    annotationProcessor(project(":custom-annotations"))
    compileOnly(project(":custom-annotations"))
    compileOnly("io.micronaut.validation:micronaut-validation")
}

application {
    mainClass = "no.javatec.ApplicationKt"
}

micronaut {
    runtime("netty")
    processing {
        incremental(true)
        annotations("no.javatec.*")
    }
}

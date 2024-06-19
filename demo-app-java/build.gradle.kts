plugins {
    id("java")
    id("io.micronaut.application") version "4.4.0"
}

dependencies {
    annotationProcessor(project(":custom-annotations"))
    compileOnly(project(":custom-annotations"))
    compileOnly("io.micronaut.validation:micronaut-validation")
}

application {
    mainClass = "no.javatec.java.Application"
}

java {
    sourceCompatibility = JavaVersion.toVersion("21")
    targetCompatibility = JavaVersion.toVersion("21")
}

micronaut {
    runtime("netty")
    testRuntime("junit5")
    processing {
        incremental(true)
        annotations("no.javatec.*")
    }
}

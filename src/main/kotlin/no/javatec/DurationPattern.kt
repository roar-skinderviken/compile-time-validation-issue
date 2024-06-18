package no.javatec

import jakarta.validation.Constraint
import kotlin.annotation.AnnotationRetention.RUNTIME

@Retention(RUNTIME)
@Constraint(validatedBy = [])
annotation class DurationPattern(
    val message: String = "invalid duration ({validatedValue})" // (2)
)
package no.javatec.annotations

import jakarta.validation.Constraint
import kotlin.annotation.AnnotationRetention.RUNTIME

@Retention(RUNTIME)
@Constraint(validatedBy = []) // <1>
annotation class DurationPattern(
    val message: String = "invalid duration ({validatedValue})" // <2>
)

package no.javatec

import jakarta.validation.Constraint

@Retention(AnnotationRetention.RUNTIME)
@Constraint(validatedBy = [])
annotation class TimeOff(
    @DurationPattern val maxDuration: String
)
package no.javatec

import io.micronaut.context.annotation.Factory
import io.micronaut.validation.validator.constraints.ConstraintValidator
import jakarta.inject.Singleton
import java.time.Duration

@Factory
class MyValidationFactory {

    @Singleton
    fun timeOffValidator(): ConstraintValidator<TimeOff, String> =
        ConstraintValidator { value, annotationValue, _ ->
            val maxDurationAsString = annotationValue.getRequiredValue("maxDuration", String::class.java)

            value == null
                    || (
                    value.matches("^P\\d+D$".toRegex())
                            && Duration.parse(value) <= Duration.parse(maxDurationAsString)
                    )
        }
}
package no.javatec

import io.micronaut.core.annotation.AnnotationValue
import io.micronaut.validation.validator.constraints.ConstraintValidator
import io.micronaut.validation.validator.constraints.ConstraintValidatorContext

class DurationPatternValidator : ConstraintValidator<DurationPattern, CharSequence> {
    override fun isValid(
        value: CharSequence?,
        annotationMetadata: AnnotationValue<DurationPattern>,
        context: ConstraintValidatorContext): Boolean {
        return value == null || value.toString().matches("^P?\\d+D$".toRegex())
    }
}
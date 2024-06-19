package no.javatec

import no.javatec.annotations.DurationPattern
import kotlin.annotation.AnnotationRetention.RUNTIME

@Retention(RUNTIME)
annotation class TimeOff(
    @DurationPattern val duration: String
)

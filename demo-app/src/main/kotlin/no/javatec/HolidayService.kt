package no.javatec

import jakarta.inject.Singleton
import jakarta.validation.constraints.NotBlank
import no.javatec.TimeOff
import no.javatec.annotations.DurationPattern
import java.time.Duration

@Singleton
@TimeOff("junk")
open class HolidayService {

    @TimeOff("junk")
    open fun startHoliday(@NotBlank person: String,
                          @DurationPattern duration: String): String {
        val d = Duration.parse(duration)
        return "Person $person is off on holiday for ${d.toMinutes()} minutes"
    }
}

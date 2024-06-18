package no.javatec

import jakarta.inject.Singleton
import jakarta.validation.constraints.NotBlank
import java.time.Duration

@Singleton
open class HolidayService {

    open fun startHoliday(
        @NotBlank person: String,
        //@TimeOff(maxDuration = "P5D") duration: String
        @TimeOff(maxDuration = "rubbish") duration: String // should give compile time error
    ): String = "Person $person is off on holiday for ${Duration.parse(duration).toDays()} days"
}
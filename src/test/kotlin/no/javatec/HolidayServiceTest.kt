package no.javatec

import io.kotest.assertions.throwables.shouldThrow
import io.kotest.core.spec.style.BehaviorSpec
import io.micronaut.test.extensions.kotest5.annotation.MicronautTest
import jakarta.validation.ConstraintViolationException

@MicronautTest
class HolidayServiceTest(
    sut: HolidayService
) : BehaviorSpec({

    Given("HolidayService") {
        When("too many holidays, expect exception") {
            shouldThrow<ConstraintViolationException> {
                sut.startHoliday("Fred", "P6D")
            }
        }
    }
})
package time

import spock.lang.Specification
import spock.lang.Unroll

import java.time.Duration
import java.time.temporal.ChronoUnit

class CreatingADurationFromNumberSpec extends Specification {
    @Unroll
    def "has the correct duration"() {
        expect:
            actual == Duration.of(value, unit)

        where:
            value | unit                 | actual
            20    | ChronoUnit.NANOS     | 20.nanos()
            37    | ChronoUnit.MILLIS    | 37.millis()
            15    | ChronoUnit.SECONDS   | 15.seconds()
            154   | ChronoUnit.HOURS     | 154.hours()
            76    | ChronoUnit.HALF_DAYS | 76.halfDays()
            34    | ChronoUnit.DAYS      | 34.days()
    }
}

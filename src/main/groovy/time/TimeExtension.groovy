package time

import java.time.Duration
import java.time.temporal.ChronoUnit

class TimeExtension {
    static Duration nanos(Number self) {
        return Duration.of(self.longValue(), ChronoUnit.NANOS)
    }

    static Duration millis(Number self) {
        return Duration.of(self.longValue(), ChronoUnit.MILLIS)
    }

    static Duration seconds(Number self) {
        return Duration.of(self.longValue(), ChronoUnit.SECONDS)
    }

    static Duration minutes(Number self) {
        return Duration.of(self.longValue(), ChronoUnit.MINUTES)
    }

    static Duration hours(Number self) {
        return Duration.of(self.longValue(), ChronoUnit.HOURS)
    }

    static Duration halfDays(Number self) {
        return Duration.of(self.longValue(), ChronoUnit.HALF_DAYS)
    }

    static Duration days(Number self) {
        return Duration.of(self.longValue(), ChronoUnit.DAYS)
    }
}
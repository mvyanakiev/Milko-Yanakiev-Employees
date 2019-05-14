package utils;

import java.util.Date;
import java.util.concurrent.TimeUnit;

class PeriodCalculator {

    static long getPeriod(Date firstStart, Date firstEnd, Date secondStart, Date secondEnd) {

        Date maxStart = firstStart.getTime() > secondStart.getTime() ? firstStart : secondStart;
        Date minEnd = firstEnd.getTime() < secondEnd.getTime() ? firstEnd : secondEnd;

        long interval = minEnd.getTime() - maxStart.getTime();

        if (interval > 0) {
            return TimeUnit.DAYS.convert(interval, TimeUnit.MILLISECONDS);
        } else {
            return 0;
        }
    }
}
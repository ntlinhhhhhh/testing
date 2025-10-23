package com.example;

import java.time.LocalTime;


public class calculateBusFareDF {
    public static final LocalTime START_TIME = LocalTime.of(6, 0);
    public static final LocalTime END_TIME   = LocalTime.of(22, 0);

    public static final LocalTime MORNING_END   = LocalTime.of(12, 0);
    public static final LocalTime AFTERNOON_END = LocalTime.of(18, 0);

    private calculateBusFareDF() { }

    public static int getBusFare(int age, LocalTime time) {
        if (age < 0) {
            return -1;
        }

        if (age > 100) {
            return -1;
        }

        if (time.isBefore(START_TIME)) {
            return -1;
        }

        if (time.isAfter(END_TIME)) {
            return -1;
        }

        if (age < 6) {
                return 0;
        } else {
            if (age < 60) {
                if (time.isBefore(MORNING_END)) {
                    return 10000;
                } else {
                    if (time.isBefore(AFTERNOON_END)) {
                        return 15000;
                    }
                    else {
                        return 20000;
                    }
                }
            } else {
                if (time.isBefore(MORNING_END)) {
                    return 8000;
                } else {
                    if (time.isBefore(AFTERNOON_END)) {
                        return 12000;
                    }
                    else {
                        return 15000;
                    }
                }
            }
        }
    }
}

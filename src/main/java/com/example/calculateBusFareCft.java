package com.example;
import java.time.LocalTime;

public final class calculateBusFareCft {
    public static final LocalTime START_TIME = LocalTime.of(6, 0);
    public static final LocalTime END_TIME   = LocalTime.of(22, 0);

    public static final LocalTime MORNING_END   = LocalTime.of(12, 0);
    public static final LocalTime AFTERNOON_END = LocalTime.of(18, 0);

    private calculateBusFareCft() { }

    public static int getBusFare(int age, LocalTime time) {
        if (age < 0 || age > 100 ||
                time.isBefore(START_TIME) ||
                time.isAfter(END_TIME)) {
            return -1;
        } else {
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
}

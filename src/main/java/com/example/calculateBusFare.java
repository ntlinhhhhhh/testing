package com.example;

import java.time.LocalTime;

public final class calculateBusFare {
    private calculateBusFare() { }

    public static int getBusFare(int age, LocalTime time) {
        if (age < 0 || age > 100 ||
                time.isBefore(LocalTime.of(6, 0)) ||
                time.isAfter(LocalTime.of(22, 0))) {
            return -1;
        } else {
            if (age < 6) {
                return 0;
            } else if (age < 60) {
                if (time.isBefore(LocalTime.of(12, 0))) {
                    return 10000;
                } else if (time.isAfter(LocalTime.of(18, 0))) {
                    return 15000;
                } else {
                    return 20000;
                }
            } else {
                if (time.isBefore(LocalTime.of(12, 0))) {
                    return 8000;
                } else if (time.isAfter(LocalTime.of(18, 0))) {
                    return 12000;
                } else {
                    return 15000;
                }
            }
        }
    }
}

package com.example;
import org.junit.jupiter.api.Test;

import java.time.LocalTime;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class calculateBusFareTest {


    @Test
    public void getBusFare() {
        assertEquals(12000, calculateBusFare.getBusFare(100, LocalTime.of(14, 0)));
    }

    @Test
    public void getBusFare2() {
        assertEquals(12000, calculateBusFare.getBusFare(99, LocalTime.of(14, 0)));
    }

    @Test
    public void getBusFare3() {
        assertEquals(15000, calculateBusFare.getBusFare(50, LocalTime.of(14, 0)));
    }

    @Test
    public void getBusFare4() {
        assertEquals(0, calculateBusFare.getBusFare(1, LocalTime.of(14, 0)));
    }

    @Test
    public void getBusFare5() {
        assertEquals(0, calculateBusFare.getBusFare(0, LocalTime.of(14, 0)));
    }

    @Test
    public void getBusFare6() {
        assertEquals(20000, calculateBusFare.getBusFare(50, LocalTime.of(22, 0)));
    }

    @Test
    public void getBusFare7() {
        assertEquals(20000, calculateBusFare.getBusFare(50, LocalTime.of(21, 59)));
    }

    @Test
    public void getBusFare8() {
        assertEquals(10000, calculateBusFare.getBusFare(50, LocalTime.of(6, 1)));
    }

    @Test
    public void getBusFare9() {
        assertEquals(10000, calculateBusFare.getBusFare(50, LocalTime.of(6, 0)));
    }
}

package com.example;
import org.junit.jupiter.api.Test;

import java.time.LocalTime;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class calculateBusFareCftTest {
    // Control flow testing
    @Test
    public void getBusFareCFT() {
        assertEquals(-1, calculateBusFareCft.getBusFare(-1, LocalTime.of(8, 0)));
    }

    @Test
    public void getBusFareCFT2() {
        assertEquals(0, calculateBusFareCft.getBusFare(3, LocalTime.of(16, 0)));
    }

    @Test
    public void getBusFareCFT3() {
        assertEquals(10000, calculateBusFareCft.getBusFare(30, LocalTime.of(8, 0)));
    }

    @Test
    public void getBusFareCFT4() {
        assertEquals(15000, calculateBusFareCft.getBusFare(30, LocalTime.of(16, 0)));
    }

    @Test
    public void getBusFareCFT5() {
        assertEquals(20000, calculateBusFareCft.getBusFare(30, LocalTime.of(20, 0)));
    }

    @Test
    public void getBusFareCFT6() {
        assertEquals(8000, calculateBusFareCft.getBusFare(72, LocalTime.of(8, 0)));
    }

    @Test
    public void getBusFareCFT7() {
        assertEquals(12000, calculateBusFareCft.getBusFare(72, LocalTime.of(16, 0)));
    }

    @Test
    public void getBusFareCFT8() {
        assertEquals(15000, calculateBusFareCft.getBusFare(72, LocalTime.of(20, 0)));
    }

}

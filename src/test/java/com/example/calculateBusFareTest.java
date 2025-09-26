package com.example;
import org.junit.jupiter.api.Test;

import java.time.LocalTime;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class calculateBusFareTest {

// single boundary
    @Test
    public void getBusFareSB1() {
        assertEquals(12000, calculateBusFare.getBusFare(100, LocalTime.of(14, 0)));
    }

    @Test
    public void getBusFareSB2() {
        assertEquals(12000, calculateBusFare.getBusFare(99, LocalTime.of(14, 0)));
    }

    @Test
    public void getBusFareSB3() {
        assertEquals(15000, calculateBusFare.getBusFare(50, LocalTime.of(14, 0)));
    }

    @Test
    public void getBusFareSB4() {
        assertEquals(0, calculateBusFare.getBusFare(1, LocalTime.of(14, 0)));
    }

    @Test
    public void getBusFareSB5() {
        assertEquals(0, calculateBusFare.getBusFare(0, LocalTime.of(14, 0)));
    }

    @Test
    public void getBusFarSBe6() {
        assertEquals(20000, calculateBusFare.getBusFare(50, LocalTime.of(22, 0)));
    }

    @Test
    public void getBusFareSB7() {
        assertEquals(20000, calculateBusFare.getBusFare(50, LocalTime.of(21, 59)));
    }

    @Test
    public void getBusFareSB8() {
        assertEquals(10000, calculateBusFare.getBusFare(50, LocalTime.of(6, 1)));
    }

    @Test
    public void getBusFareSB9() {
        assertEquals(10000, calculateBusFare.getBusFare(50, LocalTime.of(6, 0)));
    }

//    multiple boundary
    @Test
    public void getBusFareMB1() {
        assertEquals(15000, calculateBusFare.getBusFare(100, LocalTime.of(22, 0)));
    }

    @Test
    public void getBusFareMB2() {
        assertEquals(15000, calculateBusFare.getBusFare(100, LocalTime.of(21, 59)));
    }

    @Test
    public void getBusFareMB3() {
        assertEquals(12000, calculateBusFare.getBusFare(100, LocalTime.of(14, 0)));
    }

    @Test
    public void getBusFareMB4() {
        assertEquals(8000, calculateBusFare.getBusFare(100, LocalTime.of(6, 1)));
    }

    @Test
    public void getBusFareMB5() {
        assertEquals(8000, calculateBusFare.getBusFare(100, LocalTime.of(6, 0)));
    }

    @Test
    public void getBusFareMB6() {
        assertEquals(15000, calculateBusFare.getBusFare(99, LocalTime.of(22, 0)));
    }

    @Test
    public void getBusFareMB7() {
        assertEquals(15000, calculateBusFare.getBusFare(99, LocalTime.of(21, 59)));
    }

    @Test
    public void getBusFareMB8() {
        assertEquals(12000, calculateBusFare.getBusFare(99, LocalTime.of(14, 0)));
    }

    @Test
    public void getBusFareMB9() {
        assertEquals(8000, calculateBusFare.getBusFare(99, LocalTime.of(6, 1)));
    }

    @Test
    public void getBusFareMB10() {
        assertEquals(8000, calculateBusFare.getBusFare(88, LocalTime.of(6, 0)));
    }
    @Test
    public void getBusFareMB11() {
        assertEquals(20000, calculateBusFare.getBusFare(50, LocalTime.of(22, 0)));
    }

    @Test
    public void getBusFareMB12() {
        assertEquals(20000, calculateBusFare.getBusFare(50, LocalTime.of(21, 59)));
    }

    @Test
    public void getBusFareMB13() {
        assertEquals(15000, calculateBusFare.getBusFare(50, LocalTime.of(14, 0)));
    }

    @Test
    public void getBusFareMB14() {
        assertEquals(10000, calculateBusFare.getBusFare(50, LocalTime.of(6, 1)));
    }

    @Test
    public void getBusFareMB15() {
        assertEquals(10000, calculateBusFare.getBusFare(50, LocalTime.of(6, 0)));
    }
    @Test
    public void getBusFareMB16() {
        assertEquals(0, calculateBusFare.getBusFare(1, LocalTime.of(22, 0)));
    }

    @Test
    public void getBusFareMB17() {
        assertEquals(0, calculateBusFare.getBusFare(1, LocalTime.of(21, 59)));
    }

    @Test
    public void getBusFareMB18() {
        assertEquals(0, calculateBusFare.getBusFare(1, LocalTime.of(14, 0)));
    }

    @Test
    public void getBusFareMB19() {
        assertEquals(0, calculateBusFare.getBusFare(1, LocalTime.of(6, 1)));
    }

    @Test
    public void getBusFareMB20() {
        assertEquals(0, calculateBusFare.getBusFare(1, LocalTime.of(22, 0)));
    }

    @Test
    public void getBusFareMB21() {
        assertEquals(0, calculateBusFare.getBusFare(0, LocalTime.of(21, 59)));
    }

    @Test
    public void getBusFareMB22() {
        assertEquals(0, calculateBusFare.getBusFare(0, LocalTime.of(14, 0)));
    }

    @Test
    public void getBusFareMB23() {
        assertEquals(0, calculateBusFare.getBusFare(0, LocalTime.of(6, 1)));
    }
    @Test
    public void getBusFareMB24() {
        assertEquals(0, calculateBusFare.getBusFare(0, LocalTime.of(6, 0)));
    }

    @Test
    public void getBusFareMB25() {
        assertEquals(0, calculateBusFare.getBusFare(0, LocalTime.of(6, 0)));
    }

//  decision table
    @Test
    public void getBusFareDT1() {
        assertEquals(0, calculateBusFare.getBusFare(3, LocalTime.of(10, 0)));
    }

    @Test
    public void getBusFareDT2() {
        assertEquals(0, calculateBusFare.getBusFare(3, LocalTime.of(14, 0)));
    }

    @Test
    public void getBusFareDT3() {
        assertEquals(0, calculateBusFare.getBusFare(3, LocalTime.of(20, 0)));
    }

    @Test
    public void getBusFareDT4() {
        assertEquals(10000, calculateBusFare.getBusFare(30, LocalTime.of(10, 0)));
    }

    @Test
    public void getBusFareDT5() {
        assertEquals(15000, calculateBusFare.getBusFare(30, LocalTime.of(14, 0)));
    }

    @Test
    public void getBusFareDT6() {
        assertEquals(20000, calculateBusFare.getBusFare(30, LocalTime.of(20, 0)));
    }

    @Test
    public void getBusFareDT7() {
        assertEquals(8000, calculateBusFare.getBusFare(80, LocalTime.of(10, 0)));
    }

    @Test
    public void getBusFareDT8() {
        assertEquals(12000, calculateBusFare.getBusFare(80, LocalTime.of(14, 0)));
    }

    @Test
    public void getBusFareDT9() {
        assertEquals(15000, calculateBusFare.getBusFare(80, LocalTime.of(20, 0)));
    }
}

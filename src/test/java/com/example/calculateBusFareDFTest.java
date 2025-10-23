package com.example;

import org.junit.jupiter.api.Test;
import java.time.LocalTime;
import static org.junit.jupiter.api.Assertions.*;

public class calculateBusFareDFTest {

    @Test
    void testDT_T01() {
        assertEquals(-1, calculateBusFareDF.getBusFare(-1, LocalTime.of(8, 0)));
    }

    @Test
    void testDT_T02() {
        assertEquals(0, calculateBusFareDF.getBusFare(3, LocalTime.of(8, 0)));
    }

    @Test
    void testDT_T03() {
        assertEquals(-1, calculateBusFareDF.getBusFare(105, LocalTime.of(8, 0)));
    }

    @Test
    void testDT_T04() {
        assertEquals(0, calculateBusFareDF.getBusFare(3, LocalTime.of(8, 0)));
    }

    @Test
    void test_T05() {
        assertEquals(0, calculateBusFareDF.getBusFare(3, LocalTime.of(8, 0)));
    }

    @Test
    void testDT_T06() {
        assertEquals(10000, calculateBusFareDF.getBusFare(30, LocalTime.of(8, 0)));
    }

    @Test
    void testDT_T07() {
        assertEquals(10000, calculateBusFareDF.getBusFare(30, LocalTime.of(8, 0)));
    }

    @Test
    void testDT_T08() {
        assertEquals(8000, calculateBusFareDF.getBusFare(72, LocalTime.of(8, 0)));
    }

    @Test
    void testDT_T09() {
        assertEquals(-1, calculateBusFareDF.getBusFare(12, LocalTime.of(5, 0)));
    }

    @Test
    void testDT_T10() {
        assertEquals(0, calculateBusFareDF.getBusFare(3, LocalTime.of(8, 0)));
    }

    @Test
    void testDT_T11() {
        assertEquals(-1, calculateBusFareDF.getBusFare(7, LocalTime.of(23, 0)));
    }

    @Test
    void testDT_T12() {
        assertEquals(0, calculateBusFareDF.getBusFare(3, LocalTime.of(8, 0)));
    }

    @Test
    void testDT_T13() {
        assertEquals(10000, calculateBusFareDF.getBusFare(30, LocalTime.of(8, 0)));
    }

    @Test
    void testDT_T14() {
        assertEquals(15000, calculateBusFareDF.getBusFare(30, LocalTime.of(14, 0)));
    }

    @Test
    void testDT_T15() {
        assertEquals(15000, calculateBusFareDF.getBusFare(30, LocalTime.of(14, 0)));
    }

    @Test
    void testDT_T16() {
        assertEquals(20000, calculateBusFareDF.getBusFare(30, LocalTime.of(20, 0)));
    }

    @Test
    void testDT_T17() {
        assertEquals(8000, calculateBusFareDF.getBusFare(72, LocalTime.of(8, 0)));
    }

    @Test
    void testDT_T18() {
        assertEquals(12000, calculateBusFareDF.getBusFare(72, LocalTime.of(14, 0)));
    }

    @Test
    void testDT_T19() {
        assertEquals(12000, calculateBusFareDF.getBusFare(72, LocalTime.of(14, 0)));
    }

    @Test
    void testDT_T20() {
        assertEquals(15000, calculateBusFareDF.getBusFare(72, LocalTime.of(20, 0)));
    }
}

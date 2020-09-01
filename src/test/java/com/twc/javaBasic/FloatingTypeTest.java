package com.twc.javaBasic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FloatingTypeTest {
    @Test
    void should_not_get_rounded_result_if_convert_floating_number_to_integer() {
        final float floatingPointNumber = 2.75f;
        final int integer = (int)floatingPointNumber;

        // TODO:
        //  Please write down the answer directly.
        //
        // <!--start
        final int expected = 2;
        // --end-->

        assertEquals(expected, integer);
    }

    @SuppressWarnings({"divzero", "NumericOverflow"})
    @Test
    void should_judge_special_double_cases() {
        // Hint, please implement isInfinity and isNan in this class.
        assertTrue(isInfinity(1d / 0d));
        assertTrue(isInfinity(-1d / 0d));
        assertFalse(isInfinity(2d));
        assertFalse(isInfinity(Double.NaN));

        assertTrue(isNan(0d / 0d));
        assertFalse(isNan(Double.NEGATIVE_INFINITY));
        assertFalse(isNan(Double.POSITIVE_INFINITY));
    }

    @Test
    void should_not_round_number_when_convert_to_integer() {
        final float floatingPointNumber = 2.75f;
        final int integer = (int)floatingPointNumber;

        // TODO:
        //  Please write down you answer directly.
        //
        // <!--start
        final int expected = 2;
        // --end-->

        assertEquals(expected, integer);
    }

    @Test
    void should_round_number() {
        final double floatingPointNumber = 2.75;

        // TODO:
        //  Please call some method to round the floating point number.
        //
        // Hint:
        //  The reference is here:
        //  https://docs.oracle.com/javase/8/docs/api/java/lang/Math.html#round-double-
        // <!--start
        final long rounded = Math.round(floatingPointNumber);
        // --end-->

        assertEquals(3L, rounded);
    }

    @SuppressWarnings("unused")
    private boolean isNan(double realNumber) {
        // TODO:
        //  please implement the method to pass the test. It is better you call existing
        //  API rather than implemented yourself.
//        throw new RuntimeException("Not implemented");
        return Double.isNaN(realNumber);
    }

    @SuppressWarnings("unused")
    private boolean isInfinity(double realNumber) {
        // TODO:
        //  please implement the method to pass the test. It is better you call existing
        //  API rather than implemented yourself.
//        throw new RuntimeException("Not implemented");
        return Double.isInfinite(realNumber);
    }
}

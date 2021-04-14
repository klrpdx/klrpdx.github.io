package com.klrpdx.euler;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ProblemThreeTest {

    @Test
    void biggestPrimeSimple() {
        ProblemThree p3 = new ProblemThree();
        assertEquals(5, p3.solve(10));
    }

    @Test
    void biggestPrime100() {
        ProblemThree p3 = new ProblemThree();
        assertEquals(5, p3.solve(100));
    }

    @Test
    void biggestPrimeOfPrime() {
        ProblemThree p3 = new ProblemThree();
        assertEquals(0, p3.solve(127));
    }

    @Test
    void biggestPrime1027() {
        ProblemThree p3 = new ProblemThree();
        assertEquals(79, p3.solve(1027));
    }

    @Test
    void problemSolution() {
        ProblemThree p3 = new ProblemThree();
        assertEquals(79, p3.solve(600851475143L));
    }
}

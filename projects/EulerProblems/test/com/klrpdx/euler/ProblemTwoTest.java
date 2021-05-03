package com.klrpdx.euler;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ProblemTwoTest {

    @Test
    void simpleSequence() {
        ProblemTwo p2 = new ProblemTwo();
        assertEquals(10, p2.solve(10));
    }

    @Test
    void longerSequence() {
        ProblemTwo p2 = new ProblemTwo();
        assertEquals(798, p2.solve(1000));
    }

    @Test
    void problemSolution() {
        ProblemTwo p2 = new ProblemTwo();
        assertEquals(4613732, p2.solve(4000000));
    }

}

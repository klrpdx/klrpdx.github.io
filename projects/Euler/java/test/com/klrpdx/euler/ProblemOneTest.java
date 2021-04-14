package com.klrpdx.euler;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ProblemOneTest {

    @Test
    void findAThree() {
        ProblemOne p1 = new ProblemOne();
        assertEquals(3, p1.solve(4));
    }

    @Test
    void findAFive() {
        ProblemOne p1 = new ProblemOne();
        assertEquals(8, p1.solve(6));
    }

    @Test
    void findSeveral() {
        ProblemOne p1 = new ProblemOne();
        assertEquals(23, p1.solve(10));
    }


    @Test
    void findWithin30() {
        ProblemOne p1 = new ProblemOne();
        assertEquals(195, p1.solve(30));
    }



    @Test
    void problemSolution() {
        ProblemOne p1 = new ProblemOne();
        assertEquals(233168, p1.solve(1000));
    }

}

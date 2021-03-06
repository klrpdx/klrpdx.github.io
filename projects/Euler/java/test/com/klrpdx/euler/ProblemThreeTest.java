package com.klrpdx.euler;

import com.klrpdx.util.Solver;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ProblemThreeTest {

    @Test
    void biggestPrimeSimple() {
        ProblemThree p3 = new ProblemThree();
        assertEquals(5L, p3.solve(10L));
    }

    @Test
    void biggestPrime100() {
        ProblemThree p3 = new ProblemThree();
        assertEquals(5L, p3.solve(100L));
    }

    @Test
    void biggestPrimeOfPrime() {
        ProblemThree p3 = new ProblemThree();
        assertEquals(127L, p3.solve(127L));
    }

    @Test
    void biggestPrime1027() {
        ProblemThree p3 = new ProblemThree();
        assertEquals(79L, p3.solve(1027L));
    }

    @Test
    void runTimes() {
        ProblemThree p3 = new ProblemThree();

        for(long i=100000L;i<10000000000L;i*=2) {
            Solver solver = new Solver(p3);
            Long result = (Long)solver.solve(i);
            Double time = solver.time();
            System.out.printf("Value: %d, Solution: %d, Time: %.2f%n", i, result, time);
        }
    }


    @Test
    void problemSolution() {
        ProblemThree p3 = new ProblemThree();
        assertEquals(6857L, p3.solve(600851475143L));
    }
}

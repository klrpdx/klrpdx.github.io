package com.klrpdx.euler;

import com.klrpdx.util.Solver;
import org.junit.jupiter.api.Disabled;
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
    void runTimes() {
        ProblemThree p3 = new ProblemThree();

        for(long i=100000L;i<10000000000L;i*=2) {
            Solver solver = new Solver(p3);
            Long result = (Long)solver.solve(i);
            Double time = solver.time();
            System.out.printf("Value: %d, Solution: %d, Time: %.2f%n", i, result, time);
        }
    }


    @Disabled
    @Test
    void problemSolution() {
        ProblemThree p3 = new ProblemThree();
        assertEquals(79, p3.solve(600851475143L));
    }
}

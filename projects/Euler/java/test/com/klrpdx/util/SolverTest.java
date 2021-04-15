package com.klrpdx.util;

import com.klrpdx.euler.Problem;
import com.klrpdx.euler.ProblemOne;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class SolverTest {

    @Test
    void create() {
        Problem problem = new ProblemOne();
        Solver solver = new Solver(problem);
        assertEquals(3,  solver.solve(5));
        assertTrue(solver.time() >=0);
    }

}

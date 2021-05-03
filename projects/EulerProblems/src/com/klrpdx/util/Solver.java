package com.klrpdx.util;

import com.klrpdx.euler.Problem;

public class Solver {

    private final Problem problem;
    private Double time;
    public Solver(Problem problem) {
        this.problem = problem;
    }

    public Number solve(Object... varargs) {
        StopWatch timer = new StopWatch();
        Number solution = (Number)problem.solve(varargs);
        time = timer.elapsed();
        return solution;
    }

    public double time() {
        return time;
    }
}

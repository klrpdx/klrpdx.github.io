package com.klrpdx.euler;

public class ProblemTwo implements Problem {

    public Object solve(Object... maxRange) {
        int sum = 0;
        int last = 0;
        int current = 1;
        Integer max = (Integer)maxRange[0];

        while (current < max) {
            int newLast = current;
            current += last;
            if (current%2 == 0) {
                sum+=current;
            }
            last = newLast;
        }
        return sum;
    }
}

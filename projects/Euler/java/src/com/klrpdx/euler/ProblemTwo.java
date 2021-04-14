package com.klrpdx.euler;

public class ProblemTwo {

    public int solve(int maxRange) {
        int sum = 0;
        int last = 0;
        int current = 1;

        while (current < maxRange) {
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

package com.klrpdx.euler;

public class ProblemThree implements Problem {

    public Object solve(Object... target) {
        Long targetNum = (Long)target[0];
        Long i = 1L;
        while (targetNum > 1L) {
            i++;
            while (targetNum % i == 0) {
                targetNum = targetNum / i;
            }
        }
        return i;
    }
}

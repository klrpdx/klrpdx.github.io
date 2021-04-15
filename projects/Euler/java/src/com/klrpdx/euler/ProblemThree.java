package com.klrpdx.euler;

public class ProblemThree implements Problem {

    public Object solve(Object... target) {
        Long targetNum = (Long)target[0];
        long largestPrimeFactor = 0L;
        for (long i = 3L; i < targetNum; i++) {
            if (targetNum % i == 0 && isPrime(i)) {
                largestPrimeFactor = i;
            }
        }
        return largestPrimeFactor;
    }

    private boolean isPrime(long i) {
        return (Long)solve(i) == 0;
    }
}

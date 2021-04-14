package com.klrpdx.euler;

public class ProblemThree {
    public Long solve(long target) {

        long largestPrimeFactor = 0L;
        for (long i = 3L; i < target; i++) {
            if (target % i == 0 && isPrime(i)) {
                largestPrimeFactor = i;
            }
        }
        return largestPrimeFactor;
    }

    private boolean isPrime(long i) {
        return solve(i) == 0;
    }
}

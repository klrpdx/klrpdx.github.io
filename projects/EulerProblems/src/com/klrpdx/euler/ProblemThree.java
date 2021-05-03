package com.klrpdx.euler;

import java.util.ArrayList;
import java.util.List;

/***
 *
 The prime factors of 13195 are 5, 7, 13 and 29.

 What is the largest prime factor of the number 600851475143 ?

 */
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

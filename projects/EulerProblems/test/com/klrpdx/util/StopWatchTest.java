package com.klrpdx.util;

import org.junit.jupiter.api.Test;

import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.assertTrue;

class StopWatchTest {


    @Test
    void basicFunction() throws Exception {
        StopWatch timer = new StopWatch();
        TimeUnit.MILLISECONDS.sleep(800);
        double now = timer.elapsed();
        assertTrue(now>0);
    }

    @Test
    void aFewSeconds() throws Exception {
        StopWatch timer = new StopWatch();
        TimeUnit.SECONDS.sleep(3);
        double now = timer.elapsed();
        assertTrue(now>=3);
    }


}

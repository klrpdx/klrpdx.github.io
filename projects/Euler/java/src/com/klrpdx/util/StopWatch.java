package com.klrpdx.util;

public class StopWatch {

    private long elapsedTime;

    public StopWatch() {
        elapsedTime = System.currentTimeMillis();
    }

    public double elapsed() {
        return (System.currentTimeMillis() - elapsedTime) / 1000.0;
    }
}

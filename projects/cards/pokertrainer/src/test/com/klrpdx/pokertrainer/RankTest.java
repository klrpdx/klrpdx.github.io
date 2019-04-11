package com.klrpdx.pokertrainer;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RankTest {

    @Test
    void ace() {
        assertEquals("Ace", Rank.ACE.toString());
    }

    @Test
    void two() {
        assertEquals("Two", Rank.TWO.toString());
    }

    @Test
    void three() {
        assertEquals("Three", Rank.THREE.toString());
    }

    @Test
    void four() {
        assertEquals("Four", Rank.FOUR.toString());
    }

    @Test
    void five() {
        assertEquals("Five", Rank.FIVE.toString());
    }

    @Test
    void six() {
        assertEquals("Six", Rank.SIX.toString());
    }

    @Test
    void seven() {
        assertEquals("Seven", Rank.SEVEN.toString());
    }

    @Test
    void eight() {
        assertEquals("Eight", Rank.EIGHT.toString());
    }

    @Test
    void nine() {
        assertEquals("Nine", Rank.NINE.toString());
    }

    @Test
    void ten() {
        assertEquals("Ten", Rank.TEN.toString());
    }

    @Test
    @DisplayName("🂫")
    void jack() {
        assertEquals("Jack", Rank.JACK.toString());
    }

    @Test
    @DisplayName("🂭")
    void queen() {
        assertEquals("Queen", Rank.QUEEN.toString());
    }

    @Test
    @DisplayName("🂮")
    void king() {
        assertEquals("King", Rank.KING.toString());
    }




}

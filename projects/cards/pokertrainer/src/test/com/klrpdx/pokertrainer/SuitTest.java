package com.klrpdx.pokertrainer;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SuitTest {

    @Test
    @DisplayName("♠️")
    void nameSpade() {
        assertEquals("Spades", Suit.SPADES.displayName());
    }

    @Test
    @DisplayName("♥️️")
    void nameHeart() {
        assertEquals("Hearts", Suit.HEARTS.displayName());
    }

    @Test
    @DisplayName("♦️")
    void nameDiamond() {
        assertEquals("Diamonds", Suit.DIAMONDS.displayName());
    }

    @Test
    @DisplayName("♣️")
    void nameClub() {
        assertEquals("Clubs", Suit.CLUBS.displayName());
    }



}

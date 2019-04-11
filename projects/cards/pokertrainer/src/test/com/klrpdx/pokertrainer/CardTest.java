package com.klrpdx.pokertrainer;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CardTest {

    @Test
    void create() {
        Card card = new Card("",Suit.SPADES);
        assertAll("Card Details",
                () -> assertNotNull(card.getSuit(), "A blank card?"),
                () -> assertNotNull(card.getRank(), "A blank card?"));
    }

    @Test
    void createSpecificCard() {
        Card card = new Card("Ace", Suit.SPADES);
        assertAll("Card Details",
                () -> assertEquals(Suit.SPADES, card.getSuit(), "Wrong suite"),
                () -> assertEquals(card.getRank(), "Ace","Wrong value"));

    }

}

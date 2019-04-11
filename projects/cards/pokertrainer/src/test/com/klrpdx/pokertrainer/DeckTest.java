package com.klrpdx.pokertrainer;


import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Set;
import java.util.TreeSet;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

class DeckTest {

    @Test
    @DisplayName("😃")
     void getFullDeck() {
        Deck deck = new Deck();
        assertEquals(52, deck.getCardsRemaining(), "Not playing with a full deck!");
    }


    @Test
    void dealCards() {
        Deck deck = new Deck();

        int count = 0;


        do {
            deck.getACard();
            count++;
            if (count > 51 && deck.hasCards()) {
                fail("Deck has too many cards");
            }
        } while (count < 53);


    }

    @Test
    void everyCardIsUnique() {
        Deck deck1 = new Deck();

        Set<Integer> dealtCards = new TreeSet<>();
        while(deck1.hasCards()) {
            Integer card = deck1.getACard();
            if (dealtCards.contains(card)) {
                fail("Deck contains duplicate cards!");
            }
            dealtCards.add(card);
        }
    }


}

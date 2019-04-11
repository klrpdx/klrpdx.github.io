package com.klrpdx.pokertrainer;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Deck {

    private List<Integer> cards;
    private static Random rnd = new Random();

    public Object getCardsRemaining() {
        cards = new ArrayList<>();
        for (int i=0;i<52;i++) {
            cards.add(rnd.nextInt());
        }
        return cards.size();
    }

    public Integer getACard() {
        return 1;
    }

    public boolean hasCards() {
        return false;
    }
}

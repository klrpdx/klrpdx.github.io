package com.klrpdx.pokertrainer;

public class Card {


    private Object rank;
    private Suit suit;

    public Card(String rank, Suit suit) {
        this.rank = rank;
        this.suit = suit;
    }

    public Suit getSuit() {
        return suit;
    }

    public Object getRank() {
        return rank;
    }
}

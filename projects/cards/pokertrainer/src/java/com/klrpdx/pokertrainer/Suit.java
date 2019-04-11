package com.klrpdx.pokertrainer;

public enum Suit {

    SPADES("Spades"),
    HEARTS("Hearts"),
    DIAMONDS("Diamonds"),
    CLUBS("Clubs");



    Suit(String name) {
        this.name = name;
    }

    private String name;

    public String displayName() {
        return name;
    }

}

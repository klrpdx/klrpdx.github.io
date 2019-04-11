package com.klrpdx.pokertrainer;

public enum Rank {

    ACE("Ace"),
    TWO("Two"),
    THREE("Three"),
    FOUR("Four"),
    FIVE("Five"),
    SIX("Six"),
    SEVEN("Seven"),
    EIGHT("Eight"),
    NINE("Nine"),
    TEN("Ten"),
    JACK("Jack"),
    QUEEN("Queen"),
    KING("King");

    Rank(String name) {
        displayName = name;
    }

    private String displayName;

    @Override
    public String toString() {
        return displayName;
    }
}

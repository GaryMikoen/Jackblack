package com.company;

public class Card {
    private String card ;
    private String suit ;

    public Card(String suit, String card) {
        this.suit = suit;
        this.card = card;
    }

    public String getPoint(){
        return card;
    }

    public String getCardValue(){
        return card;
    }

    public String getSuitValue(){
        return suit;
    }

    public String getCardAndSuit(){
        String cardAndSuit = card + suit;
        return cardAndSuit;
    }
}

package com.company;

public class Card {
    private static String[] cardArray = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "JACK", "QUEEN", "KING"};
    private static String[] suitArray = {"♠", "♥", "♣", "♦"};
    private String card ;
    private String suit ;

    public Card(String suit, String card) {
        this.suit = suit;
        this.card = card;
    }
    /*
    public void showCard(){
        System.out.println(cardArray[card] + suitArray[suit]);
    }
    */
    public String getPoint(){
        return card;
    }

    public String getCardValue(){
        return card;
    }

    public String getSuitValue(){
        return suit;
    }

}

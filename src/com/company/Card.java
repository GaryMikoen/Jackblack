package com.company;

public class Card {
    private static String[] cardArray = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "JACK", "QUEEN", "KING"};
    private static String[] suitArray = {"♠", "♥", "♣", "♦"};
    private int cardNumber ;
    private int suitNumber ;

    public Card(int card, int suit) {
        this.cardNumber = card;
        this.suitNumber = suit;
    }

    public void getPoints(){
        System.out.println(cardArray[cardNumber] + suitArray[suitNumber]);
    }

}

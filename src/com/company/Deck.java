package com.company;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Deck {
    private static String[] cardArray = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "JACK", "QUEEN", "KING"};
    private static String[] suitArray = {"♠", "♥", "♣", "♦"};
    private ArrayList<Card> deck = new ArrayList();


    public Deck() {

    }

    public void getCards(){
        for (int i = 0; i <= (suitArray.length-1);i++){
            for (int j = 0; j <= (cardArray.length-1) ; j++){
                Card card = new Card(i,j);
                deck.add(card);
            }
        }
        System.out.println(deck.size());
    }


}

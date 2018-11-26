package com.company;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;

public class Deck {

    private static String[] cardArray = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "JACK", "QUEEN", "KING"};
    private static String[] suitArray = {"♠", "♥", "♣", "♦"};
    private ArrayList<Card> deck = new ArrayList();

    public Deck() {

    }

    public void getCardsInDeck(){
        for (int i = 0; i <= (suitArray.length-1);i++){
            for (int j = 0; j <= (cardArray.length-1) ; j++){
                Card card = new Card(suitArray[i], cardArray[j]);
                deck.add(card);
            }
        }
    }

    public void showDeck() {
        for (int i = 0; i <= deck.size() - 1; i++) {
            System.out.println(deck.get(i).getCardValue() + deck.get(i).getSuitValue());
        }
    }

    public void shuffleDeck(){
        Collections.shuffle(deck);
    }

    public Card getCardFromDeck(){
        Card card = deck.get(0);
        return card;
    }

}

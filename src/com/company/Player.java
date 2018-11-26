package com.company;

import java.util.ArrayList;

public class Player {
    private String card1;
    private String card2;
    private ArrayList<Card> hand = new ArrayList();
    private int valueInhand;

    public Player() {

    }

    public void getCard(Deck deck){
        System.out.println("Player grabs a card");
        Card card = deck.getCardFromDeck();
        System.out.println(card.getCardValue());
        System.out.println(card.getSuitValue());

    }

    /*
    public void getCard2(){
        System.out.println("Player grabs his second card");
        Card card2 = new Card(3,3);
        hand.add(card2);
    }

    public void showHand(){
        System.out.println("player has the following cards");
        for(int i = 0; i<=hand.size()-1; i++ ){
            hand.get(i).showCard();
        }
    }

    public void calculatePointsInHand(){
        int value = 0;
        for(int i = 0; i<=hand.size()-1; i++){
            System.out.println(hand.get(i).getPoint());
            value += hand.get(i).getPoint();
        }
        System.out.println(value);
    }
    */
}

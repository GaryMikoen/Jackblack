package com.company;

import java.util.ArrayList;

public class Player {
    private String card1;
    private String card2;
    private ArrayList<Card> hand = new ArrayList();

    public Player() {


    }

    public void getCard1(){
        Card card1 = new Card(1, 2);
        hand.add(card1);
    }

    public void getCard2(){
        Card card2 = new Card(3,3);
        hand.add(card2);
    }

    public void showHand(){
        for(int i = 0; i<=hand.size()-1; i++ ){
            hand.get(i).getPoints();
        }
    }
}

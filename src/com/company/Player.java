package com.company;

import java.util.ArrayList;

public class Player {

    private ArrayList<Card> hand = new ArrayList();
    private int valueInhand;
    private String name;

    public Player(String name) {
        this.name = name;
    }

    public void getCard(Deck deck){
        System.out.println(name + " grabs a card");
        Card card = deck.getCardFromDeck();
        hand.add(card);
    }


    public void showHand(){
        System.out.println(name + " has the following cards");
        for(int i = 0; i<=hand.size()-1; i++ ){
            System.out.println(hand.get(i).getCardValue() + hand.get(i).getSuitValue());
        }
        System.out.println(calculatePointsInHand());
    }

    public void playerBehavior(){
        int pointsInHand = 0;
        pointsInHand = calculatePointsInHand();
    }

    public int calculatePointsInHand() {
        int value = 0;
        for (int i = 0; i <= hand.size() - 1; i++) {
            switch (hand.get(i).getPoint()) {
                case "A":
                    value += 1;
                    break;
                case "2":
                    value += 2;
                    break;
                case "3":
                    value += 3;
                    break;
                case "4":
                    value += 4;
                    break;
                case "5":
                    value += 5;
                    break;
                case "6":
                    value += 6;
                    break;
                case "7":
                    value += 7;
                    break;
                case "8":
                    value += 8;
                    break;
                case "9":
                    value += 9;
                    break;
                case "10":
                    value += 10;
                    break;
                case "JACK":
                    value += 10;
                    break;
                case "QUEEN":
                    value += 10;
                    break;
                case "KING":
                    value += 10;
                    break;
            }
        }
        return value;
    }
}

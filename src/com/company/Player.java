package com.company;

import java.util.ArrayList;

public class Player {

    private ArrayList<Card> hand = new ArrayList();
    private String name;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Card> getHand() {
        return hand;
    }

    public void getCard(Deck deck){
        Card card = deck.getCardFromDeck();
        hand.add(card);
        System.out.println(name + " grabbed " + card.getSuitValue() + card.getCardValue() );
    }

    public void showHand(){
        System.out.println(name + " has the following cards");
        ArrayList<String> cardsInHand = new ArrayList<>();
        for(int i = 0; i<=hand.size()-1; i++ ){
            cardsInHand.add(hand.get(i).getCardAndSuit());
        }
        System.out.println(String.join(", ", cardsInHand));
        System.out.println("A total of " + calculatePointsInHand() + " points");
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

package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println("Lets play blackjack");

        Deck deck1 = new Deck();
        System.out.println();
        deck1.getCardsInDeck();
//        deck1.showDeck();

        deck1.shuffleDeck();
//        deck1.showDeck();

        System.out.println("players turn");
        Player player1 = new Player();
        player1.getCard(deck1);
        player1.getCard(deck1);
        player1.showHand();
        System.out.println(player1.calculatePointsInHand());

    }
}

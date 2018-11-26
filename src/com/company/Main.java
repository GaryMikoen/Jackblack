package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println("lets play blackjack");
        /*
        Card card1 = new Card(1, 2);
        Card card2 = new Card(3,3);
        */

        /*
        player1.getCard1();
        player1.getCard2();
        player1.showHand();
        player1.calculatePointsInHand();
        */
        System.out.println("Deck is being created");
        Deck deck1 = new Deck();
        System.out.println();
        deck1.getCardsInDeck();
        deck1.showDeck();

        System.out.println("Deck is being shuffled");
        deck1.shuffleDeck();
        deck1.showDeck();

        System.out.println("players turn");
        Player player1 = new Player();
        player1.getCard(deck1);

    }
}

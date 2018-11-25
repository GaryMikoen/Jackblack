package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println("lets play blackjack");

        Card card1 = new Card(1, 2);
        Card card2 = new Card(3,3);

        Player player1 = new Player();
        player1.getCard1();
        player1.getCard2();
        player1.showHand();


    }
}

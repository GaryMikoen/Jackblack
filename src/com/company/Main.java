package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Lets play blackjack");
        Deck deck1 = new Deck();
        deck1.getCardsInDeck();
        deck1.shuffleDeck();
        System.out.println();

        System.out.println("Players turn");
        Player player1 = new Player("Gary");
        Player player2 = new Player("dealer");

        player2.getCard(deck1);
        player1.getCard(deck1);
        player1.getCard(deck1);
        player1.showHand();

        System.out.println(player1.calculatePointsInHand());
        hitMe(player1, deck1);
        player1.showHand();
        System.out.println(player1.calculatePointsInHand());
        player1.showHand();


    }

    public static void hitMe(Player player, Deck deck){
        Scanner myObj = new Scanner(System.in);
        System.out.println("Hit or Stay y/n?");
        String hitOrStay = myObj.nextLine();
        if (hitOrStay.equals("y")){
            player.getCard(deck);
        }
        else if(hitOrStay.equals("n")){
            System.out.println("player stays");
        }
    }
}

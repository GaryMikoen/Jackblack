package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Lets play blackjack");
        Deck deck1 = new Deck();
        deck1.getCardsInDeck();
        deck1.shuffleDeck();
        System.out.println();

        System.out.println("Dealer starts the game");
        Player player2 = new Player("dealer");
        player2.getCard(deck1);

        System.out.println();
        System.out.println("Players turn");
        Player player1 = new Player("Gary");
        player1.getCard(deck1);
        player1.getCard(deck1);
        player1.showHand();

        hitMe(player1, deck1);
        player1.showHand();


    }

    public static void hitMe(Player player, Deck deck){
        Scanner myObj = new Scanner(System.in);
        System.out.println("Hit or Stay y/n?");
        String hitOrStay = myObj.nextLine();
        if (hitOrStay.equals("y")){
            player.getCard(deck);
            bust(player, deck);
        }
        else if(hitOrStay.equals("n")){
            System.out.println("player stays");
        }
    }

    public static void bust(Player player, Deck deck){
        int bustNumber = 21;
        if (player.calculatePointsInHand() > bustNumber){
            player.showHand();
            System.out.println("player busted");
        }
        else {
            player.showHand();
            hitMe(player, deck);
        }

    }
}

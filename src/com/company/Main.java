package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Lets play blackjack");
        String playerName = createPlayer();
        System.out.println();

        //Create deck
        Deck deck1 = new Deck();
        deck1.getCardsInDeck();
        deck1.shuffleDeck();
        System.out.println();

        //Dealer starts the game and grabs a card
        System.out.println("Dealer starts the game");
        Player player2 = new Player("Dealer");
        player2.getCard(deck1);

        //Players turn and grabs 2 cards to start
        System.out.println();
        System.out.println(playerName + " starts now");
        Player player1 = new Player(playerName);
        player1.getCard(deck1);
        player1.getCard(deck1);

        //player interaction
        hitMe(player1, deck1);

    }

    public static String createPlayer(){
        Scanner playerName = new Scanner(System.in);
        System.out.println("what is your name?");
        String name = playerName.nextLine();
        return name;
    }

    public static void hitMe(Player player, Deck deck){
        player.showHand();
        System.out.println();
        Scanner hit = new Scanner(System.in);
        System.out.println("Hit or Stay y/n?");
        String hitOrStay = hit.nextLine();
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
            System.out.println(player.getName() + " busted with " + player.calculatePointsInHand() + " points in hand!");
        }
        else {
            player.showHand();
            hitMe(player, deck);
        }
    }
}

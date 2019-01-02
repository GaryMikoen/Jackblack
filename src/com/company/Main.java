package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Lets play blackjack");
        String playerName = createPlayer();
        System.out.println();

        //Create deck
        Deck deck = new Deck();
        deck.getCardsInDeck();
        deck.shuffleDeck();
        System.out.println();

        //Dealer starts the game and grabs a card
        System.out.println("Dealer starts the game");
        Player dealer = new Player("Dealer");
        dealer.getCard(deck);

        //Players turn and grabs 2 cards to start
        System.out.println();
        System.out.println(playerName + " starts now");
        Player player = new Player(playerName);
        player.getCard(deck);
        player.getCard(deck);

        //Player interaction
        blackjack(player,deck);
        hitPlayer(player, deck);

        //Dealer plays
        System.out.println();
        System.out.println("Dealer needs to beat " + player.calculatePointsInHand());
        dealer.showHand();
        hitDealer(dealer, player, deck);
    }

    private static void blackjack(Player player, Deck deck) {
        switch(player.getHand().get(0).getCardValue()){
            case "A":
                if( player.getHand().get(1).getCardValue().equals("10")      ||
                    player.getHand().get(1).getCardValue().equals("JACK")    ||
                    player.getHand().get(1).getCardValue().equals("QUEEN")   ||
                        player.getHand().get(1).getCardValue().equals("KING")){
                    System.out.println("blackjack!!!!!! winning");
                    System.exit(0);
                }
                break;
            case "10":
            case "JACK":
            case "QUEEN":
            case "KING":
                if(player.getHand().get(1).getCardValue().equals("A")){
                    System.out.println("blackjack!!!!!! winning");
                    System.exit(0);
                }
                break;
                default:
                    break;
        }
    }

    private static void hitDealer(Player dealer, Player player,Deck deck) {
        if (dealer.calculatePointsInHand()<=player.calculatePointsInHand()){
            dealer.getCard(deck);
            bust(dealer, deck);
            hitDealer(dealer, player, deck);
        }
        else if(dealer.calculatePointsInHand() == player.calculatePointsInHand() && dealer.calculatePointsInHand() > 17){
            System.out.println("Push! " + dealer.getName() + " & " + player.getName() + "draw with " + dealer.calculatePointsInHand() + " points" );
        }
        else {
            dealer.showHand();
            System.out.println();
            System.out.println(dealer.getName() + " beats the " + player.calculatePointsInHand() + " points of " + player.getName() + " with " + dealer.calculatePointsInHand() + " points");
        }

    }

    public static String createPlayer(){
        Scanner playerName = new Scanner(System.in);
        System.out.println("what is your name?");
        String name = playerName.nextLine();
        return name;
    }

    public static void hitPlayer(Player player, Deck deck){
        player.showHand();
        System.out.println();
        Scanner hit = new Scanner(System.in);
        System.out.println("Hit or Stay y/n?");
        String hitOrStay = hit.nextLine();
        if (hitOrStay.equals("y")){
            player.getCard(deck);
            bust(player, deck);
            hitPlayer(player, deck);
        }
        else if(hitOrStay.equals("n")){
            System.out.println("Player stays");
        }
    }

    public static void bust(Player player, Deck deck){
        int bustNumber = 21;
        if (player.calculatePointsInHand() > bustNumber){
            player.showHand();
            System.out.println(player.getName() + " busted with " + player.calculatePointsInHand() + " points in hand!");
            System.exit(0);
        }
    }

}

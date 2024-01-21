package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class CardGameMain {
    private static Random random = new Random();
    public static void main(String[] args) {

        List<Card> deck = Card.getStandardDeck();
        //Card.printDeck(deck);

        //deal cards
        int numberOfPlayers = random.nextInt(2, 7);
        Player[] players = new Player[numberOfPlayers];
        Collections.shuffle(deck);
        Card.Suit trumpSuit = Card.Suit.values()[random.nextInt(0, 4)];
        System.out.println(trumpSuit + "" + trumpSuit.getImage());


        for (int i = 0; i < numberOfPlayers; i++) {
            players[i] = new Player(deck.subList(i * 6, i * 6 + 6));
            System.out.println("Player " + (i + 1) + " cards: " + players[i].getCards());
        }
        deck = deck.subList(numberOfPlayers * 6, 52);
        System.out.println(deck.size());
        Card.printDeck(deck);


    }
}

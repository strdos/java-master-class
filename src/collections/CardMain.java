package collections;

import polymorphism.Car;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CardMain {

    public static void main(String[] args) {
        List<Card> deck = Card.getStandardDeck();
        Card.printDeck(deck);

/*        Card[] cardArray = new Card[13];
        Card aceOfHears = Card.getFaceCard(Card.Suit.HEART, 'A');
        Arrays.fill(cardArray, aceOfHears);
        Card.printDeck(Arrays.asList(cardArray), "Ace of Hearts", 1);

        List<Card> acesOfHearts = Collections.nCopies(13, aceOfHears);
        Card.printDeck(acesOfHearts, "Ace of Hearts", 1);*/

/*        Collections.shuffle(deck);
        Card.printDeck(deck, "Shuffled Deck", 4);*/

        var sortingAlgorithm = Comparator.comparing(Card::rank).thenComparing(Card::suit);
        //var sortingAlgorithm = Comparator.comparing(Card::rank).reversed().thenComparing(Card::suit);
        deck.sort(sortingAlgorithm);
        Card.printDeck(deck, "Sorted Deck", 13);
    }
}

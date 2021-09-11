package CardGameTools;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Deck {
    private final int DECK_SIZE;
    private final List<Card> CARDS = new ArrayList<>();
    private final List<Card> DISCARD = new ArrayList<>();

    public Deck() {
        DECK_SIZE = 52;
        addAllCards();
    }

    public int getCARDSSize() {
        return CARDS.size();
    }

    private void addAllCards() {
        int cardValue = 1;
        int suitValue = 0;

        while (CARDS.size() < DECK_SIZE) {
            CARDS.add(new Card(Card.SUITS[suitValue], cardValue));

            if (CARDS.size() % 13 == 0) {
                suitValue++;
            }

            if (cardValue + 1 == 14) {
                cardValue = 1;
            } else {
                cardValue++;
            }
        }
    }

    public void draw() {
        if (CARDS.size() != 0) {
            Random randomCard = new Random();

            int pickedCard = randomCard.nextInt(CARDS.size());

            System.out.println(CARDS.get(pickedCard));
            DISCARD.add(CARDS.get(pickedCard));
            CARDS.remove(pickedCard);
        } else {
            reshuffleDeck();
        }

    }

    public void draw(int numberOfCards) {

        if (CARDS.size() != 0) {

            int cardsDiscarded = DISCARD.size();

            while (DISCARD.size() < cardsDiscarded + numberOfCards) {
                draw();
            }
        } else {
            reshuffleDeck();
        }

    }

    public void getSpecificCard(String value, String suit) {
        if (CARDS.size() != 0) {

            Card pickedCard = null;

            for (Card card : CARDS) {
                if (card.getSuit().equals(suit) && card.getValue().equals(value)) {
                    pickedCard = card;
                    System.out.println(pickedCard);
                    DISCARD.add(pickedCard);
                }
            }

            if (pickedCard != null) {
                CARDS.remove(pickedCard);
            } else {
                System.out.println("Desired card is not in the deck");
            }
        } else {
            reshuffleDeck();
        }


    }

    public void reshuffleDeck() {
        System.out.println("The deck is empty\nReshuffling...");
        CARDS.addAll(DISCARD);
        DISCARD.clear();
    }

    public void displayDeck() {

        if (CARDS.size() != 0) {

            for (Card card : CARDS) {
                System.out.println(card);
            }
        } else {
            reshuffleDeck();
        }
    }
}

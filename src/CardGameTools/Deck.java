package CardGameTools;

import java.util.ArrayList;
import java.util.List;

public class Deck {
    private int deckSize;
    private List<Card> cards = new ArrayList<>();

    public Deck() {
        deckSize = 52;
        int cardValue = 1;
        int suitValue = 0;

        while (cards.size() < deckSize) {
            cards.add(new Card(Card.SUITS[suitValue], cardValue));

            if (cards.size() % 13 == 0) {
                suitValue++;
            }

            if (cardValue + 1 == 14) {
                cardValue = 1;
            } else {
                cardValue++;
            }
        }
    }

    public void displayDeck() {
        for (Card card : cards) {
            System.out.println(card);
        }
    }
}

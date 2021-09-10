package CardGameTools;

public class Card {
    protected final String suit;
    protected final String value;
    protected static final String[] SUITS = new String[] {"Diamonds", "Hearts", "Clubs", "Spades"};

    public Card(String suit, int value) {
        this.suit = suit;

        if (value == 1) {
            this.value = "Ace";
        } else if (value == 11) {
            this.value = "Jack";
        } else if (value == 12) {
            this.value = "Queen";
        } else if (value == 13) {
            this.value = "King";
        } else {
            this.value = Integer.toString(value);
        }
    }

    public String toString() {
        return "The " + value + " of " + suit;
    }
}

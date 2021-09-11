package CardGameTools;

import java.util.Scanner;

public class Logic {
    protected final static Scanner scanner = new Scanner(System.in);
    protected final static Deck TEST_DECK = new Deck();


    public static void logic() {

        String cardChoice = "";
        do {
            System.out.println("How many cards do you want to draw?");
            cardChoice = scanner.nextLine();

            if (cardChoice.equals("Cheats")) {
                System.out.println("Enter a Suit");
                String suit = scanner.nextLine();

                System.out.println("Enter a Value");
                String value = scanner.nextLine();

                TEST_DECK.getSpecificCard(value, suit);

                cardChoice = "";
            }

        } while (cardChoice.equals("") || Integer.parseInt(cardChoice) > TEST_DECK.getCARDSSize());


        if (!cardChoice.equals("1")) {

            TEST_DECK.draw(Integer.parseInt(cardChoice));
        } else {
            TEST_DECK.draw();
        }

        if (TEST_DECK.getCARDSSize() == 0) {
            TEST_DECK.reshuffleDeck();
        }
    }

}

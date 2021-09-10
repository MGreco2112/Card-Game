package com.company;

import CardGameTools.Deck;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Deck testDeck = new Deck();
	    Scanner scanner = new Scanner(System.in);
        String cardChoice = "";

        do {
            System.out.println("How many cards do you want to draw?");
            cardChoice = scanner.nextLine();

            if (cardChoice.equals("Cheats")) {
                System.out.println("Enter a Suit");
                String suit = scanner.nextLine();

                System.out.println("Enter a Value");
                String value = scanner.nextLine();

                testDeck.getSpecificCard(value, suit);

                cardChoice = "";
                break;
            }

        } while (cardChoice.equals("") || Integer.parseInt(cardChoice) < 1 && Integer.parseInt(cardChoice) > testDeck.getCARDSSize());


        if (!cardChoice.equals("1")) {

            testDeck.draw(Integer.parseInt(cardChoice));
        } else {
            testDeck.draw();
        }




    }
}

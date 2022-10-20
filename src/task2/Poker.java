package task2;

import java.util.Scanner;

public class Poker {

    private static String[] deckInit(String[] suits, String[] rank) {
        String[] deck = new String[52];
        for (int i = 0; i < rank.length; i++) {
            for (int j = 0; j < suits.length; j++) {
                deck[suits.length * i + j] = rank[i] + " " + suits[j];
            }
        }
        return deck;
    }

    private static void shuffle(String[] deck) {
        for (int i = 0; i < 52; i++) {
            int r = i + (int) (Math.random() * (52 - i));
            String temp = deck[r];
            deck[r] = deck[i];
            deck[i] = temp;
        }
    }

    public static void main(String[] args) {
        int cardsPerPlayer = 5;
        int players = 0;
        String[] suits = {"Spade", "Diamond", "Heart", "Club"};
        String[] rank = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
        int n = 52;

        for (; ; ) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter a players amount >>  ");
            if (sc.hasNextInt()) {
                players = sc.nextInt();
                if (cardsPerPlayer * players <= n) {
                    break;
                } else {
                    if (players == 0) {
                        System.out.print("Game ended.");
                        break;
                    } else if (players < 0) {
                        System.out.println("Amount of players can't be less than 0");
                    } else {
                        System.out.println("Too much players");
                    }
                }
            } else {
                System.out.println("You entered not a num or your number too big");
            }
        }
        String[] deck = deckInit(suits, rank);
        shuffle(deck);

        for (int i = 0; i < players * cardsPerPlayer; i++) {
            System.out.println(deck[i]);
            if (i % cardsPerPlayer == cardsPerPlayer - 1) System.out.println();
        }
    }
}

package templatemethod;

import java.util.Scanner;

public class Coin extends Game {
 
    /* Implementation of necessary concrete methods */
    private Scanner scanner;
    private int heads;
    private int tails;
    private int correct;
    private int guess;

    void initializeGame() {
        // ...
        scanner = new Scanner(System.in);
        heads = 1;
        tails = 2;

        correct = ((int)(Math.random() * (2 + 1)));

    }

    void makePlay(int player) {
        // ...
        
        System.out.println("Player " + (player+1) + ", Heads or Tails? Give 1 for Heads and 2 for Tails");
        guess = scanner.nextInt();

        if (guess == heads) {

            if (guess == correct) {
                System.out.println("Coin landed on Heads! You win!");
            }else {
                System.out.println("Coin landed on Tails! You lose...");
            }

        } 
        else if (guess == tails) {

            if (guess == correct) {
                System.out.println("Coin landed on Tails! You win!");
            }else {
                System.out.println("Coin landed on Heads! You lose...");
            }

        } 
        else {
            System.out.println("Guess not valid");
        }
       }

    boolean endOfGame() {
        // ...
        if (guess == correct) {
            return true;
        }
        else {
            return false;
        }
    }

    void printWinner() {
        // ...
        System.out.println("Winner winner chicken dinner");
    }
}
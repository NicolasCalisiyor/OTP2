package templatemethod;

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Game game = new Coin();
        Scanner scanner = new Scanner(System.in);

        int playerCount;
        System.out.println("Give the amount of players please");
        playerCount = scanner.nextInt();

        game.playOneGame(playerCount);
    }
}

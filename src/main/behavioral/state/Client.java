package main.behavioral.state;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Client {

    public static void main(String[] args) {

        Game game = new Game();

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String input = "";

        do {
            System.out.print("--- Pleas input command: ");
            try {
                input = reader.readLine().trim().toLowerCase();
                switch (input) {
                    case "w":
                        game.state.onWelcomeScreen();
                        break;
                    case "p":
                        game.state.onPlaying();
                        break;
                    case "b":
                        game.state.onBreak();
                        break;
                    case "e":
                        game.state.onEndGame();
                        break;
                    case "exit":
                        System.out.println("--- Good bye! ---");
                        break;
                    default:
                        System.out.println("--- Unknown command! ---");
                        break;
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

        } while (!input.equals("exit"));

    }

}

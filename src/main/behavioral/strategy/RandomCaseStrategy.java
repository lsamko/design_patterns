package main.behavioral.strategy;

import java.util.Random;

public class RandomCaseStrategy implements PrintStrategy {

    Random random = new Random();


    @Override
    public String formatString(String input) {
        String output = "";
        for (Character c : input.toCharArray()) {
            if (random.nextBoolean()) {
                output += c.toString().toUpperCase();
            } else {
                output += c.toString().toLowerCase();
            }
        }
        return output;
    }
}

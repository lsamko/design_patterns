package main.behavioral.strategy;

public class Client {

    public static void main(String[] args) {
        LowercaseStrategy lowercaseStrategy = new LowercaseStrategy();
        UppercaseStrategy uppercaseStrategy = new UppercaseStrategy();
        RandomCaseStrategy randomCaseStrategy =new RandomCaseStrategy();
        String input = "LOREM ipsum DOLOR sit amet";

        Executor executor = new Executor(lowercaseStrategy);
        executor.printString(input);

        System.out.println("--");
        executor.strategy = uppercaseStrategy;
        executor.printString(input);

        System.out.println("--");
        executor.strategy = randomCaseStrategy;
        executor.printString(input);
        executor.printString(input);
        executor.printString(input);
    }

}

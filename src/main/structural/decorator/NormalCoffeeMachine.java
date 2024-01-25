package main.structural.decorator;

public class NormalCoffeeMachine implements CoffeeMachine{

    @Override
    public void makeSmallCoffee() {
        System.out.println("Normal coffee machine: Making a small coffee");
    }

    @Override
    public void makeLargeCoffee() {
        System.out.println("Normal coffee machine: Making a large coffee");
    }
}

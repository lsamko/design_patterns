package main.structural.decorator;

public class EnhancedCoffeeMachine implements CoffeeMachine {

    private final NormalCoffeeMachine machine;

    public EnhancedCoffeeMachine(NormalCoffeeMachine machine) {
        this.machine = machine;
    }

    //override behavior
    @Override
    public void makeSmallCoffee() {
        System.out.println("Enhanced coffee machine: Making a small coffee");
    }

    //unaltered behavior
    @Override
    public void makeLargeCoffee() {
        machine.makeLargeCoffee();
    }

    //Extended behavior

    public void makeMilkCoffee(){
        System.out.println("Enhanced coffee machine: Making milk coffee");
        machine.makeLargeCoffee();
        System.out.println("Enhanced coffee machine: Adding milk");
    }

}

package main.creational.prototype;

public class Bycicle extends Vehicle {

    public String color;

    public Bycicle(int wheels, long price, String color) {
        this.wheels = wheels;
        this.price = price;
        this.color = color;
    }

    public Bycicle(Bycicle target) {
        super(target);
        if (target != null) {
            color = target.color;
        }
    }

    @Override
    public Vehicle clone() {
        return new Bycicle(this);
    }

    @Override
    public boolean isClone(Vehicle target) {
        if (target instanceof Bycicle) {
            Bycicle t = (Bycicle) target;
            if (color.equals(t.color) && wheels == t.wheels && price == t.price) {
                System.out.println(this + " and " + t + " are clones");
                return true;
            }
        }
        System.out.println(this + " and " + target + " are NOT clones");
        return false;
    }
}

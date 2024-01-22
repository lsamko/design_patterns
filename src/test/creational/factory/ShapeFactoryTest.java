package test.creational.factory;

import static org.junit.Assert.assertEquals;

import main.creational.factory.Shape;
import main.creational.factory.ShapeFactory;
import org.junit.Test;

public class ShapeFactoryTest {

    ShapeFactory factory = new ShapeFactory();
    Shape roundFood = factory.getFood("Round");
    Shape cylinderFood = factory.getFood("Cylinder");


    @Test
    public void factoryMethodTest() {
        assertEquals("Round", roundFood.getShape());
        assertEquals("Cylinder", cylinderFood.getShape());
    }
}

package main.creational.builder;

public class Client {

    public static void main(String[] args) {
        ApartmentBuilder builder = new ApartmentBuilder();

        Apartment ap1 = builder
            .setMeters(25)
            .setRooms(2)
            .setCity("Kyiv")
            .setArea("Ukraine")
            .setKitchen(true)
            .build();
        ap1.display();

        Apartment ap2 = builder
            .setRooms(5)
            .setCity("Paris")
            .build();
        ap2.display();
    }
}

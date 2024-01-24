package main.creational.builder;

public class Apartment {

    private int meters;
    private int rooms;
    private String city;
    private String area;
    private boolean kitchen;

    public Apartment(int meters, int rooms, String city, String area, boolean kitchen) {
        this.meters = meters;
        this.rooms = rooms;
        this.city = city;
        this.area = area;
        this.kitchen = kitchen;
    }

    public int getMeters() {
        return meters;
    }

    public int getRooms() {
        return rooms;
    }

    public String getCity() {
        return city;
    }

    public String getArea() {
        return area;
    }

    public boolean isKitchen() {
        return kitchen;
    }

    public void display() {
        System.out.println("Appartment has: ");
        if (meters != -1) {
            System.out.println(meters + " meters");
        }
        if (rooms != 1) {
            System.out.println(rooms + " rooms");
        }
        if (city != "") {
            System.out.println("Apartment is in " + city);
        }
        if (area != "") {
            System.out.println("Apartment is in " + area);
        }
        if (kitchen){
            System.out.println("Apartment has a kitchen");
        }
        System.out.println("-----------");
    }

}

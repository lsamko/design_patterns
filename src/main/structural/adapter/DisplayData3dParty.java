package main.structural.adapter;

public class DisplayData3dParty {

    public float index;
    public String data;

    public DisplayData3dParty(float index, String data) {
        this.index = index;
        this.data = data;
    }

    public void displayData() {
        System.out.println("Data is displayed: " + index + " - " + data);
    }
}

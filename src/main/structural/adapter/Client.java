package main.structural.adapter;

import java.util.List;

public class Client {

    public static void main(String[] args) {

        DatabaseDataGenerator dataGenerator = new DatabaseDataGenerator();
        DisplayDataAdapter dataAdapter = new DisplayDataAdapter();

        List<DisplayData3dParty> legacyData = dataAdapter.convertData(dataGenerator.generateData());

        for (DisplayData3dParty datum : legacyData) {
            datum.displayData();
        }
    }
}

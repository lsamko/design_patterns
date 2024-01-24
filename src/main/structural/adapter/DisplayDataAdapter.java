package main.structural.adapter;

import java.util.ArrayList;
import java.util.List;

public class DisplayDataAdapter implements DatabaseDataConverter {

    @Override
    public List<DisplayData3dParty> convertData(List<DatabaseData> databaseData) {
        List<DisplayData3dParty> returnList = new ArrayList<>();
        for (DatabaseData datum : databaseData) {
            float index = datum.position;
            String data = Integer.toString(datum.amount);
            DisplayData3dParty data3dParty = new DisplayData3dParty(index, data);
            returnList.add(data3dParty);
        }
        return returnList;
    }
}

package main.structural.adapter;

import java.util.List;

public interface DatabaseDataConverter {

    List<DisplayData3dParty> convertData(List<DatabaseData> databaseData);

}

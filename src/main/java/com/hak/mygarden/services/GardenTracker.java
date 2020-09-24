package com.hak.mygarden.services;

import com.hak.mygarden.jdbc.JDBCClient;
import com.hak.mygarden.models.Plant;

import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

@Service
public class GardenTracker {

    public static void storeData(Plant plant) throws IOException {
        File plant_data = new File("plant_data.csv");
        Boolean has_created = plant_data.exists();
        FileWriter fileWriter = new FileWriter(plant_data, true);
        if (!has_created)
            fileWriter.write("ID, Name, Scientific Name, Quantity, Birthday\n");
        fileWriter.write(plant.toString());
        fileWriter.write("\n");
        fileWriter.flush();
        fileWriter.close();
    }

    @PostConstruct
    public static void execute() throws IOException{
////        Plant plant= new Plant(1,"a","b","c","d");
////        storeData(plant);
//        // DB name is PLANT
//        String sql = "INSERT INTO PLANT " + "VALUES (1,'a','b','c','d')";
//        JDBCClient client = new JDBCClient();
//        client.insertPlant(sql);
    }
}

/* Code to sort csv and display
 else {
            FileReader fileReader = new FileReader("plant_data.csv");
            CSVReader csvReader = new CSVReaderBuilder(fileReader)
                    .withSkipLines(1)
                    .build();
            List<String[]> allData= csvReader.readAll();
            Collections.sort(allData, (strings, otherStrings) -> 1 * (strings[0].compareTo(otherStrings[0])));
            for (int c = 0; c < allData.size(); c++)
                System.out.println(allData.get(c)[0]);

        }
 */
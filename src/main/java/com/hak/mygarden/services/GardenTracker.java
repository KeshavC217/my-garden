package com.hak.mygarden.services;

import com.hak.mygarden.models.Plant;

import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;
import com.opencsv.exceptions.CsvException;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


@Service
public class GardenTracker {
    public static void storeData(Plant plant) throws IOException, CsvException {
        File plant_data = new File("plant_data.csv");
        Boolean has_created = plant_data.exists();
        FileWriter fileWriter = new FileWriter(plant_data, true);
        if (!has_created)
            fileWriter.write("Name, Scientific Name, Quantity, Birthday\n");
        fileWriter.write(plant.toString());
        fileWriter.write("\n");
        fileWriter.flush();
        fileWriter.close();
    }

    @PostConstruct
    public static void execute() throws IOException, CsvException{
        Plant plant= new Plant("a","b","c","d");
        storeData(plant);
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
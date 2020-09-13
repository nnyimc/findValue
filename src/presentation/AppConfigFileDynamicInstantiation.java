package presentation;

import metier.ISearch;
import metier.ISort;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class AppConfigFileDynamicInstantiation {
    public static void main(String[] args) {
        int[] intArray = {-8,4,0,-2,7,6,-1,5,100,4,1,24,6,-9,-5,-5,-8,-7,4,4,1,1,0,2};

        // Retrieving class name from the config file
        File file = new File("config.txt");
        try {
            BufferedReader br = new BufferedReader(new FileReader(file));
            // Assigning className to a variable
            String sortClassName = br.readLine();
            String searchClassName = br.readLine();

            // Forcing JVM to the corresponding load byte code in memory
            Class cSort = Class.forName(sortClassName);
            Class cSearch = Class.forName(searchClassName);

            // Checking if the noArgsConstructor exists before instantiating dynamically
            ISort sorter = (ISort) cSort.newInstance();
            ISearch searcher = (ISearch) cSearch.newInstance();

            if(searcher.searchInt(-2, sorter.sortArray(intArray))) {
                System.out.println("Your value has been found!");
            } else {
                System.out.println("Unknown value.");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}

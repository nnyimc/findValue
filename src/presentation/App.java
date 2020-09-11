package presentation;

import metier.Search;
import metier.Sort;

public class App {
    public static void main(String[] args) {
        int[] intArray = {-8,4,0,-2,7,6,-1,5,100,4,1,24,0,43,2,4,7,49,7,-1,10,-6,-9,-5,-5,-8,-7,4,4,1,1,0,2};

        Sort sorter = new Sort();
        sorter.sortArray(intArray);

        Search searcher = new Search();
        if(searcher.searchInt(9, sorter.sortArray(intArray))) {
            System.out.println("Your value has been found!");
        } else {
            System.out.println("Unknown value.");
        }
    }
}

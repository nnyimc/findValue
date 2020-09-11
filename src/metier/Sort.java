package metier;

import java.util.List;

public class Sort implements ISort {

    @Override
    public int[] sortArray(int[]intArray) {

        for(int i = 0; i < intArray.length; i++) {
           int min = intArray[i];

            for( int j = i+1; j < intArray.length;j++ ) {
                if (min > intArray[j]) {
                    int temp = min;
                    min = intArray[j];
                    intArray[i] = min;
                    intArray[j] = temp;
                }
            }
        }
        return intArray;
    }
}

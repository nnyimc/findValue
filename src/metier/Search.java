package metier;

import org.springframework.stereotype.Service;

@Service
public class Search implements ISearch {
    public Search() {
    }

    private boolean medianEqualsSoughtNumber(boolean test, int soughtNumber, int median) {
        if(soughtNumber == median) {
            test = true;
        }
        return test;
    }

    private int setNewMedian (int a, int b) {
        return a+((b-a)/2);
    }

    @Override
    public boolean searchInt(int number, int[] intArray) {
        int a = 0;
        int b = intArray.length;
        int m = intArray.length/2;

        for(int i = a; i < b; i++) {
            if (number > intArray[m]) {
                a = m;
                m = setNewMedian(a, b);
                medianEqualsSoughtNumber(false, number, intArray[m]);
            }

            if(number < intArray[m]) {
                b = m;
                m = setNewMedian(a, b);
                medianEqualsSoughtNumber(false, number, intArray[m]);
            }

        }
        return medianEqualsSoughtNumber(false, number, intArray[m]);
    }
}

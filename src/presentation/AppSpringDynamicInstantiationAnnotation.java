package presentation;

import metier.ISearch;
import metier.ISort;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppSpringDynamicInstantiationAnnotation {
    public static void main(String[] args) {
        int[] intArray = {-8,4,0,-2,7,6,-1,5,1,-9,-5,-5,-8,-7,4,4,1,1,0,2};

        ApplicationContext context = new AnnotationConfigApplicationContext("metier");
        ISort sort = context.getBean(ISort.class);
        ISearch search = context.getBean(ISearch.class);
        if(search.searchInt(-6,sort.sortArray(intArray))) {
            System.out.println("Your value has been found");
        } else {
            System.out.println("Unknown value.");
        }

    }
}

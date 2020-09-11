package presentation;

import metier.ISearch;
import metier.ISort;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppXmlSpringDynamicInstantiation {
    public static void main(String[] args) {
        int[] intArray = {-8,4,0,-2,7,6,-1,5,1,-9,-5,-5,-8,-7,4,4,1,1,0,2};
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-ioc.xml");
        ISort sort = (ISort) context.getBean("srt");

        ISearch search = (ISearch) context.getBean("srch");
        if (search.searchInt(-11, sort.sortArray(intArray))) {
            System.out.println("Your value has been found!");
        } else {
            System.out.println("Unknown value.");
        }
    }
}

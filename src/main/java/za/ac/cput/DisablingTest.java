package za.ac.cput;

import java.lang.reflect.Array;
import java.util.*;

public class DisablingTest {

    private List months = new ArrayList();

    public DisablingTest() {
        months = new ArrayList();
        months.add("January");
        months.add("February");
        months.add("March");
        months.add("April");
        months.add("May");
        months.add("June");
        months.add("July");
        months.add("August");
        months.add("September");
        months.add("October");
        months.add("November");
        months.add("December");
    }

    public List<String> Months(){
      return months;
    }
}

package za.ac.cput;

import com.sun.org.apache.xpath.internal.SourceTree;

public class ObjectIdentity {

    String carColour1 = "Red";
    String carColour2 = "Blue";

    public String Honda(){
        return carColour1;
    }

    public String BMW(){
        return  carColour2;
    }

    public String Nissan(){
        return carColour1;
    }
}

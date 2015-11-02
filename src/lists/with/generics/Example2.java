package lists.with.generics;

import java.util.*;

public class Example2 {

    public static void main(String[] args) {

        // AUTO BOXING, UNBOXING OF PRIMITIVES/OBJECTS
        
        // The old way to convert from primitive to object and back again.
        // Set your project properties source format to JDK 1.4
        Integer objInt = new Integer(5);
        int x = objInt; // won't compile on JDK 1.4 or lower
        int y = objInt.intValue(); // this works
        
        // But on JDK 1.5 or higher you can auto box:
        objInt = 5;
        // and you can auto unbox:
        y = objInt;
    }

}

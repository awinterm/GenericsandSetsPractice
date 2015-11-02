package lists.with.generics;

import java.util.*;

/**
 * This example shows better ways of using a List due to the new features that
 * were introduced in JDK 1.5. NOTE: these features will not work in v1.4x and
 * earlier!
 *
 * New features include generics, simpler looping and auto-boxing/unboxing,
 * just to name a few of the most important ones.
 *
 * @author jlombardo
 */
public class Example3 {

    public static void main(String[] args) {

        // Remember, a Set is a sub-interface of Collection, and has no
        // get method. so you can't retrieve individual objets. But that's
        // not what it's designed for anyway. It's design to transform
        // data (remove duplicates) only.
        Set<String> mySports = new HashSet<String>();
        mySports.add("Golf");
        mySports.add("Tennis");
        mySports.add("Racketball");
        
        // There's no method to retrieve a specific item:
//        String sport = mySports.????
        
        // But you can loop over them with an Iterator and transfer the
        // items to a collection that DOES have a get method:
        List<String> sports = new ArrayList<String>(mySports);
        String sport = sports.get(1);
        
    }

}

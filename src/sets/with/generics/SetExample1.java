package sets.with.generics;

import java.util.*;

/**
 * Beginning with this example we use JDK 1.5+ Generics. Should you want
 * to accomplish the same thing with earlier JDKs, remove the generics and
 * add casts where necessary.
 *
 * @author jlombardo
 */
public class SetExample1 {
    public static void main(String[] args) {

        // Begin with a List which DOES NOT remove duplicates
        List<String> list = new ArrayList<String>();
        list.add("Chips");
        list.add("Beer");
        list.add("Beer");

        // Now loop thru the List and output the items in the order they
        // were entered to prove that lists maintain entry order, but
        // DO NOT remove duplicates:
        System.out.println("Displaying contents of list...");
        for(String item : list) {
            System.out.println(item);
        }

        // Now load the same items into a Set -- but not just any Set, this
        // is a type of Set that maintains insertion order. A normal HashSet
        // does not. However, both types remove duplicates:
        Set<String> set = new LinkedHashSet<String>(list);
        list.clear();
        list.addAll(set);
//        Set<String> set = new HashSet<String>(list);

        // Now loop thru the Set and output the items in the order they
        // were entered to prove that sets DO REMOVE DUPLICATES. Additionally,
        // a LinkedHashSet maintains insertion order.
        //
        // NOTE: after you run this the first time, try changing the
        // type of Set above to "HashSet" and run again. Notice that now
        // the order may or may not be the same as the insertion order.
        // Most Hash-type structures do not guarantee order, unless they are
        // "Linked" hashes.
        System.out.println("\nDisplaying contents of set...");
        for(String item : set) {
            System.out.println(item);
        }

    }


}

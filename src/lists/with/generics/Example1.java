package lists.with.generics;

import java.util.*;

/**
 * This example shows 3 ways to loop over a generified collection.
 *
 * @author jlombardo
 */
public class Example1 {

    public static void main(String[] args) {

        List<String> mylist = new ArrayList<String>();
        mylist.add("Paul McArtnery");
        mylist.add("Ringo Star");
        mylist.add("John Lennon");
        mylist.add("George Harrison");
        mylist.add("Ringo Star");
        
        Collection<String> noDupes = new HashSet<String>(mylist);
       
        String beatle = null;
        
        // The old,traditional for loop
        for(int i = 0; i < mylist.size(); i++) {
            beatle = mylist.get(i);
            System.out.println(beatle);
        }

        for(String s : noDupes) {
            beatle = s;
            System.out.println(beatle);
        }

        // An alternative looping strategy using Iterator
        Iterator<String> i = mylist.iterator();
        while( i.hasNext() ) {
            beatle = i.next();
            System.out.println(beatle);
        }

        // Yet another alternative looping strategy using Iterator
        // Notice the increment field of the for loop is empty
        for(Iterator<String> itr = mylist.iterator(); itr.hasNext(); ) {
            beatle = itr.next();
            System.out.println(beatle);
        }
        
        // Why are Iterators used? Because they allow you to loop over
        // any kind of collection, including those that do not have a get
        // method, such as a Set. Also, some Iterator methods will throw
        // an excpetion if the underlying collection has changed.
        
        // If you are running on JDK1.4, for example, you cannot use the
        // new enhanced for loop. So Iterator (without generics) can do
        // it in a similar fashion -- no index value needed.
    }

}

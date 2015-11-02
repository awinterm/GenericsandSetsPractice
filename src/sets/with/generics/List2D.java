package sets.with.generics;

import common.Employee;
import java.util.*;

/**
 * In this example we demonstrate how a Set actually handles duplicate
 * removal. All that is required is a proper override of the equals() and
 * hashCode() methods inherited from the Object class.
 *
 * Note that duplicate Employee objects are determined by the rules you
 * program into the equals method in the Employee class. The default
 * implementation will not work, which you can easily see by commenting out
 * the method in the Employee class. This results in the inherited (invisible)
 * version being used.  (Can you say "Inheritance is dangerous!").
 *
 * @author jlombardo
 */
public class List2D {
    public static void main(String[] args) {

        // HOW ABOUT a 2-D List? Easy as pie... and any data types are valid..
        
        /*
         * Image a grid that looks like this (any content would work):
         * 
         * ___________col 0_________col 1______
         * row 0 |  Bob Smith  |  bob@isp.com  |
         * ______|_____________|_______________|
         * row 1 |  Jane Doe   | jdoe@isp.com  |
         * ______|_____________|_______________|
         */
        
        final int NAME = 0;
        final int EMAIL = 1;
        
        List<List> rows = new ArrayList<List>();
        List<String> cols = null;
        
        // Add first record
        cols = new ArrayList<String>();
        cols.add("Bob Smith");
        cols.add("bob@isp.com");
        rows.add(cols);
        // Add 2nd record
        cols = new ArrayList<String>();
        cols.add("Jane Doe");
        cols.add("jdoe@isp.com");
        rows.add(cols);
        
        // find jane doe's email address
        System.out.println("A found email:");
        String emailAddress = null;
        for(List<String> record : rows) {
            if(record.get(NAME).equals("Jane Doe")) {
                emailAddress = record.get(EMAIL);
                System.out.println("Found email: " + emailAddress);
                break;
            }
        }
        
        // Or, maybe just do a report:
        System.out.println("\nA report:");
        for(List<String> record : rows) {
            System.out.println(record.get(NAME) + ", " + record.get(EMAIL));
        }
        
        
        // What about 3-D, 4-D, etc? Now you're just being silly!
        // But you could if you like mind games :)

    }


}

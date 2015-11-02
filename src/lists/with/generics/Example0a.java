package lists.with.generics;

import java.util.*;

public class Example0a {
    public static void main(String[] args) {
        // A simple list -- one data type, no generics (JDK 1.1 - 1.4)
        // Object values must be cast when retrieved
        // Change "ArrayList" to "Vector" to see Liskov Substitution
        // Any object can be stored, but good to keep them the same
        List shoppingList = new ArrayList();
        shoppingList.add("Beer");
        shoppingList.add("Chips");
        shoppingList.add("Salsa");
        shoppingList.add("Beer"); // notice duplicate entry!
               
        
        // Retrieve a single item by its index (notice cast)
        String item1 = (String)shoppingList.get(2);
        
        // Now retrieve each item and output to console (notice cast)
        System.out.println("Original Shopping List:");
        for(int i=0; i < shoppingList.size(); i++) {
            String s = (String)shoppingList.get(i);
            System.out.println(s);
        }
        
        // Now let's try this again with the new Generics feature (JDK 1.5+)
        // List is limited to one data type only
        List<String> shoppingList2 = new ArrayList<String>();
        shoppingList2.add("Beer");
        shoppingList2.add("Chips");
        shoppingList2.add("Salsa");
        shoppingList2.add("Beer"); // notice duplicate entry!
        
        // Now retrieve an item without a cast needed
        String item2 = shoppingList2.get(2);
        
        // Now we can retrieve each item without a cast using the
        // new for-loop
        System.out.println("\nGenerified shopping list:");
        for(String s : shoppingList2) {
            System.out.println(s);
        }
        
        // Now let's create a Set to remove duplicates  
        // Generics not used in this example
        Set noDupes = new HashSet(shoppingList);
        // copy the results back to original -- no dupes!
        shoppingList = new ArrayList(noDupes);
        
        // Use new for loop to output results -- cast required
        System.out.println("\nList after dupes removed:");
        for(Object obj : shoppingList) {
            String s = (String)obj;
            System.out.println(s);
        }
        
        // Now let's use Generics to do the same stuff
        System.out.println("\nGenerified list after dupes removed");
        Set<String> noDupes2 = new HashSet<String>(shoppingList2);
        shoppingList2 = new ArrayList<String>(noDupes2);
        for(String s : shoppingList2) {
            System.out.println(s);
        }
        
        // We can also get at the Set contents directly, but there is no
        // get method in a Set
        System.out.println("\nSet contents:");
        for(String s : noDupes2) {
            System.out.println(s);
        }
        
        // Now let's insert an element at a specific postion and
        // push the current and all following elements down in the list,
        // effectively increasing the size of the list
        shoppingList.add(2, "Steak");
        // Notice the size has changed!
        System.out.println("\nShopping List size after insert: " 
                + shoppingList.size());
        // See the whole list
        for(int i=0; i < shoppingList.size(); i++) {
            String s = (String)shoppingList.get(i);
            System.out.println(s);
        }
        
        
        // We can also replace an element in the list without a resize
        shoppingList.set(2, "Beans");
        System.out.println("\nShopping List size after replacement: " 
                + shoppingList.size());
        // See the whole list
        for(int i=0; i < shoppingList.size(); i++) {
            String s = (String)shoppingList.get(i);
            System.out.println(s);
        }

        // And, finally, we can remove an element, effectively 
        // shrinking the list
        shoppingList.remove(0);
        System.out.println("\nShopping List size after removal: " 
                + shoppingList.size());
        // See the whole list
        for(int i=0; i < shoppingList.size(); i++) {
            String s = (String)shoppingList.get(i);
            System.out.println(s);
        }

    }
}

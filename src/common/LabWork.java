/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package common;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 *
 * @author andre_000
 */
public class LabWork {
    
    public static void main(String[] args) {
//      1.  Using instructor sample project “GenericsAndSets” as a guide, create a List
//      (choose from Vector or ArrayList) of your favorite hobby items, where each
//      item is represented as a String value. Do not use generics. Populate the list
//      with at least three items. Then loop through the list and print out the contents
//      to the console. Don’t forget to cast items as your retrieve them for output.
//      Next, insert some new items, then run the loop again, showing that the items 
//      were indeed added. Now remove one or two items and run the loop again to
//      verify the removal worked.
        
        List hobbyItems = new ArrayList();
        hobbyItems.add("Fish tank");
        hobbyItems.add("Telescope");
        hobbyItems.add("microphone");
        // old style 
        System.out.println("Hobby Item List orginal: ");
        for(int i=0; i < hobbyItems.size(); i++) {
            String s = (String)hobbyItems.get(i);
            System.out.println(s);
        }
        
        hobbyItems.add("comicbook");
        hobbyItems.add("pickaxe");
        
        System.out.println("Hobby Item List with additions: ");
        // new style using object as a
        for (Object hobbyItem : hobbyItems) {
            String s = (String) hobbyItem;
            System.out.println(s);
        }
        
        hobbyItems.remove("pickaxe");
        hobbyItems.remove("comicbook");
        
        
        System.out.println("Hobby Item List After removal:");
        
        for (Object hobbyItem : hobbyItems) {
            String s = (String) hobbyItem;
            System.out.println(s);
        }
        
        
        System.out.println("*********** Challenge 2 ****************");
        
//        Create a new List consisting of three Employee objects (use the Employee
//        class provided in the GenericsAndSets sample project under the “common”
//        package. Use generics to create your list. Now loop through the list (using the
//        new for-each style) and print out some meaningful information about each
//        object. Verify that no cast was necessary. Do you use toString()?
        
        List<Employee> employeeList = new  ArrayList<Employee>();
        
        employeeList.add(new Employee("Wintermyer", "Drew", "1111111111"));
        employeeList.add(new Employee("Wintermyer", "Andrew", "2222222222"));
        employeeList.add(new Employee("Wintermyer", "Andres", "3333333333"));
        
        
        
        for (Employee e : employeeList){
            System.out.println(e.getSsn());
            System.out.println(e.toString());
        }
        
        System.out.println("********************* CHALLENGE 3 ************************");
        
        List twoObjectList = new ArrayList();
        
        twoObjectList.add(new Employee("Wintermyer", "Drew", "1111111111"));
        twoObjectList.add(new Dog("The Scamp", 12345));
        
        for(int i = 0; i < twoObjectList.size(); i++){
            Object obj = twoObjectList.get(i);
            if(obj instanceof Employee){
                Employee e = (Employee)obj;
                System.out.println(e);
            }
            if(obj instanceof Dog){
                Dog d = (Dog)obj;
                System.out.println(d);
            }
        }
        
        
        
        for (Object e : twoObjectList){
            System.out.println(e.toString());
        }
        
        System.out.println("********************* CHALLENGE 4 ************************");
        
        List<Employee> employeeList1 = new  ArrayList<Employee>();
        
        employeeList1.add(new Employee("Wintermyer", "Drew", "1111111111"));
        employeeList1.add(new Employee("Wintermyer", "Andrew", "2222222222"));
        employeeList1.add(new Employee("Wintermyer", "Andres", "3333333333"));
        employeeList1.add(new Employee("Wintermyer", "Drew", "1111111111"));
        employeeList1.add(new Employee("Wintermyer", "Andrew", "2222222222"));
        employeeList1.add(new Employee("Wintermyer", "Andres", "3333333333"));
        
        for( Employee e : employeeList1){
            System.out.println(e.toString());
        }
        Set noDupes = new HashSet(employeeList1);
        
        employeeList1 = new ArrayList(noDupes);
        noDupes = null;
        
        System.out.println("Used a set to remove dupes.");
        for( Employee e : employeeList1){
            System.out.println(e.toString());
        }
        
        
    }
    
    
}

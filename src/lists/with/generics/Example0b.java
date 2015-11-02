package lists.with.generics;

import common.Dog;
import common.Employee;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Example0b {
    public static void main(String[] args) {
        // A list can store objects of different types, but when you
        // do that you can't use generics
        List shoppingList = new ArrayList();
        shoppingList.add("Beer");
        shoppingList.add(new Date());
        shoppingList.add(new Dog("Fido", 1));
        shoppingList.add(new Dog("Max", 2));
        shoppingList.add(new Dog("Jake", 1)); // notice duplicate entry by id!
        shoppingList.add(new Employee("Smith", "John", "333-33-3333"));
        
        // But when you do that you must keep track of the position of
        // every object
        Date date = (Date)shoppingList.get(1);
        // ... or, do something ugly and fragile like this:
        Object obj1 = shoppingList.get(1); 
        Dog dog = null;
        Employee employee = null;
        // Ugly, fragile, horrible mess!
        if(obj1 instanceof Date) {
            date = (Date)obj1;
        } else if(obj1 instanceof Dog) {
            dog = (Dog)obj1;
        } else if(obj1 instanceof Employee) {
            employee = (Employee)obj1;
        }
        
        // ADVICE: store one data type per collection if at all possible!!!

    }
}

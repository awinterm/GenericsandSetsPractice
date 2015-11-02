package sets.with.generics;

import common.Employee;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class EqualsSample {
    public static void main(String[] args) {
        
        Employee e1 = new Employee("Doe", "John", "333-33-3333");
        Employee e2 = new Employee("Doe", "John", "444-44-4444");
        
        Set<Employee> employees = new TreeSet<Employee>();
        employees.add(e1);
        employees.add(e2);
        
        e2.setSsn("333-33-3333");
        
        employees = new HashSet<Employee>(employees);
        
        // If you run this with the equals method as provided, the
        // duplicates, based on ssn, are removed. But try commenting out
        // the equals and hashCode methods in the Employee class and run
        // again. Now the dupes are not removed because the default equals
        // implementation inherited from Object is used and that just
        // compares memory locations -- they will never be equal!!!
        for(Employee e : employees) {
            System.out.println(e);
        }
        

//        System.out.println(e1);
//
//        if(e1.equals(e2)) {
//            System.out.println("Employees are the same");
//        } else {
//            System.out.println("Employees are NOT the same");
//        }
    }
}

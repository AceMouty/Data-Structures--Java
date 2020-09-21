package arraylists;

import java.util.ArrayList;
import java.util.List;

public class Main 
{
    public static void main(String[] args) {
        
        // Default capacity is 10 for an ArrayList
        // Array list come with a set of methods out of the box
        // that allow us to easily work with it.

        // ArrayList also grow dynamically versus an Array which is a static size.
        List<Employee> employeeList = new ArrayList<>();

        // Add items to an ArrayList
        // you can also pass an optional param to add which is the index
        // .add(index, item)
        employeeList.add(new Employee("Jane", "Jones", 123));
        employeeList.add(new Employee("John", "Doe", 4567));
        employeeList.add(new Employee("Mary", "Smith", 22));
        employeeList.add(new Employee("Mike", "Wilson", 25));

        System.out.println("*** Print out ALL employees in the list ***");
        employeeList.forEach((emp) -> System.out.println(emp));


        // Index an ArrayList
        System.out.println("\n*** Indexing an ArrayList ***");
        System.out.println(employeeList.get(1));
        System.out.println(employeeList.get(2));

        System.out.println("\n*** Check if the ArrayList is empty or not ***");
        // Check that the array list is empy -> Returns a bool
        System.out.println(employeeList.isEmpty());

        System.out.println("\n*** Update data in the array list ***");
        System.out.println("Employee at index 1 before update");
        System.out.println(employeeList.get(1));
        System.out.println("Updating index 1...");

        // Update data in the Array List
        employeeList.set(1, new Employee("John", "Adams", 4568));
        System.out.println("After the update...");
        System.out.println(employeeList.get(1));

        System.out.println("\n*** Get the size of the ArrayList ***");
        // Get the size
        System.out.println(employeeList.size());

        System.out.println("\n*** Convert the ArrayList to an Array");
        Employee[] employeeArray = employeeList.toArray(new Employee[employeeList.size()]);
        for(Employee emp: employeeArray)
        {
            System.out.println(emp);
        }

        System.out.println("\n*** Check to see if a list contains an instance of an Object");
        // See if the list contains an employee instance
        System.out.println(employeeList.contains(new Employee("Mary", "Smith", 22)));

        System.out.println("\n*** Grab and index of a object instance in the ArrayList ***");
        for(Employee emp: employeeList)
        {
            System.out.println(emp);
        }
        // Get the index of an Object instance
        System.out.println(employeeList.indexOf(new Employee("John", "Adams", 4568)));

        //Removing items from the list
        employeeList.remove(2);
        employeeList.forEach((emp) -> System.out.println(emp));

    }
}
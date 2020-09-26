package stack;

public class Main
{
    public static void main(String[] args) 
    {
        LinkedStack employeeStack = new LinkedStack();    
        Employee[] employees = {
            new Employee("John", "Doe"),
            new Employee("Sally", "May"),
            new Employee("Joey", "Guzman")
        };

        for(int i = 0; i < employees.length; i++)
        {
            employeeStack.push(employees[i]);
        }

        // System.out.println(employeeStack.peek().getValue());
        System.out.println(employeeStack.length());
        ListNode oldNode = employeeStack.pop();
        System.out.println(oldNode.getValue());
        oldNode = employeeStack.pop();
        System.out.println(oldNode.getValue());
        System.out.println("The stack is currently empty: " + employeeStack.isEmpty());
        oldNode = employeeStack.pop();
        System.out.println(oldNode.getValue());
        System.out.println("The stack is currently empty: " + employeeStack.isEmpty());
        oldNode = employeeStack.pop();
        System.out.println(oldNode);

    }
}
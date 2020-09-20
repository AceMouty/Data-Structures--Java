package list;

public class Main
{
    // Access modifiers
    // Access modifiers can be applied to fields / class data and methods
    
    // public -> Anyone can access the method or field
    
    // protected -> Its family secrets, only parent class and its children can access 
    // the data and methods
    // private -> Only the class can access this data NO ONE ELSE
    
    // default -> Anyone in the same package / space can access the methods and data in a class


    public static void main(String[] args) {
        LinkedList scores = new LinkedList();
        scores.append(1);
        scores.append(2);
        scores.append(3);
        scores.append(4);
        scores.append(5);
        scores.append(6);
        scores.append(7);
        scores.deleteNode(6);
        System.out.println("AFTER THE REMOVE");
        scores.print();
    }
}
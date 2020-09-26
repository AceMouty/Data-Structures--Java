package list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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

        List<Integer> highScores = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10,11));

        for(int score: highScores)
        {
            scores.append(score);
        }
        
        System.out.println("Current list size is: " + scores.getSize());
        scores.deleteNode(6);
        System.out.println("AFTER THE REMOVE");
        System.out.println("Current list size is: " + scores.getSize());
        scores.printList();
        
    }
}
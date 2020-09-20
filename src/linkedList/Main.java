
package linkedList;

import java.util.Arrays;
import java.util.List;

public class Main 
{
    public static void main(String args[])   
    {
        // TODO: Write the following in a test case
        // Try to load in 11 values to the LL and ensure only 10 make it in
        ScoreList highScores = new ScoreList();
        List<Integer> scores = Arrays.asList(32,54,88,200,78800,87,5778,5,90,5779,20000);
        for(int score: scores)
        {
            highScores.appendNode(score);
        }
        System.out.println(highScores.length());

        System.out.println("\n*** Delete a value from the list ***");
        highScores.deleteNode(5);
        highScores.print();

        System.out.println("\n*** Try to remove value that does NOT exist in the list ***");
        highScores.deleteNode(5);
        highScores.print();
    }
}

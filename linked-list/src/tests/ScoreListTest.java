package tests;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import linkedList.*;

public class ScoreListTest {
    @Test
    public void testListSize()
    {
        ScoreList highScores = new ScoreList();
        List<Integer> scores = Arrays.asList(32,54,88,200,78800,87,5778,5,90,5779,20000);
        for(int score: scores)
        {
            highScores.appendNode(score);
        }
        assertEquals(10, highScores.length());
    }
}

package palindrome;

import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedStack {
    /*
        Methods to implement
        - push
        - pop
        - peek
        - print
        - isEmpty
    */

    private LinkedList<Character> storage;
    private int size;

    public LinkedStack()
    {
        this.storage = new LinkedList<>();
    }

    public void push(char letter)
    {
        storage.push(letter);
        this.size++;
    }

    public Character pop()
    {
        if(this.size > 0)
        {
            this.size--;
            return storage.pop();
        }

        return null;
    }

    public Character peek()
    {
        if(this.size > 0)
        {
            return storage.peek();
        }

        return null;
    }

    public void print()
    {
        ListIterator<Character> iteratror = storage.listIterator();
        while(iteratror.hasNext())
        {
            System.out.println(iteratror.next());
        }
    }

    public boolean isEmpty()
    {
        return storage.isEmpty();
    }

}

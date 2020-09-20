package list;

import java.util.ArrayList;
import java.util.List;

public class LinkedList
{
    private ListNode head;
    private ListNode tail;
    private int size = 0;
    public static final int limit = 10;

    public LinkedList()
    {}

    public void append(int nodeValue)
    {
        // TODO Add in a check to see if we are at the limit or not
        ListNode newNode = new ListNode(nodeValue);

        // Check if the head is null
        if(this.head == null && this.tail == null)
        {
            this.head = newNode;
            this.tail = newNode;
        } else {

            ListNode currNode = this.head;
            ListNode prevNode = this.head;

            // Traverse the list
            while(currNode.getNextNode() != null)
            {
                // System.out.println("STUCK");
                // System.out.println("CURRENT NODE VALUE: " + currNode.getValue());
                // System.out.println("NEXT NODE FROM CURRENT: " + currNode.getNextNode().getValue());
                prevNode = currNode;
                currNode = currNode.getNextNode();
                
            }

            // Wire the two nodes together
            currNode.setNextNode(newNode);
            newNode.setPrevNode(currNode);
            this.tail = newNode;
        }

        this.size = size + 1;

    }

    public ListNode deleteNode(int listIndex)
    {

        // Check that the index passed is in range
        if (listIndex <= this.size)
        {
            /* 3 
             index's
             1, 2, 3, 4, 5, 6, 7 
             -> conter = 2
             (len) 7 - (index) 3 = 4

             is 2 less than 4?
                if so traverse from the head of the list
                and return the found node at the index passed
             else
                traverse from the tail of the list
                and return the found node at the index passed

            


            */  

            if(listIndex == 1){
                // Operate on the head
                ListNode deletedNode = this.head;

                // Set the head of the list
                this.head = this.head.getPrevNode();
                this.head.setPrevNode(null);

                return deletedNode;

            }
            else if (listIndex == this.size)
            {
                // operate on the tail
                ListNode deletedNode = this.tail;
                this.tail = this.tail.getPrevNode();
                this.tail.setNextNode(null);

                return deletedNode;
            }
            else 
            {
                 // traverse....
                int counter = 1;
                int tailHops = this.size - listIndex;

                // moving forward is our while loop
                while(counter < listIndex)
                {
                    counter = counter + 1;
                }

                ListNode currNode;
                ListNode prevNode;

                if(counter <= tailHops)
                {
                    currNode = traverseHead(counter);
                } else
                {
                    currNode = traverseTail(tailHops);
                }

                ListNode deletedNode = currNode;
                prevNode = currNode.getPrevNode();

                // Connect prev and next nodes together
                prevNode.setNextNode(currNode.getNextNode());
                currNode = currNode.getNextNode();
                currNode.setPrevNode(prevNode);

                return deletedNode;
            }

        }

        return null;
    }

    private ListNode traverseTail(int target)
    {
        int counter = 0;
        ListNode currNode = this.tail;
        while(counter < target)
        {
            currNode = currNode.getPrevNode();
            counter = counter + 1;
        }

        return currNode;

    }

    private ListNode traverseHead(int target)
    {
        int counter = 0;
        ListNode currNode = this.head;
        while(counter < target)
        {
            currNode = currNode.getNextNode();
            counter = counter + 1;
        }
        return currNode;
    }

    // Print the linked list sorted in descending order
    public void print()
    {
        List<Integer> scores = new ArrayList<>();
        ListNode currNode = this.head;
        while(true)
        {

            scores.add(currNode.getValue());
            currNode = currNode.getNextNode();
            if(currNode.getNextNode() == null)
            {
                scores.add(currNode.getValue());
                break;
            }
            
        }

        if(scores.size() > 1)
        {
            scores.sort((v1, v2) -> v2.compareTo(v1));
            for(int score: scores)
            {
                System.out.println(score);
            }
        } 
    }

    // Created for debugging purposes
    // prints the list in the current order without sorting
    public void printList()
    {
        ListNode currNode = this.head;
        while(true)
        {
            System.out.println(currNode.getValue());
            currNode = currNode.getNextNode();
            if(currNode == null)
            {
                break;
            }
        }
    }
}

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
        // If the size of the list is at the limit, do nothing
        if(size < limit)
        {
            ListNode newNode = new ListNode(nodeValue);

            // Check if the head is null
            if(this.head == null && this.tail == null)
            {
                this.head = newNode;
                this.tail = newNode;
            } else {

                ListNode currNode = this.head;

                // Traverse the list
                while(currNode.getNextNode() != null)
                {
                    currNode = currNode.getNextNode();
                }

                // Wire the two nodes together
                currNode.setNextNode(newNode);
                newNode.setPrevNode(currNode);
                this.tail = newNode;
            }

            this.size = size + 1;
        }

    }

    public ListNode deleteNode(int listIndex)
    {

        // Check that the index passed is in range
        if (listIndex <= this.size)
        {
            /* 3 
             index's
             1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11
              
             -> index passed represents hops from the head node: 3 (list index)
             -> represents hops from the tail node: (len of the list) 7 - (list index to remove) 3 = 4

             is 3 less than 4?
                if so traverse from the head of the list
                and return the found node at the index passed
             else
                traverse from the tail of the list
                and return the found node at the index passed

            
            3 -> represents hops from the head
            lenList - 3 -> represents hops from the tail

            is 3 less than 4?

            */  

            // If index passed is the head...
            if(listIndex == 1){
                // Operate on the head
                ListNode deletedNode = this.head;

                // Set the head of the list
                this.head = this.head.getNextNode();

                // If the head is not null, set the prev value to point to null
                if(this.head != null)
                {
                    this.head.setPrevNode(null);
                }


                this.size = size - 1;
                return deletedNode;

            }
            // If index passed is the tail...
            else if (listIndex == this.size)
            {
                // operate on the tail
                ListNode deletedNode = this.tail;
                this.tail = this.tail.getPrevNode();
                this.tail.setNextNode(null);

                this.size = size - 1;
                return deletedNode;
            }
            // Traverse the list if the index is not the head or tail index...
            else 
            {
                int counter = 1;
                int tailHops = this.size - listIndex;

                // count hops from the head
                while(counter < listIndex)
                {
                    counter = counter + 1;
                }

                ListNode currNode;
                ListNode prevNode;

                // Decide to traverse from head or tail of the list
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

                this.size = size - 1;
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

        if(currNode.getNextNode() == null)
        {
            return;
        }

        while(true)
        {
            
            if(currNode.getNextNode() == null)
            {
                scores.add(currNode.getValue());
                break;
            }

            scores.add(currNode.getValue());
            currNode = currNode.getNextNode();
            
        }

        if(scores.size() > 1)
        {
            scores.sort((v1, v2) -> v2.compareTo(v1));
            for(int score: scores)
            {
                System.out.println(score);
            }
        }
        else
        {
            System.out.println(scores.get(0));
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

    public int getSize()
    {
        return this.size;
    }
}

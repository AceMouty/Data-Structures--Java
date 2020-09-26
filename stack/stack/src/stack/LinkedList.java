package stack;

public class LinkedList {

    private ListNode head;
    private int length = 0;

    public LinkedList(){}
    
    // Add a node to our list
    public void appendNode(Employee newEmployee)
    {
        // Create a new node to be added to the list
        ListNode newNode = new ListNode(newEmployee);

        // Is the head of the list null, if so add new node to the head
        if(this.head == null)
        {
            this.head = newNode;
        } 
        // Else update the head of the list
        else
        {
            ListNode oldHead = this.head;
            this.head = newNode;
            newNode.setNext(oldHead);
            
        }

        // increment the size of the list
        this.length = this.length + 1;
    }

    public ListNode pop()
    {
        // Check that the list is not empty
        if(this.head != null)
        {

            // remove the current head and update the head.
            ListNode oldNode = this.head;
            this.head = oldNode.getNext();

            // decrement the length of the list
            this.length = this.length - 1;
            return oldNode;
        }

        return null;
    }
    
    public ListNode peek()
    {
        return this.head;
    }

    public boolean isEmpty()
    {
        return this.head == null;
    }
}

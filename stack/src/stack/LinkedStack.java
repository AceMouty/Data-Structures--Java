package stack;

public class LinkedStack 
{
    private LinkedList stack;
    private int size = 0;

    public LinkedStack()
    {
        stack = new LinkedList();
    }

    public void push(Employee newEmployee)
    {
        stack.appendNode(newEmployee);
        this.size = this.size + 1;
    }

    public ListNode pop()
    {
        if(this.size > 0)
        {
            ListNode oldNode = stack.pop();
            this.size = this.size - 1;
            return oldNode;
        }

        return null;
    }

    public ListNode peek()
    {
        ListNode topNode = stack.peek();
        return topNode;
    }

    public boolean isEmpty()
    {
        return stack.isEmpty();
    }

    public int length()
    {
        return this.size;
    }
}

package stack;

public class LinkedStack 
{
    private LinkedList stack;

    public LinkedStack()
    {
        stack = new LinkedList();
    }

    public void push(Employee newEmployee)
    {
        stack.appendNode(newEmployee);
    }

    public ListNode pop()
    {
        ListNode oldNode = stack.pop();
        return oldNode;
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

}

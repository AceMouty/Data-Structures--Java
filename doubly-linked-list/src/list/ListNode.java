package list;


public class ListNode 
{
    private ListNode prev;
    private ListNode next;
    private int value;

    public ListNode(int value)
    {
        this.value = value;
    }

    public void setPrevNode(ListNode newNode)
    {
        prev = newNode;
    }

    public void setNextNode(ListNode newNode)
    {
        next = newNode;
    }

    public void setValue(int newValue)
    {
        value = newValue;
    }

    public ListNode getPrevNode()
    {
        return prev;
    }

    public ListNode getNextNode()
    {
        return next;
    }

    public int getValue()
    {
        return value;
    }


}

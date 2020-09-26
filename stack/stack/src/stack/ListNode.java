package stack;

public class ListNode {
    private Employee value;
    private ListNode next;

    public ListNode(){}
    public ListNode(Employee value)
    {
        this.value = value;
    }


    public Employee getValue() {
        return this.value;
    }

    public void setValue(Employee value) {
        this.value = value;
    }

    public ListNode getNext() {
        return this.next;
    }

    public void setNext(ListNode next) {
        this.next = next;
    }

}

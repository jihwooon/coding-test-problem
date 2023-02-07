package interview;

public class ListNode<T> {
    public T date;
    public ListNode<T> next;

    public ListNode(final T date, final ListNode<T> next) {
        this.date = date;
        this.next = next;
    }
}


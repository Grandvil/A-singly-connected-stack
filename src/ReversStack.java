public class ReversStack {
    private Node head;
    private Node tail;

    public ReversStack(Node head, Node tail) {
        this.head = head;
        this.tail = tail;
    }

    public Node getHead() {
        return head;
    }

    public void setTailPrev(Node node) {
        tail.setPrev(node);
    }
}
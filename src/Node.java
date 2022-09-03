public class Node {
    protected Object value;
    protected Object prev;

    public Node(Object value, Object prev) {
        this.value = value;
        this.prev = prev;
    }

    public Object getValue() {
        return value;
    }

    public Object getPrev() {
        return prev;
    }

    public void setPrev(Object prev) {
        this.prev = prev;
    }
}


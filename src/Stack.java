public class Stack {
    private Node head;

    public void push(int value) {
        if (head == null) head = new Node(value, null);
        else {
            Node node = new Node(value, head);
            head = node;
        }
    }

    public Object pop() {
        Object value;
        if (head == null) return "Нет элементов!";
        else {
            value = head.value;
            head = (Node) head.prev;
        }
        return value;
    }

    public void printme() {
        if (head == null) System.out.println("EMPTY");
        else {
            Node node = head;
            while (node != null) {
                System.out.print(node.value);
                if (node.prev != null) System.out.print(" -> ");
                node = (Node) node.prev;
            }
        }
    }

    public void setHead(Node head) {
        this.head = head;
    }

    public Stack reverse() {
        if (head == null) {
            return this;
        }
        Stack reversed_stack = new Stack();
        ReversStack new_tail = reversed_head(head);
        reversed_stack.setHead(new_tail.getHead());
        return reversed_stack;
    }

    private ReversStack reversed_head(Node node) {
        Node new_node = new Node(node.getValue(), null);
        if (node.getPrev() == null) {
            return new ReversStack(new_node, new_node);
        } else {
            ReversStack tail = reversed_head((Node) node.getPrev());
            tail.setTailPrev(new_node);
            return new ReversStack(tail.getHead(), new_node);
        }
    }
}

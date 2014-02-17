package book.DDS;

public class Main {
    public static void main(String[] args) {
        Node tail = null;
        tail = new Node(0, tail);
        tail = new Node(1, tail);
        tail = new Node(2, tail);
        tail = new Node(3, tail);
        Node tmp = tail;
        while (tmp != null) {
            System.out.print(" " + tmp.value);
            tmp = tmp.next;
        }

        System.out.println("\n------------------------------");
        System.out.println(toString(tail));
    }

    private static String toString(Node tail) {
        return tail == null ? "*" : tail.value + " -> " + toString(tail.next);
    }
}

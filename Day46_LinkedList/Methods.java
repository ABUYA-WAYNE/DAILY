
import java.util.NoSuchElementException;

public class Methods {

    Node head;

    public void add(Object data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
    }

    public void addFirst(Object data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    public void addLast(Object data) {
        add(data);
    }

    public void remove() {

    }

    public void removeFirst() {
        if (head == null) {
            throw new NoSuchElementException("List is empty!");
        }
        head = head.next;
    }

    public void removeLast() {
        if (head == null) {
            throw new NoSuchElementException("list is empty");
        }
        if (head.next == null) {
            head = null;
            return;
        }
        Node current = head;
        while (current.next.next != null) {
            current = current.next;
        }
        current.next = null;
    }

    public void get(int index) {
        if (index < 0) {
            System.out.println("Invalid index");
            return;
        }
        Node current = head;
        int count = 0;
        while (current != null) {
            if (count == index) {
                System.out.println("Element at index " + index + current.data);
                return;
            }

            current = current.next;
            count++;
        }
        System.out.println("index out of bounds");
    }

    public void size() {
        int count = 0;
        Node current = head;
        while (current != null) {
            count++;
            current = current.next;
        }
        System.out.println("Size of the list is " + count);
    }

    public void clear() {
        head = null;
    }

    public void printList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }
}

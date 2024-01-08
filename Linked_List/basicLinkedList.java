package Linked_List;

public class basicLinkedList {
    Node head;
    private int size;

    basicLinkedList() {
        size = 0;
    }
     
    public class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
            size++; // Incrementing size here is not recommended as it should be managed separately.
        }
    }

    public void addFirst(String data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
        size++; // Increment the size when adding a new node.
    }

    public void addLast(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            size++; // Increment the size when adding a new node to an empty list.
            return;
        }
        Node lastNode = head;

        while (lastNode.next != null) {
            lastNode = lastNode.next;
        }
        lastNode.next = newNode;
        size++; // Increment the size when adding a new node.
    }

    public void printList() {
        Node currNode = head;
        while (currNode != null) {
            System.out.print(currNode.data + " -> ");
            currNode = currNode.next;
        }
        System.out.println("null");
    }

    public void removeFirst() {
        if (head == null) {
            System.out.println("Empty list, nothing to delete.");
            return;
        }
        head = head.next;
        size--; // Decrement the size when removing a node.
    }

    public void removeLast() {
        if (head == null) {
            System.out.println("Empty list, nothing to delete.");
            return;
        }
        size--; // Decrement the size when removing a node.
        if (head.next == null) {
            head = null;
            return;
        }
        Node currNode = head;
        Node prevNode = null;
        while (currNode.next != null) {
            prevNode = currNode;
            currNode = currNode.next;
        }
        prevNode.next = null;
    }

    public int getSize() {
        return size;
    }

    public void reverseList() {
        if (head == null || head.next == null) {
            return;
        }
        Node prevNode = null;
        Node currNode = head;
        Node nextNode;

        while (currNode != null) {
            nextNode = currNode.next;
            currNode.next = prevNode;
            prevNode = currNode;
            currNode = nextNode;
        }
        head = prevNode;
    }

    public static void main(String[] args) {
        basicLinkedList list = new basicLinkedList();
        list.addLast("are");
        list.addLast("a");
        list.addLast("student");
        list.printList();

        list.addFirst("you");
        list.printList();
        System.out.println("Size: " + list.getSize());

        list.removeFirst();
        list.printList();

        list.removeLast();
        list.printList();

        list.reverseList();
        list.printList();
    }
}

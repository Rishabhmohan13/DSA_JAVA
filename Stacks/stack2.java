//PROGRAM-3
// Basic stack implementation 2nd way

package Stacks;

public class stack2 {
    private int arr[];
    private int top;
    private int capacity;

    stack2(int size) {
        arr = new int[size];
        capacity = size;
        top = -1;
    }

    public void push(int x) {
        if (isFull()) {
            System.out.println("Stack Overflow\n Program Terminated!");
            System.exit(1);
        }
        System.out.println("Inserting: " + x);
        arr[++top] = x;
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is Empty");
            System.exit(1);
        }
        return arr[top--];
    }

    public int size() {
        return top + 1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == capacity - 1;
    }

    public void printStack() {
        System.out.print("[");
        for (int i = top; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("]");
    }
}
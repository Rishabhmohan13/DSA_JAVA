//PROGRAM-4
// Basic stack implementation 3rd way

package Stacks;

public class stack3 {
    int size;
    int arr[];
    int top;

    stack3(int size) {
        this.size = size;
        this.arr = new int[size];
        this.top = -1;
    }

    public boolean isEmpty() {
        return (top == -1);
    }

    public boolean isFull() {
        return (size - 1 == top);
    }

    public int peek() {
        if (!this.isEmpty()) {
            return arr[top];
        } else {
            System.out.println("Stack is Empty");
            return -1;
        }

    }

    public void push(int element) {
        if (!isFull()) {
            top++;
            arr[top] = element;
            System.out.println("Pushed: " + element);
        } else
            System.out.println("Stack is full");
    }

    public int pop() {
        if (!isEmpty()) {
            int returnedTop = top;
            top--;
            System.out.println("Popped: " + arr[returnedTop]);
            return arr[returnedTop];

        } else {
            System.out.println("Stack is Empty");
            return -1;
        }
    }

    public void printStack() {
        System.out.print("[ ");
        for (int i = top; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("]");
    }

}
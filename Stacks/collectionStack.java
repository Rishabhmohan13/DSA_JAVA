//PROGRAM-1
package Stacks;

import java.util.*;

public class collectionStack {

    static void printStack(String msg, Stack s) {
        System.out.println(msg + ": " + s);
    }

    public static void main(String[] args) {

        Stack<String> stk = new Stack<>();
        stk.push("Navneet");
        stk.push("Rishabh");
        stk.push("Syed");
        stk.push("Shivang");
        printStack("Original", stk);

        String srh = "Prachi";
        System.out.println(srh + " found at: " + stk.search(srh));
        srh = "Syed";
        System.out.println(srh + " found at: " + stk.search(srh));
        // The top of stack has an address of 1 (not 0)
        // if the output is -1, that element is not in the stack.

        System.out.println("Popped: " + stk.pop());
        printStack("After", stk);
        System.out.println("Peeked: " + stk.peek());
    }

}
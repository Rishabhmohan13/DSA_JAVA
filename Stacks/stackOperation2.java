//CONT....
//PROGRAM-3
package Stacks;

public class stackOperation2 {
    public static void main(String[] args) {
        stack2 stk = new stack2(12);
        stk.push(1);
        stk.push(2);
        stk.push(3);
        stk.push(4);
        stk.push(5);
        stk.push(6);
        stk.push(7);
        stk.pop();
        stk.printStack();
    }
}
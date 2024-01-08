//CONT....
//PROGRAM-4
package Stacks;

public class stackOperation3 {
    public static void main(String[] args) {
        stack3 stk = new stack3(10);
        System.out.print("\033[H\033[2J");
        stk.pop();
        System.out.println("=================");
        stk.push(100);
        stk.push(200);
        stk.push(300);
        stk.push(400);
        stk.push(500);
        System.out.println("=================");
        stk.pop();
        stk.printStack();
    }
}
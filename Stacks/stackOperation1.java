//CONT....
//PROGRAM-2

package Stacks;

public class stackOperation1 {
    public static void main(String[] args) {
        stack1 s = new stack1();
        // System.out.print("\033[H\033[2J");
        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);
        s.push(50);
        System.out.println(s.pop() + " - Popped");
    }
}
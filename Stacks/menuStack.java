package Stacks;

import java.util.Scanner;
import java.util.Stack;

public class menuStack {
    static void printMenu(Stack s) {
        System.out.println("\n=========================");
        System.out.println("|   Stack Operations\t|");
        System.out.println("-------------------------");
        if (s.empty() != true)
        System.out.println(s);
        else
        System.out.println("|     EMPTY STACK\t|");
        System.out.println("-------------------------");
        System.out.println("|  1 - Push new values\t|");
        System.out.println("|  2 - Pop values\t|");
        System.out.println("|  3 - Peek values\t|");
        System.out.println("|  4 - Search values\t|");
        System.out.println("=========================");
        System.out.print("# Enter your choice (1-4): ");
    }

    public static void main(String[] args) {
        int choice;
        String input = "";
        String c = "y";
        Scanner sc = new Scanner(System.in);
        Stack<String> s = new Stack<String>();

        while (c.startsWith("y") || c.startsWith("Y")) {
            printMenu(s);
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("# Enter the value that you want to enter: ");
                    input = sc.nextLine();
                    s.push(input);
                    break;
                case 2:
                    if (s.empty() == true) {
                        System.out.println("! Stack is Empty, Try inserting some value instead!");
                        continue;
                    }
                    System.out.println("> Popped Value: " + s.pop());
                    break;

                case 3:
                    if (s.empty() == true) {
                        System.out.println("! Stack is empty, Try inserting some value instead!");
                        continue;
                    }
                    System.out.println("> Peeked Value: " + s.peek());
                    break;

                case 4:
                    if (s.empty() == true) {
                        System.out.println("! Stack is empty, Try inserting some value instead!");
                        continue;
                    }
                    System.out.print("# Enter the value that you want to search: ");
                    input = sc.nextLine();
                    if (s.search(input) == -1)
                        System.out.println("! The value is not in the stack");
                    else
                        System.out.println("> The element is at " + s.search(input));
                    break;
                default:
                    System.out.println("! Invalid choice, Try again (1-4)");
                    if (choice < 0 || choice > 4)
                        continue;
                    break;
            }
            System.out.print("# Do you wish to continue? (y/N): ");
            c = sc.nextLine();
        }
        sc.close();
    }
}

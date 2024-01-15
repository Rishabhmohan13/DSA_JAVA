package Misc;

import java.util.Scanner;
import java.util.Stack;

public class infixToPostfix {
    public static int precedence(char c) { // This returns the precedence of the operators
        switch (c) {
            case '^':
                return 3;
            case '/':
            case '*':
                return 2;
            case '+':
            case '-':
                return 1;
            default:
                return 0;
        }

    }

    public static boolean isOperant(char c) { // Checks if the current character is Operant or not
        return (c >= 'a' && c <= 'z') ||
                (c >= 'A' && c <= 'Z') ||
                (c >= '0' && c <= '9');
    }

    static void printHeader() {
        System.out.println("===================================================");
        System.out.println("|  INFIX  |    STACK\t|\tPOSTFIX\t\t  |");
        System.out.println("===================================================");

    }

    static void printColumn(String a, String b, String c) {
        String f = "";
        for (int i = 1; i < b.length(); i += 3) {
            if (b.charAt(i) == ']') { // Only runs once, to not print ']' for the 1st iteration.
                continue;
            }
            f += b.charAt(i) + " ";
        }
        System.out.println("    " + a + "\t  |\t" + f + "\t|  " + c);
    }

    static void printFooter(String exp, String ans) {
        System.out.println("===================================================");
        System.out.println("\tINFIX:    " + exp);
        System.out.println("\tPOSTFIX:  " + ans);
        System.out.println("===================================================");

    }

    public static String infixToPostfix(String exp) {
        Stack<Character> stk = new Stack<Character>();
        String postfix = "";
        char c;
        for (int i = 0; i < exp.length(); ++i) {

            c = exp.charAt(i);
            if (isOperant(c)) {
                postfix += c;
            } else if (c == '(') {

                stk.push(c);
            } else if (c == ')') {
                while (!stk.isEmpty() && stk.peek() != '(') {
                    postfix += stk.pop();
                }
                stk.pop();
            } else {
                while (!stk.isEmpty() && precedence(c) <= precedence(stk.peek())) {
                    postfix += stk.pop();

                }
                stk.push(c);
            }

            String infixSeqence = String.valueOf(c);
            printColumn(infixSeqence, stk.toString(), postfix); // Printing all the steps
        }
        while (!stk.isEmpty()) { // Adds all the remaining operators into the postfix string
            postfix += stk.pop();
        }
        return postfix;

    }

    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");
        // String infix = "K+L-M*N+(O^P)*W/U/V*T+Q^J^A";
        Scanner sc = new Scanner(System.in);
        System.out.println("Converting INFIX -> POSTFIX");
        System.out.print("Enter the expression: ");
        String infix = sc.nextLine();
        printHeader();
        String ans = infixToPostfix(infix);
        printFooter(infix, ans);
    }
}

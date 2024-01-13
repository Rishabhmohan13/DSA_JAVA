package Misc;
// To demonstrate, Main method can be overloaded 
public class testMain {
    public static void main(String[] args) {
        System.out.println();
        main("Testing");
        main(10);
        main(10,20);
    }
    public static void main(String args) {
        System.out.println("Main - 1");
    }
    public static void main(int a) {
        System.out.println("Main - 2");
    }
    public static void main(int a, int b) {
        System.out.println("Main - 3");
    }
}
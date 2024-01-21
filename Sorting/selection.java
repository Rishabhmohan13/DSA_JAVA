package Sorting;

import java.util.Scanner;

public class selection {

    static int minPointer;
    static int arr[];

    static void sorting(int a[]) {
        int min;
        int temp;
        String out = "";
        for (int i = 0; i < a.length; i++) {
            min = a[i];
            for (int j = i; j < a.length; j++) {
                if (min >= a[j]) {
                    min = a[j];
                    minPointer = j;
                }

            }
            temp = a[i];
            a[i] = a[minPointer];
            a[minPointer] = temp;
            out = "";
            out = "  > Step " + (i + 1);
            printArray(out, a);

        }
    }

    static void inputArray() {
        Scanner sc = new Scanner(System.in);
        System.out.print("# Enter the size: ");
        int s = sc.nextInt();
        arr = new int[s];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("  Enter element (" + (i + 1) + "/" + s + "): ");
            arr[i] = sc.nextInt();
        }
        sc.close();
    }

    static void printArray(String msg, int a[]) {
        System.out.print(msg + ": [ ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println("]");
    }

    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");
        System.out.println("\tSelection Sort");
        inputArray();
        printArray("Original Array", arr);
        sorting(arr);
        printArray("Sorted Array", arr);
    }
}

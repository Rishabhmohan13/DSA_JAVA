package Sorting;

import java.util.Scanner;

public class bubble {
    static int moves;
    static int arr[];
    static String header = " ";

    static void inputArray() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size: ");
        int s = sc.nextInt();
        arr = new int[s];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter element (" + (i + 1) + "/" + s + "): ");
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < s + 2; i++) {
            header += "=";
        }

        sc.close();
    }

    static void printArray(int a[]) {
        System.out.print("[ ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.print("]\n");
    }

    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");
        inputArray();
        int temp;
        System.out.print("\tBubble Sorting\nOriginal Array: ");
        printArray(arr);
        for (int i = 0; i < arr.length - 1; i++) {
            System.out.println("> [Pass " + (i + 1) + "]" + header);
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    moves++;
                    temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                    printArray(arr);
                }
            }
        }
        System.out.print("\nSorted Array: ");
        printArray(arr);
        System.out.print("Sorted in " + moves + " moves.");

    }
}

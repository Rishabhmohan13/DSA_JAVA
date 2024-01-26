package Sorting;

import java.util.Scanner;

public class HeapSort {
    void print(int array[], int size) {
        int index = 0;
        while (index < size) {
            System.out.print(" " + array[index]);
            index++;
        }
    }

    static void printArray(String msg, int a[], int i1) {
        String ANSI_RESET = "\u001B[0m";
        String ANSI_YELLOW = "\u001B[33m";
        System.out.print("> " + msg + ": [ ");
        for (int i = 0; i < a.length; i++) {
            if (i == i1) {
                System.out.print(ANSI_YELLOW + a[i] + ANSI_RESET + " ");
            } else if (a[i] != i1)
                System.out.print(a[i] + " ");
        }
        System.out.print("]\n");
    }

    static void printArray(int a[], int i1, int i2) {
        String ANSI_RESET = "\u001B[0m";
        String ANSI_BLACK = "\u001B[30m";
        String ANSI_RED = "\u001B[31m";
        String ANSI_GREEN = "\u001B[32m";
        String ANSI_YELLOW = "\u001B[33m";
        String ANSI_BLUE = "\u001B[34m";
        String ANSI_PURPLE = "\u001B[35m";
        String ANSI_CYAN = "\u001B[36m";
        String ANSI_WHITE = "\u001B[37m";
        System.out.print("[ ");
        for (int i = 0; i < a.length; i++) {
            if (i == i1) {
                System.out.print(ANSI_BLUE + a[i] + ANSI_RESET + " ");
            } else if (i == i2) {
                System.out.print(ANSI_RED + a[i] + ANSI_RESET + " ");
            } else if (a[i] != i1 && a[i] != i2)
                System.out.print(a[i] + " ");
        }
        System.out.print("]\n");
    }
    static void printArray(int a[], int i1, int i2, int i3) {
        String ANSI_RESET = "\u001B[0m";
        String ANSI_BLACK = "\u001B[30m";
        String ANSI_RED = "\u001B[31m";
        String ANSI_GREEN = "\u001B[32m";
        String ANSI_YELLOW = "\u001B[33m";
        String ANSI_BLUE = "\u001B[34m";
        String ANSI_PURPLE = "\u001B[35m";
        String ANSI_CYAN = "\u001B[36m";
        String ANSI_WHITE = "\u001B[37m";
        System.out.print("[ ");
        for (int i = 0; i < a.length; i++) {
            if (i == i3) {
                System.out.print(ANSI_BLUE + a[i] + ANSI_RESET + " ");
            } else if (i == i1) {
                System.out.print(ANSI_BLUE + a[i] + ANSI_RESET + " ");
            } else if (i == i2) {
                System.out.print(ANSI_RED + a[i] + ANSI_RESET + " ");
            } else if (i!= i1 && i != i2&&i!=i3)
                System.out.print(a[i] + " ");
        }
        System.out.print("]\n");
    }

    static void printArray(String msg, int a[]) {
        System.out.print("> " + msg + ": [ ");
        for (int i = 0; i < a.length; i++)
            System.out.print(a[i] + " ");
        System.out.print("]\n");
    }

    void heapify(int arr[], int size, int index) {
        int maximum = index;
        int leftChild = 2 * index + 1;
        int rightChild = 2 * index + 2;
        int swapper;
        if (leftChild < size && arr[leftChild] > arr[maximum]) {
            printArray("Left Child is Maximum", arr, leftChild);
            maximum = leftChild;
        }
        if (rightChild < size && arr[rightChild] > arr[maximum]) {
            printArray("Right Child is Maximum", arr, rightChild);
            maximum = rightChild;
        }
        if (maximum != index) {
            swapper = arr[index];
            arr[index] = arr[maximum];
            arr[maximum] = swapper;
            heapify(arr, size, maximum);
        }
    }

    static void swap(int[] arr, int a, int b) {
        int temp;
        System.out.print("> Swapped: " + arr[a] + " with " + arr[b] + "\t");
        temp = arr[b];
        arr[b] = arr[a];
        arr[a] = temp;
        printArray(arr, a, b);
    }

    void sort(int array[]) {
        int size = array.length;
        int index = (size / 2) - 1;
        while (index >= 0) {
            heapify(array, size, index);
            index--;
        }
        for (index = size - 1; index > 0; index--) {
            swap(array, index, 0);
            heapify(array, index, 0);
        }
    }

    static int[] arr;
    static int size;

    void inputArray() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the Array: ");
        size = sc.nextInt();
        arr = new int[size];
        System.out.println("Enter " + size + " numbers:");
        for (int i = 0; i < size; i++) {
            System.out.print("Enter number [" + (i + 1) + "/" + size + "]: ");
            arr[i] = sc.nextInt();
        }
        sc.close();
    }

    public static void main(String args[]) {
        HeapSort hs = new HeapSort();
        hs.inputArray();
        printArray("Original Array", arr);
        hs.sort(arr);
        printArray("After Heap Sort", arr);
    }
}

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

    void heapify(int arr[], int size, int index) {
        int maximum = index;
        int leftChild = 2 * index + 1;
        int rightChild = 2 * index + 2;
        int swapper;
        if (leftChild < size && arr[leftChild] > arr[maximum]) {
            maximum = leftChild;
        }
        if (rightChild < size && arr[rightChild] > arr[maximum]) {
            maximum = rightChild;
        }
        if (maximum != index) {
            swapper = arr[index];
            arr[index] = arr[maximum];
            arr[maximum] = swapper;
            heapify(arr, size, maximum);
        }
    }

    void sort(int array[]) {
        int size = array.length;
        int swapper;
        int index = (size / 2) - 1;
        while (index >= 0) {
            heapify(array, size, index);
            index--;
        }
        for (index = size - 1; index > 0; index--) {
            swapper = array[0];
            array[0] = array[index];
            array[index] = swapper;
            heapify(array, index, 0);
        }
    }

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int array[] = new int[10];
        System.out.println("Enter 10 numbers:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter [" + (i + 1) + "/10] number: ");
            array[i] = in.nextInt();
        }
        int size = array.length;
        HeapSort object = new HeapSort();
        object.sort(array);
        System.out.println("After Heap Sort: ");
        object.print(array, size);
    }
}

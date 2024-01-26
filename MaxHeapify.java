import java.util.Arrays;

public class MaxHeapify {

    // Counter to keep track of the number of iterations
    private static int iterations = 0;

    public static void maxHeapify(int[] arr, int n, int i) {
        iterations++; // Increment the iteration counter
        int largest = i; // Initialize largest as root
        int leftChild = 2 * i + 1; // Left child position
        int rightChild = 2 * i + 2; // Right child position

        // If left child is larger than root
        if (leftChild < n && arr[leftChild] > arr[largest]) {
            largest = leftChild;
        }

        // If right child is larger than largest so far
        if (rightChild < n && arr[rightChild] > arr[largest]) {
            largest = rightChild;
        }

        // If largest is not root
        if (largest != i) {
            // Swap the largest element with the root
            swap(arr, i, largest);

            // Recursively heapify the affected sub-tree
            maxHeapify(arr, n, largest);
        }
    }

    public static void swap(int[] arr, int i, int j) {
        System.out.println("> Swaping "+arr[i]+" [" +i+"] with "+ arr[j]+"\t[" +j+"]");
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int[] arr = { 4, 1, 3, 2, 16, 9, 10, 14, 8, 7 };
        int n = arr.length;

        System.out.println("Original array: " + Arrays.toString(arr));

        // Apply Max Heapify to the entire array
        for (int i = n / 2 - 1; i >= 0; i--) {
            maxHeapify(arr, n, i);
        }

        System.out.println("Max Heapified array: " + Arrays.toString(arr));
        System.out.println("Total number of iterations: " + iterations);
    }
}

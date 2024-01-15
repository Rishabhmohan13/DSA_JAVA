package Queue;

import java.util.*;

public class collectionQueue {

    static void print(int size, Object q) {
        System.out.print("Size: " + ((Queue<String>) q).size());
        System.out.println("\t" + q);
    }

    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");
        Queue<String> queue = new LinkedList<>();
        Scanner sc = new Scanner(System.in);

        // Adding elements
        System.out.println("> Adding Nodes");
        queue.add("Volvo");
        print(queue.size(), queue);

        queue.add("Porsche");
        print(queue.size(), queue);

        queue.add("Ford");
        print(queue.size(), queue);

        queue.add("Mercedes");
        print(queue.size(), queue);

        System.out.println("> The head of the queue is: "+ queue.peek());

        // Removing
        System.out.println("> Removing Nodes");
        queue.remove();
        print(queue.size(), queue);

        queue.remove();
        print(queue.size(), queue);

        if (queue.isEmpty() == true)
            System.out.println("> Queue is empty");
        else
            System.out.println("> Queue has " + queue.size() + " elements.");

        queue.poll();
        print(queue.size(), queue);

        queue.poll();
        print(queue.size(), queue);

        if (queue.isEmpty() == true)
            System.out.println("> Queue is empty");
        else
            System.out.println("> Queue has " + queue.size() + " elements.");

        sc.close();

    }
}

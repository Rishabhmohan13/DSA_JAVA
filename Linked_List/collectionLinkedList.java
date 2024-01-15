package Linked_List;

import java.util.LinkedList;
import java.util.Scanner;

public class collectionLinkedList {
    static void print(int size, Object ll) {
        System.out.print("Size: " + ((LinkedList<String>) ll).size());
        System.out.println("\t " + ll);
    }

    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");
        LinkedList<String> cars = new LinkedList<String>();
        Scanner sc = new Scanner(System.in);

        // Adding elements
        System.out.println("> Adding Nodes");
        cars.add("Volvo");
        print(cars.size(), cars);

        cars.addFirst("Ford");
        print(cars.size(), cars);

        cars.addLast("Ferrari");
        print(cars.size(), cars);

        cars.addFirst("Porsche");
        print(cars.size(), cars);

        cars.add(2, "Mercedes");
        print(cars.size(), cars);

        cars.add("Ford");
        print(cars.size(), cars);

        cars.add("Mercedes");
        print(cars.size(), cars);

        // Taking user input
        System.out.print("> Enter a element to search: ");
        String search = sc.nextLine();
        if (cars.contains(search))
            System.out
                    .println("\"" + search + "\" is present at index " + cars.indexOf(search) + " in the Linked List.");
        else {
            System.out.println("Not in the list!");
            System.out.print("Where do you want to add that element (Ovreride): ");
            int index = sc.nextInt();
            cars.set(index, search);
        }

        print(cars.size(), cars);
        System.out.print("Find element at index (0/" + (cars.size() - 1) + "): ");
        int index = sc.nextInt();
        System.out.println("Element at index " + index + " is: \"" + cars.get(index) + "\"");

        // Removing
        System.out.println("> Removing Nodes");
        cars.remove();
        print(cars.size(), cars);

        cars.remove(2);
        print(cars.size(), cars);

        cars.remove("Ferrari");
        print(cars.size(), cars);

        cars.removeFirstOccurrence("Ford");
        print(cars.size(), cars);

        cars.removeLastOccurrence("Mercedes");
        print(cars.size(), cars);
    }
}
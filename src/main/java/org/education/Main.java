package org.education;

import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Random;

/**
 * Demonstrates heapsort functionality and comparisons between int[] and ArrayList.
 */
public class Main {
    /**
     * Entry point for the program. Demonstrates heapsort and array comparison.
     *
     * @param args Command-line arguments (not used).
     */
    public static void main(String[] args) {
        // Part 1: PriorityQueue practice (commented out after testing)
        /*
        PriorityQueue<Integer> heap = new PriorityQueue<>();
        heap.add(40);
        heap.add(55);
        heap.add(15);
        heap.add(5);
        heap.add(35);

        while (!heap.isEmpty()) {
            System.out.println(heap.poll());
        }
        */

        // Part 3: Unsorted array and heapsort
        int[] array = {12, 7, 19, 3, 5};
        printArray("Unsorted array:", array);
        heapsort(array);
        printArray("Sorted array:", array);

        // Part 4: Array of 1000 random integers
        int[] largeArray = generateRandomArray(1000);
        printArray("Unsorted large array:", largeArray);
        heapsort(largeArray);
        printArray("Sorted large array:", largeArray);

        // Part 5: Comparing int[] with ArrayList
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int num : largeArray) {
            arrayList.add(num);
        }

        Collections.sort(arrayList);
        boolean arraysEqual = compareArrayAndList(largeArray, arrayList);
        System.out.println(arraysEqual ? "The int[] and ArrayList are identical." : "The int[] and ArrayList are different.");
    }

    /**
     * Sorts an array using heapsort.
     *
     * @param a The array to sort.
     */
    public static void heapsort(int[] a) {
        PriorityQueue<Integer> heap = new PriorityQueue<>();
        for (int num : a) {
            heap.add(num);
        }
        int i = 0;
        while (!heap.isEmpty()) {
            a[i++] = heap.poll();
        }
    }

    /**
     * Generates an array of random integers.
     *
     * @param size Size of the array.
     * @return The generated array.
     */
    public static int[] generateRandomArray(int size) {
        Random rand = new Random();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = rand.nextInt(1000);
        }
        return array;
    }

    /**
     * Prints the elements of an array with a label.
     *
     * @param label Description of the output.
     * @param array The array to print.
     */
    public static void printArray(String label, int[] array) {
        System.out.println(label);
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    /**
     * Compares an int array with an ArrayList for equality.
     *
     * @param array The int array.
     * @param list  The ArrayList.
     * @return true if they are identical, false otherwise.
     */
    public static boolean compareArrayAndList(int[] array, ArrayList<Integer> list) {
        if (array.length != list.size()) return false;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != list.get(i)) return false;
        }
        return true;
    }
}
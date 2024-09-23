package org.education;

import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) {
        PriorityQueue<Integer> heap = new PriorityQueue<>();

        heap.add(10);
        heap.add(30);
        heap.add(20);
        heap.add(5);
        heap.add(15);

        System.out.println("Elements removed from PriorityQueue:");
        while (!heap.isEmpty()) {
            System.out.println(heap.poll());
        }

        // Commenting out the PriorityQueue code for the rest of the lab
        // System.out.println("This code block can be commented out after testing.");

        int[] array = {10, 30, 20, 5, 15};
        heapsort(array);
        for (int num : array) {
            System.out.print(num + " ");
        }
    }

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
}
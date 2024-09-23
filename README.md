## Heapsort Algorithm Implementation

## Overview

This project implements the heapsort algorithm in Java using the `PriorityQueue` class and a custom sorting method. The project consists of five main parts, testing different aspects of heapsort and comparing sorting performance between arrays and ArrayLists.

## Features

### Part 1: Java `PriorityQueue` Practice
- Created an instance of `PriorityQueue`.
- Added elements to the priority queue, removed, and printed the elements in order.
- **Note**: This part is commented out after testing and is not necessary for the rest of the lab.

### Part 2: Heapsort Implementation
- Implemented the `heapsort(int[] a)` method to sort an integer array using the heap data structure.
- The method sorts the array by inserting elements into a `PriorityQueue` (min-heap) and polling them out in sorted order.

### Part 3: Sorting an Unsorted Array
- Created an unsorted array of integers.
- Printed the array before and after calling the `heapsort` method to confirm the sorting functionality.

### Part 4: Sorting 1000 Random Integers
- Generated an array of 1000 random integers using the `Random` class.
- Printed the array before and after calling the `heapsort` method to verify the sorting process on a larger dataset.

### Part 5: Comparing `int[]` and `ArrayList`
- Generated a set of random integers and stored them in both an `int[]` array and an `ArrayList`.
- Applied `heapsort` on the `int[]` and `Collections.sort()` on the `ArrayList`.
- Compared the two collections to check if the data was identical after sorting.

## How to Run

1. Clone the repository or download the project files.
2. Compile and run the `Main` class.
3. The project will:
    - Sort unsorted arrays using heapsort.
    - Generate and sort 1000 random integers.
    - Compare sorting results between `int[]` and `ArrayList` to confirm identical sorting.

## Example Output
- Unsorted array:
- 12 7 19 3 5
- Sorted array:
- 3 5 7 12 19

- Unsorted large array:
- [1000 random integers printed here]

- Sorted large array:
- [1000 sorted integers printed here]

- The int[] and ArrayList are identical.

## Requirements
- Java JDK 11 or later.
- IDE (e.g., IntelliJ IDEA, Eclipse) or command-line environment for Java compilation and execution.

## Author
Nav Singh
[GitHub](https://github.com/nav7FSC)
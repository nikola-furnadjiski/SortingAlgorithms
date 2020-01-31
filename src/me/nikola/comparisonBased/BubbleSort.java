package me.nikola.comparisonBased;

import me.nikola.SortingAlgorithms;

/**
 * Bubble Sort is one of the simplest sorting algorithm that works by repeatedly swapping the adjacent elements if
 * they are in wrong order. It got its name from the analogy that in each iteration the largest element pops up on
 * top (last unsorted position) like a bubble.
 *
 */
public class BubbleSort {

    public static void sort(int array[]) {
        // An optimized version of Bubble Sort
        System.out.println("BUBBLE SORT:");
        SortingAlgorithms.print(array);
        System.out.println("----");

        int n = array.length, tmp;
        int sortedElements = 0;
        boolean swapped;
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - 1 - sortedElements; j++) {
                if (array[j] > array[j + 1]) {
                    tmp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = tmp;
                    swapped = true;
                }
            }
            // IF no two elements were
            // swapped by inner loop, then break
            if (swapped == false) {
                break;
            }

            sortedElements++;
            SortingAlgorithms.print(array);
        }

        System.out.println("----");
        System.out.println("FINISHED:");
        SortingAlgorithms.print(array);
    }
}

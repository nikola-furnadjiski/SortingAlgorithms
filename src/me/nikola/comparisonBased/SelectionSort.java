package me.nikola.comparisonBased;

import me.nikola.SortingAlgorithms;

/**
 * Sorting algorithm that find the min element in the range [2..n] of unsorted subarray and swaps it with the first
 * element of unsorted subarray
 *
 */
public class SelectionSort {
    public static void sort(int[] array) {
        System.out.println("SELECTION SORT:");
        SortingAlgorithms.print(array);
        System.out.println("----");

        int n = array.length;

        for (int i = 0; i < n - 1; i++) {
            int min_idx = i;
            for (int j = i + 1; j < n; j++) {
                if (array[min_idx] > array[j]) {
                    min_idx = j;
                }
            }

            int tmp = array[min_idx];
            array[min_idx] = array[i];
            array[i] = tmp;

            SortingAlgorithms.print(array);
        }

        System.out.println("----");
        System.out.println("FINISHED:");
        SortingAlgorithms.print(array);
    }
}

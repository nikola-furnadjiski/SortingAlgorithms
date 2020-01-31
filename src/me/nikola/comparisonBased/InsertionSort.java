package me.nikola.comparisonBased;

import me.nikola.SortingAlgorithms;

/**
 * Insertion sort works in the way like we sort playing cards in our hands We iterate over the array pick the next
 * element arr[i] and insert it into sorted sequence arr[0…i-1]
 *
 */
public class InsertionSort {

    public static void sort(int array[]) {
        System.out.println("INSERTION SORT:");
        SortingAlgorithms.print(array);
        System.out.println("----");

        int n = array.length;

        for (int i = 1; i < n; i++) {
            int current = array[i];
            int j = i - 1;

            /* Move elements of arr[0..i-1], that are
               greater than key, to one position ahead
               of their current position */
            while (j >= 0 && array[j] > current) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = current;
            SortingAlgorithms.print(array);
        }

        System.out.println("----");
        System.out.println("FINISHED:");
        SortingAlgorithms.print(array);
    }

}

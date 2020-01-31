package me.nikola;

import me.nikola.comparisonBased.QuickSort;
import me.nikola.nonComparisonBased.CountingSort;

public class SortingAlgorithms {

    /**
     * Main method from which the needed sorting algorithm wanted can be called
     *
     * @param args
     */
    public static void main(String[] args) {
        //int array[] = {12, 11, 13, 5, 6};
        //QuickSort.sort(array, 0, array.length-1);

        int array[] = {1,4,1,2,7,5,2};
        CountingSort.sort(array);
        print(array);
    }

    /**
     * A utility function to print array of size n
     * @param array the array to be printed
     */
    public static void print(int array[]) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}

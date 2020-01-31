package me.nikola;

import me.nikola.nonComparisonBased.BucketSort;
import me.nikola.nonComparisonBased.RadixSort;

public class SortingAlgorithms {

    /**
     * Main method from which the needed sorting algorithm wanted can be called
     *
     * @param args
     */
    public static void main(String[] args) {
        //int array[] = {12, 11, 13, 5, 6};
        //QuickSort.sort(array, 0, array.length-1);

        //int array[] = {1,4,1,2,7,5,2};
        //CountingSort.sort(array);

        //float array[] = {0.78f, 0.17f, 0.39f, 0.26f, 0.72f, 0.94f, 0.21f, 0.12f, 0.23f, 0.68f};
        //BucketSort.sort(array, 10);

        int array[] = {170, 45, 75, 90, 802, 24, 2, 66};
        RadixSort.sort(array);

        print(array);
    }

    /**
     * A utility function to print array of size n
     *
     * @param array the array to be printed
     */
    public static void print(int array[]) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    /**
     * A utility function to print float array of size n
     *
     * @param array the array to be printed
     */
    public static void printFloatArray(float array[]) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}

package me.nikola.comparisonBased;

/**
 * Class that provides implementation of QuickSort Algorithm
 * <p>
 * This function takes last element as pivot, places the pivot element at its correct position in sorted array, and
 * places all smaller (smaller than pivot) elements to left of pivot and all greater (greater than pivot) elements to
 * right of pivot
 */

public class QuickSort {

    public static int partition(int[] array, int low, int high) {
        int i = low - 1;
        int pivot = array[high];

        for (int j = low; j < high; j++) {
            if (array[j] <= pivot) {
                i++;
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }
        int temp = array[i + 1];
        array[i + 1] = array[high];
        array[high] = temp;

        return i + 1;
    }

    public static void sort(int[] array, int low, int high) {
        if (low < high) {
            int pi = partition(array, low, high);

            sort(array, low, pi - 1);
            sort(array, pi + 1, high);
        }
    }

}

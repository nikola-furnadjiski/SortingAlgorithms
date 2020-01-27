package me.nikola;

/**
 * Sorting algorithm that takes the first element, compares it with all next elements [2..n] and puts min element on
 * first position, continues with second element aso...
 *
 */
public class MaxEntrySort {
    public static void sort(int[] array) {
        System.out.println("MAX ENTRY SORT:");
        SortingAlgorithms.print(array);
        System.out.println("****");

        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (array[i] > array[j]) {
                    int tmp = array[i];
                    array[i] = array[j];
                    array[j] = tmp;
                    SortingAlgorithms.print(array);
                }
            }
            System.out.println("****");
        }

        System.out.println("****");
        System.out.println("FINISHED:");
        SortingAlgorithms.print(array);
    }
}

package me.nikola;

public class SortingAlgorithms {

    /**
     * Main method from which the needed sorting algorithm wanted can be called
     *
     * @param args
     */
    public static void main(String[] args) {
        int array[] = {12, 11, 13, 5, 6};

        QuickSort.sort(array, 0, array.length-1);
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

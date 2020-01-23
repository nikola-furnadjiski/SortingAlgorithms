package me.nikola;

public class SortingAlgorithms {

    /**
     * Main method from which the needed sorting algorithm can be executed
     *
     * @param args
     */
    public static void main(String[] args) {
        int array[] = {12, 11, 13, 5, 6};

        maxEntrySort(array);
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
     * Insertion sort works in the way like we sort playing cards in our hands We iterate over the array pick the next
     * element arr[i] and insert it into sorted sequence arr[0…i-1]
     *
     * @param array
     */
    public static void insertionSort(int array[]) {
        System.out.println("INSERTION SORT:");
        print(array);
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
            print(array);
        }

        System.out.println("----");
        System.out.println("FINISHED:");
        print(array);
    }

    /**
     * Bubble Sort is one of the simplest sorting algorithm that works by repeatedly swapping the adjacent elements if
     * they are in wrong order. It got its name from the analogy that in each iteration the largest element pops up on
     * top (last unsorted position) like a bubble.
     *
     * @param array
     */
    public static void bubbleSort(int array[]) {
        // An optimized version of Bubble Sort
        System.out.println("BUBBLE SORT:");
        print(array);
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
            print(array);
        }

        System.out.println("----");
        System.out.println("FINISHED:");
        print(array);
    }

    /**
     * Sorting algorithm that find the min element in the range [2..n] of unsorted subarray and swaps it with the first
     * element of unsorted subarray
     *
     * @param array
     */
    public static void selectionSort(int[] array) {
        System.out.println("SELECTION SORT:");
        print(array);
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

            print(array);
        }

        System.out.println("----");
        System.out.println("FINISHED:");
        print(array);
    }

    public static void maxEntrySort(int[] array) {
        System.out.println("MAX ENTRY SORT:");
        print(array);
        System.out.println("----");

        int n=array.length;
        for(int i = 0; i < n - 1; i++) {
            for(int j = i + 1; j < n; j++) {
                if(array[i] > array[j]) {
                    int tmp = array[i];
                    array[i] = array[j];
                    array[j] = tmp;
                }
            }
            print(array);
        }

        System.out.println("----");
        System.out.println("FINISHED:");
        print(array);
    }
}

package me.nikola.nonComparisonBased;


/**
 * Radix sort is another sorting algorithm from the family of non-comparison sorting algorithms. It's complexity is
 * O(n+k) = O(n) which is linear complexty which is better than the fastest comparison algotihm (MergeSort,
 * QuickSort...) which lower Bound is Omega(N*Log N). But it has certain conditions that have to be fulfilled for it to
 * be used. It can work on natural numbers only (the range is not important).
 * <p>
 * How it works: It looks at digits of the numbers (elements) from least significant one to most significant one, and
 * sorts them (with counting sort) by current looking digit
 *
 * ex: array to be sorted                       A=[170, 45, 75, 90, 802, 24, 2, 66];
 *     1st iteration, least significant digit   D=[0,    5,  5,  0,   2,  4, 2,  6];
 *     sorted by that digit we get:            A'=[170, 90, 802, 2, 24, 45, 75, 66];
 *     2nd iteration, next ls digit:            D=[7,     9,   0, 0,  2,  4,  7,  6];
 *     sorted by that digit we get:           A''=[802, 2, 24, 45, 66, 170, 75, 66];
 *     3rd iteration, next ls digit:            D=[8,   0,  0,  0,  0,   1,  0,  0];
 *     sorted by that digit we get:          A'''=[2, 24, 45, 66, 75, 90, 170, 802];
 *
 *     and the array is sorted
 */
public class RadixSort {

    public static void sort(int[] array) {
        int n = array.length;
        int[] sorted = new int[n];
        int max = array[0];
        int exp = 1;
        int i;

        for (i = 0; i < n; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }

        //inside the while we have a modified implementation of counting sort
        while (max / exp > 0) {
            int output[] = new int[10];

            for (i = 0; i < n; i++) {
                output[array[i] / exp % 10]++;
            }

            for (i = 1; i < 10; i++) {
                output[i] += output[i - 1];
            }

            for (i = n - 1; i >= 0; i--) {
                sorted[--output[array[i] / exp % 10]] = array[i];
            }

            for (i = 0; i < n; i++) {
                array[i] = sorted[i];
            }

            exp *= 10;
        }
    }

}

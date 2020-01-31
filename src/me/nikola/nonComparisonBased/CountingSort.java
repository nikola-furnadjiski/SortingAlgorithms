package me.nikola.nonComparisonBased;

/**
 * Counting sort is a sorting algorithm that is not based on comaprison between elements in an array. It's complexity is
 * O(n+k)=O(n) which is linear complexity, but a certain conditions have to be fulfilled for using it. All elements (el.
 * values) must be in a certain range [0...k] and elements can (should) repeat more times but this range should not be
 * too big
 * <p>
 * How it works: we create an auxiliary array that contains element's count on aux. array's index eg: array to be
 *      sorted=[1, 4, 1, 2, 7, 5, 2];
 *      aux. array:[0, 2, 2, 0, 1, 1, 0, 1]; (we have zero-0, two-1, two-2, zero-3, one-4, one-5, zero-6, one-7)
 * <p>
 * Then in aux. array we add every number to the previous one starting from the first one and we get:
 *      aux. array[0, 2, 4, 4, 5, 6, 6, 7];
 * <p>
 * Then we iterate over original array (one to be sorted) and put in the sorted array array's element, value from
 * aux.array at index which is aux. array value at that index
 * ex:  array[0]=1
 *      aux. array[1]=2
 *      sorted array[2]=1
 */
public class CountingSort {

    public static void sort(int[] array) {
        int n = array.length, max = -1;

        for (int i = 0; i < n; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        max++;
        // when declaring an int array all values are automatically set to 0, so no need to initialize them to 0
        int[] output = new int[max];
        int[] sorted = new int[n];

        //add to output array's N-th index number of occurrences of number N
        for (int i = 0; i < n; i++) {
            output[array[i]]++;
        }

        for (int i = 1; i < output.length; i++) {
            output[i] += output[i - 1];
        }

        for (int i = 0; i < n; i++) {
            sorted[output[array[i]] - 1] = array[i];
            output[array[i]]--;
        }

        for (int i = 0; i < n; i++) {
            array[i] = sorted[i];
        }

    }
}

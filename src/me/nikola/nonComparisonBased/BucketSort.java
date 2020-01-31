package me.nikola.nonComparisonBased;

import java.util.Collections;
import java.util.LinkedList;


/**
 * Bucket sort is mainly useful when input is uniformly distributed over a range. For example, consider the following
 * problem. Sort a large set of floating point numbers which are in range from 0.0 to 1.0 and are uniformly distributed
 * across the range. How do we sort the numbers efficiently?
 * <p>
 * A simple way is to apply a comparison based sorting algorithm. The lower bound for Comparison based sorting algorithm
 * (Merge Sort, Heap Sort, Quick-Sort .. etc) is Ω(n Log n), i.e., they cannot do better than nLogn. Can we sort the
 * array in linear time? Counting sort can not be applied here as we use keys as index in counting sort. Here keys are
 * floating point numbers. The idea is to use bucket sort. Following is bucket algorithm.
 */
public class BucketSort {

    public static void sort(float[] array, int n) {
        LinkedList<Float>[] buckets = new LinkedList[n];
        for (int i = 0; i < n; i++) {
            buckets[i] = new LinkedList<>();
        }

        for (int i = 0; i < array.length; i++) {
            int bucketIndex = (int) (n * array[i]);
            buckets[bucketIndex].add(array[i]);
        }

        for (int i = 0; i < n; i++) {
            Collections.sort(buckets[i]);
        }

        int index = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < buckets[i].size(); j++) {
                array[index++] = buckets[i].get(j);
            }
        }
    }
}

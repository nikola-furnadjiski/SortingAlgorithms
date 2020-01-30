package me.nikola;

public class MergeSort {
    public static void merge(int[] array, int left, int middle, int right) {
        //get size od temp tables
        int n1 = middle - left + 1;
        int n2 = right - middle;

        int[] L = new int [n1];
        int[] R = new int [n2];

        //copy values to left and right array respectively
        for(int i=0; i<n1; i++) {
            L[i] = array[left+i];
        }
        for(int i=0; i<n2; i++) {
            R[i] = array[middle + 1 + i];
        }

        //compare values and put them in correct order in resulting array
        int i=0,j=0,k=left;
        while(i < n1 && j < n2) {
            if(L[i] < R[j]) {
                array[k] = L[i];
                i++;
            } else {
                array[k] = R[j];
                j++;
            }
            k++;
        }

        //copy any leftover values to resulting array
        while(i < n1) {
            array[k] = L[i];
            i++;
            k++;
        }
        while(j < n2) {
            array[k] = R[j];
            j++;
            k++;
        }
    }


    public static void mergeSort(int[] array, int left, int right) {
        if(left < right) {
            int middle = (left + right) / 2;

            mergeSort(array, left, middle);
            mergeSort(array, middle + 1, right);
            merge(array, left, middle, right);
        }
    }
}

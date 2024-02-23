package MergeSort;

import java.util.Arrays;

import QuickSort.QuickSort;

public class Main {

    public static void main(String[] args) {
        //int[] array1 = {1,4,5,7};
        //int[] array2 = {3,6,9,10,12};
        //int[] array = {1,4,6,3,2,5};
        int[] array = {4,6,1,7,3,2,5};
        //System.out.println(QuickSort.pivot(array2));
        //QuickSort.pivot(array);
        System.out.println(QuickSort.pivot(array, 1, 6));
        System.out.println(Arrays.toString(array));  
    }
}

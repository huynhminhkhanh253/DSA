package MergeSort;

import java.util.ArrayList;
import java.util.Arrays;

public class MergeSort {
    // merge method
    public static int[] merge(int[] array1, int [] array2){
        // while(i < array1.length,array2.length)
        // if array[i] < array2[j] int[] combined[index] = array[i]
        // while (i< array.len)
        // combine[index] = array[i]
        int [] combined = new int[array1.length + array2.length];
        int i = 0;
        int j = 0;
        int index = 0;
        while(i < array1.length && j < array2.length){
            if(array1[i] < array2[j]){
                combined[index] = array1[i];
                i++;
                index++;
            }
            else{
                combined[index] = array2[j];
                j++;
                index++;
            }
        }
        while(i < array1.length){
            combined[index] = array1[i];
            index++;
            i++;
        }
        while(j < array2.length){
            combined[index] = array2[j];
            index++;
            j++;
        }
        return combined;
    }
    public static int[] mergeSort(int[] array){
        // find middle index
        // slit left array, right array
        // recursion till 
        // base case: length ==1;
        // merge left righ
        if(array.length == 1) return array;
        int middleIndex = (array.length)/2;
        int[] left = mergeSort(Arrays.copyOfRange(array, 0, middleIndex));
        int[] right = mergeSort(Arrays.copyOfRange(array, middleIndex, array.length));
 
        return merge(left, right) ;

    }
    
}

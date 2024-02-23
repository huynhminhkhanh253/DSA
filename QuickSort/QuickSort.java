package QuickSort;

import java.lang.reflect.Array;
import java.util.Arrays;

import javax.swing.text.html.HTMLDocument.RunElement;



public class QuickSort {
    private static void swap(int[] array,int a, int b){
        int temp = array[a];
        array[a] = array[b];
        array[b] = temp;
    }
    public static int pivot(int[] array, int pivotIndex, int endIndex){
        int swapIndex = pivotIndex;
        for(int i = pivotIndex+1; i <= endIndex; i++){
            if(array[i] < array[pivotIndex]){
                swapIndex++;
                swap(array, swapIndex, i);
            }
        }
        swap(array, pivotIndex, swapIndex);
        return swapIndex;
    }
    public static void helperQuickSort(int[] array, int left, int right){
        if(left < right){
            int pivot = pivot(array, left, right);
            helperQuickSort(array, left, pivot-1);
            helperQuickSort(array,pivot+1, right);
        }
    }
    public static void QuickSort(int[] array){
        helperQuickSort(array, 0, array.length-1);
    }
}

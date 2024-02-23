package QuickSort;
 
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        
        int[] array = {4,6,1,7,3,2,5};
        //System.out.println(QuickSort.pivot(array, 0, 6));
        //System.out.println(Arrays.toString(array));
        QuickSort.QuickSort(array);
        System.out.println(Arrays.toString(array));
    }  
}

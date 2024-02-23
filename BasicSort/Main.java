package BasicSort;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] myarray = {5,8,4,1,6};
        System.out.println(myarray.length);
        BasicSort.insertionSort(myarray);
        System.out.println(Arrays.toString(myarray));
    }
}

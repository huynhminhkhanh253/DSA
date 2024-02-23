package BasicSort;

public class BasicSort {
    public static void bubbleSort(int[] array) {
        for (int i =  array.length-1; i > 0; i--){
            for(int j = 0; j < i; j++){
                if(array[j] > array[j+1]){
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
    }
    public static void selectionSort(int[] array) {
      // create a loop of times
      // set the in dex of a[i] = min
      // sort for min value -> swap min 
      for(int i = 0; i < array.length;i++)  {
        int minIndex = i;
        for(int j = i+1;j< array.length;j++){
            if(array[j] < array[minIndex]) minIndex = j;
        }
        if(i != minIndex){
            int temp = array[i];
            array[i] = array[minIndex]; 
            array[minIndex] = temp;
        }
      }
    }
    public static void insertionSort(int[] array){
        // sort from index 1 = temp
        // create j = i-1
        // while (temp < i - 1)
            //  j+1 = j
            // j = temp
            // j--
        for(int i = 1; i < array.length; i++){
            int j = i-1;
            int temp = array[i];
            while(j > -1 && temp < array[j]){
                array[j+1] = array[j];
                array[j] = temp;
                j--;
            }
        }
    }
}

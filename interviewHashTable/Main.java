package interviewHashTable;

import java.util.HashMap;

public class Main {
    /* public static boolean itemInCommon(int arr1[], int arr2[]){
        for(int i:arr1){
            for(int j:arr2){
                if(i == j) return true;
                //if(arr1[i] == arr2[j]) return true;
            }
        }
        return false;
    } */
    public static boolean itemInCommon(int arr1[], int arr2[]){
        HashMap<Integer, Boolean> myHashMap = new HashMap<>();
        
        for(int i:arr1){
            myHashMap.put(i,true);
        }

        for(int j:arr2){
            if(myHashMap.get(j) != null) return true;
        }
        return false;

    }
    public static void main(String[] args) {
       int arr1[] ={1,2,3,4,6,7};
       int arr2[] ={8,9,10,11,12,13}; 
       System.out.println(itemInCommon(arr1, arr2));

    }
    
}

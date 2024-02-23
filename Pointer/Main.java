package Pointer;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap<String, Integer> map1 = new HashMap<>();
        HashMap<String, Integer> map2 = new HashMap<>();
        HashMap<String, Integer> map3 = new HashMap<>();

        map1.put("value",11);
        

        map3.put("value",57);

        map2 = map3;
        map2 = map1;




        System.out.println(map1);
        System.out.println(map2);
        System.out.println(map3);
    }
}

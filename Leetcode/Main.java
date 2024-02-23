package Leetcode;

import java.util.ArrayList;

public class Main {
    public static ArrayList solution(int[] nums, int target) {
        ArrayList<Integer> result = new ArrayList<Integer>();  
        for(int i = 0; i< nums.length; i++){
            for(int j = i+1; j < nums.length; j++){
                if(nums[i]+nums[j] == target){
                    result.add(nums[i]);
                    result.add(nums[j]);
                }
            }
        }
       return result; 
    }
    public static void main(String[] args) {
        int[] nums = {3,3};
        int target = 6;
        System.out.println(solution(nums,target));
    }
}

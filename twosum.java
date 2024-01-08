// Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

// You may assume that each input would have exactly one solution, and you may not use the same element twice.

// You can return the answer in any order.

 import java.util.*;
class Solution {
     int[] twoSum(int[] nums, int target) {
        // create hashMap
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++){
           
            //get the complement using the target value

            int complement = target - nums[i];

            // Search the hashmap for complement , if 

            if (map.containsKey(complement)){
                return new int[]{map.get(complement),i};
            }

        map.put(nums[i], i);
    }

throw new IllegalArgumentException("No two sum solution");

    }
}

https://leetcode.com/problems/two-sum/submissions/1140409725

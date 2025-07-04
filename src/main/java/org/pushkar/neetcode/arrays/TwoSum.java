package org.pushkar.neetcode.arrays;


import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    /**
     * Problem Link = <a href="https://leetcode.com/problems/two-sum/description/">Problem Link</a>
     *
     * Input: nums = [2,7,11,15], target = 9
     * Output: [0,1]
     * Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
     *
     * Input: nums = [3,2,4], target = 6
     * Output: [1,2]
     *
     * Input: nums = [3,3], target = 6
     * Output: [0,1]
     */

    public static void main(String[] args) {

        int[] num1 = new int []{2,7,11,15};
        int target1 = 9;

        int[] num2 = new int []{2,3,4};
        int target2 = 6;

        int[] num3 = new int []{3,3};
        int target3 = 6;

        System.out.println("Is Two Sum for num1 " + Arrays.toString(num1) + "= " + Arrays.toString(twoSum(num1, target1)));
        System.out.println("Is Two Sum for num2 " + Arrays.toString(num2) + "= " + Arrays.toString(twoSum(num2, target2)));
        System.out.println("Is Two Sum for num3 " + Arrays.toString(num3) + "= " + Arrays.toString(twoSum(num3, target3)));

    }

    private static int[] twoSum(int[] nums, int target) {

        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i])) {
                return new int[]{map.get(target - nums[i]), i};
            }
            map.put(nums[i], i);
        }
        return new int[0];
    }
}

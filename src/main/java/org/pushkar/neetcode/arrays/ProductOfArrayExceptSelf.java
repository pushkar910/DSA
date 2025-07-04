package org.pushkar.neetcode.arrays;


import java.util.*;

public class ProductOfArrayExceptSelf {

    /**
     * Problem Link = <a href="https://leetcode.com/problems/product-of-array-except-self/description/">Problem Link</a>
     *
     * Input: nums = [1,2,3,4]
     * Output: [24,12,8,6]
     *
     * Input: nums = [-1,1,0,-3,3]
     * Output: [0,0,9,0,0]
     *
     */

    public static void main(String[] args) {

        int[] num1 = new int []{1,2,3,4};

        int[] num2 = new int []{-1,1,0,-3,3};

        System.out.println("Product Array for Num1: " + Arrays.toString(num1) + " is = "+ findProduct(num1));
        System.out.println("Product Array for Num2: " + Arrays.toString(num2) + " is = " + findProduct(num2));

    }

    private static List<Integer> findProduct(int[] nums) {
        int[] preSum = new int[nums.length];
        int[] postSum = new int[nums.length];

        preSum[0] = 1;
        postSum[nums.length - 1] = 1;

        for (int i = 1; i < nums.length; i++) {
            preSum[i] = preSum[i - 1] * nums[i - 1];
        }

        for (int i = nums.length - 2; i >= 0; i--) {
            postSum[i] = postSum[i + 1] * nums[i + 1];
        }

        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            result.add(preSum[i] * postSum[i]);
        }

        return result;
    }
}

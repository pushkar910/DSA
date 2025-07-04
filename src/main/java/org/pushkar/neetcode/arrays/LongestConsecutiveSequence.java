package org.pushkar.neetcode.arrays;


import java.util.*;

public class LongestConsecutiveSequence {

    /**
     * Problem Link = <a href="https://leetcode.com/problems/longest-consecutive-sequence/description/">Problem Link</a>
     *
     * Input: nums = [100,4,200,1,3,2]
     * Output: 4
     *
     * Input: nums = [0,3,7,2,5,8,4,6,0,1]
     * Output: 9
     *
     * Input: nums = [1,0,1,2]
     * Output: 3
     *
     */

    public static void main(String[] args) {

        int[] num1 = new int []{100,4,200,1,3,2};

        int[] num2 = new int []{0,3,7,2,5,8,4,6,0,1};

        int[] num3 = new int []{1,0,1,2};

        System.out.println("Longest Consecutive Sequence for Num1: " + Arrays.toString(num1) + " is = "+ findLongestConsecutive(num1));
        System.out.println("Longest Consecutive Sequence for Num2: " + Arrays.toString(num2) + " is = " + findLongestConsecutive(num2));
        System.out.println("Longest Consecutive Sequence for Num3: " + Arrays.toString(num3) + " is = " + findLongestConsecutive(num3));

    }

    private static int findLongestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }

        int max = 0;
        for (int num : set) {
            int count = 1;
            if (!set.contains(num - 1)) {
                int val = num;
                while (set.contains(val + 1)) {
                    val++;
                    count++;
                }
            }
            max = Math.max(max,count);
        }

        return max;
    }
}

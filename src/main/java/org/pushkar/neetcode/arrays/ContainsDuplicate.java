package org.pushkar.neetcode.arrays;


import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {

    /**
     * Problem Link = <a href="https://neetcode.io/problems/duplicate-integer?list=neetcode150">Problem Link</a>
     *
     * Input: nums = [1, 2, 3, 3]
     * Output: true
     *
     * Input: nums = [1, 2, 3, 4]
     * Output: false
     */
    public static void main(String[] args) {

        int[] num1 = new int []{1,2,3,3};
        int[] num2 = new int []{1,2,3,4};

        boolean res1 = containsDuplicate(num1);
        boolean res2 = containsDuplicate(num2);

        System.out.println("Contains Duplicate in Num1 = " + res1);
        System.out.println("Contains Duplicate in Num2 = " + res2);
    }

    private static boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (set.contains(num)) {
                return true;
            }
            set.add(num);
        }
        return false;
    }
}

package org.pushkar.neetcode.arrays;


import java.util.*;

public class TopKFrequentElements {

    /**
     * Problem Link = <a href="https://leetcode.com/problems/top-k-frequent-elements/description/">Problem Link</a>
     *
     * Input: nums = [1,1,1,2,2,3], k = 2
     * Output: [1,2]
     *
     * Input: nums = [1], k = 1
     * Output: [1]
     *
     */
    public static void main(String[] args) {

        int[] num1 = new int []{1,1,1,2,2,3};
        int k1 = 2;

        int[] num2 = new int []{1};
        int k2 = 1;


        System.out.println("Top K Frequent Elements for " + Arrays.toString(num1) + "= " + Arrays.toString(topKFrequent(num1, k1)));
        System.out.println("Top K Frequent Elements for " + Arrays.toString(num2) + "= " + Arrays.toString(topKFrequent(num2, k2)));
    }

    private static int[] topKFrequent(int[] nums, int k) {

        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        Queue<Integer> priorityQ = new PriorityQueue<>(Comparator.comparingInt(map::get));

        for (int value : map.keySet()){
            priorityQ.add(value);
            if (priorityQ.size() > k){
                priorityQ.poll();
            }
        }

        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            if (!priorityQ.isEmpty()){
                result[i] = priorityQ.poll();
            }
        }

        return result;

    }
}

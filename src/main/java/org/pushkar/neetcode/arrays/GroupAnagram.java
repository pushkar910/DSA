package org.pushkar.neetcode.arrays;


import java.util.*;

public class GroupAnagram {

    /**
     * Problem Link = <a href="https://leetcode.com/problems/group-anagrams/">Problem Link</a>
     *
     * Input: strs = ["eat","tea","tan","ate","nat","bat"]
     * Output: [["bat"],["nat","tan"],["ate","eat","tea"]]
     *
     * Input: strs = [""]
     * Output: [[""]]
     *
     * Input: strs = ["a"]
     * Output: [["a"]]
     */

    public static void main(String[] args) {

        String[] s1 = {"eat", "tea", "tan", "ate", "nat", "bat"};
        String[] s2 = {""};
        String[] s3 = {"a"};

        System.out.println("S1 = " + Arrays.toString(s1) + "result = " + groupAnagram(s1));
        System.out.println("S2 = " + Arrays.toString(s2) + "result = " + groupAnagram(s2));
        System.out.println("S3 = " + Arrays.toString(s3) + "result = " + groupAnagram(s3));

    }

    private static List<List<String>> groupAnagram(String[] str) {
        Map<String, List<String>> map = new HashMap<>();

        for (String s : str) {
            char[] chars = new char[26];

            for (char c : s.toCharArray()) {
                chars[c - 'a']++;
            }

            String key = String.valueOf(chars);

            if (!map.containsKey(key)) {
                List<String> list = new ArrayList<>();
                list.add(s);
                map.put(key, list);
            } else {
                map.get(key).add(s);
            }

        }

        return new ArrayList<>(map.values());
    }
}

package org.pushkar.neetcode.arrays;


import java.util.HashMap;
import java.util.Map;

public class ValidAnagram {

    /**
     * Problem Link = <a href="https://leetcode.com/problems/valid-anagram/description/">Problem Link</a>
     *
     * Input: s = "anagram", t = "nagaram"
     * Output: true
     *
     * Input: s = "rat", t = "car"
     * Output: false
     */

    public static void main(String[] args) {

        String s1 = "anagram";
        String t1 = "nagaram";

        String s2 = "rat";
        String t2 = "car";

        String s3 = "jar";
        String t3 = "jam";

        System.out.println("Is Anagram S1 T1 = " + isAnagram(s1, t1));
        System.out.println("Is Anagram S2 T2 = " + isAnagram(s2, t2));
        System.out.println("Is Anagram S3 T3 = " + isAnagram(s3, t3));

    }

    private static boolean isAnagram(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }

        Map<Character,Integer> map = new HashMap<>();

        for (Character c: s1.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        for (Character c: s2.toCharArray()) {
            if (!map.containsKey(c)) {
                return false;
            }

            int count = map.get(c);

            count = count - 1;

            if (count == 0){
                map.remove(c);
            } else {
                map.put(c, count);
            }
        }

        return map.isEmpty();
    }
}

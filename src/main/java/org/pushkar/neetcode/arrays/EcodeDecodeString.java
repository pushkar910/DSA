package org.pushkar.neetcode.arrays;


import java.util.*;

public class EcodeDecodeString {

    /**
     * Problem Link = <a href="https://neetcode.io/problems/string-encode-and-decode">Problem Link</a>
     *
     * Input: ["neet","code","love","you"]
     * Output:["neet","code","love","you"]
     *
     * Input: ["we","say",":","yes"]
     * Output: ["we","say",":","yes"]
     */

    public static void main(String[] args) {

        String[] s1 = {"neet", "code","love","you"};
        String[] s2 = {"we","say",":","yes"};

        String encoded1 = encode(s1);
        System.out.println("S1 =" + Arrays.toString(s1) + " << Encoded >>= "+ encoded1 + " << Decoded  >>= "+ Arrays.toString(decode(encoded1)));

        String encoded2 = encode(s2);
        System.out.println("S2 =" + Arrays.toString(s2) + " << Encoded >>= "+ encoded2 + " << Decoded >>= "+ Arrays.toString(decode(encoded2)));

    }

    private static String encode(String[] arr){
        StringBuilder sb = new StringBuilder();
        for (String s : arr) {
            sb.append(s.length());
            sb.append("#");
            sb.append(s);
        }
        return sb.toString();
    }

    private static String[] decode(String str){
        String[] res = new String[4];
        int resIdx = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '#') {
                int idx = Integer.parseInt(String.valueOf(str.charAt(i-1)));
                res[resIdx++] = str.substring(i+1, i+1+idx);
            }
        }
        return res;
    }


}

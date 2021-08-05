package leetcode.Sliding_Window;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Stack;

public class Main567 {
    //滑动窗口
    public static boolean checkInclusion(String s1, String s2) {
        if (s2.length()<s1.length()){
            return false;
        }

        int[] cnt1 = new int[26];  //用来保存各个字符的个数
        int[] cnt2 = new int[26];  //统计当前遍历的子串中各个字符的个数

        for (int i = 0; i < s1.length(); i++) {
            cnt1[s1.charAt(i)-'a'] = cnt1[s1.charAt(i)-'a']+1;
            cnt2[s2.charAt(i)-'a'] = cnt2[s2.charAt(i)-'a']+1;
        }

        if (Arrays.equals(cnt1,cnt2)){
            return true;
        }

        for (int i = s1.length(); i < s2.length(); i++) {
            cnt2[s2.charAt(i)-'a'] = cnt2[s2.charAt(i)-'a']+1;
            cnt2[s2.charAt(i-s1.length())-'a'] = cnt2[s2.charAt(i-s1.length())-'a'] -1;
            if (Arrays.equals(cnt1,cnt2)){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        boolean b = Main567.checkInclusion("ab", "eidabooo");
        System.out.println(b);
    }
}

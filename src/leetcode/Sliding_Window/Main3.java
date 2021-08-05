package leetcode.Sliding_Window;

import java.util.HashSet;
import java.util.Set;

public class Main3 {
    public static int lengthOfLongestSubstring(String s) {
        if (s.length() == 0){
            return 0;
        }
        int len = s.length();
        int max = 1;
        for (int i = 0; i < s.length(); i++) {
            Set<Character> set = new HashSet<>();
            int count = i;
            while(count<len && set.add(s.charAt(count))){
                count++;
            }
            max =Math.max(max,(count-i));
        }
        return max;
    }

    public static void main(String[] args) {
        int abcabcbb = Main3.lengthOfLongestSubstring("au");
        System.out.println(abcabcbb);
    }
}

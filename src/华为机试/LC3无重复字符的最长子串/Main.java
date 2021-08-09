package 华为机试.LC3无重复字符的最长子串;

import java.util.HashMap;
import java.util.HashSet;

/*
 * @description:
 * @author: Felix_XHF
 * @create:2021-08-09 10:19
 */
public class Main {
    /*
    * @Description: 暴力解法
    * @Author: Mr.Felix
    * @Time: 2021/8/9
    **/
    public int lengthOfLongestSubstring(String s) {
        if(s.length() <= 1){
            return s.length();
        }
        int max = 0;
        HashSet<Character> set = new HashSet<>();
        for(int i = 0;i<s.length()-1;i++){
            int count = 0;
            set.clear();
            for(int j = i;j<s.length();j++){
                boolean add = set.add(s.charAt(j));
                if (add){
                    count++;
                }else{
                    break;
                }
            }
            if(count > max){
                max = count;
            }
        }
        return max;
    }


    /*
    * @Description: 滑动窗口
    * @Author: Mr.Felix
    * @Time: 2021/8/9
    **/
    public int lengthOfLongestSubstringPlus(String s) {
        if(s.length() == 0){
            return 0;
        }

        int slow = 0;
        int max = 0;

        char[] chars = s.toCharArray();

        //用于存放出现过的字符最后一次出现的位置
        HashMap<Character,Integer> lastOccurrent = new HashMap<>();

        //从头开始遍历字符数组
        for(int fast = 0; fast<s.length();fast++){
            //如果map中有这个字符，说明已经出现过了这个字符，那么就要让slow指针指向最近一次出现位置的下一个位置
            if(lastOccurrent.containsKey(chars[fast])){
                if(lastOccurrent.get(chars[fast]) + 1 > slow){
                    //为了保证slow是一直往前进的，而不会出现后退的状况，eg：abba
                    slow = lastOccurrent.get(chars[fast]) + 1 ;
                }
            }
            //不管之前有没有出现过当前字符，都要把当前字符的为位置记录进map中
            lastOccurrent.put(chars[fast],fast);
            //判断最新的max是多大
            if(fast-slow+1 > max){
                max = fast-slow+1;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Main main = new Main();
        int abcabcbb = main.lengthOfLongestSubstringPlus("abcabcbb");
        System.out.println(abcabcbb);
    }
}

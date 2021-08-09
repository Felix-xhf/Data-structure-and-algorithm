package 华为机试.LC30串联所有单词的子串;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/*
 * @description:
 * @author: Felix_XHF
 * @create:2021-08-09 14:09
 */
public class Main {
    public List<Integer> findSubstring(String s, String[] words) {
        List<Integer> res = new ArrayList<>();
        int wordNum = words.length;
        if (wordNum == 0){
            return res;
        }

        int wordLen = words[0].length();

        //HashMap1中存所有的单词
        HashMap<String,Integer> allWords = new HashMap<>();
        for (String word : words) {
            int value = allWords.getOrDefault(word,0);
            allWords.put(word,value+1);
        }

        //遍历所有的子串
        for (int i = 0; i < s.length() - wordLen * wordNum + 1; i++) {
            //HashMap存当前扫描的字符串含有的单词
            HashMap<String,Integer> hasWords = new HashMap<>();
            int num = 0;

            //判断子串是否符合
            while(num<wordNum){
                String word = s.substring(i+num*wordLen,i+(num+1)*wordLen);
                //判断该单词是否在HashMap1中
                if (allWords.containsKey(word)){
                    int value = hasWords.getOrDefault(word,0);
                    hasWords.put(word,value+1);
                    //判断当前单词的value和HashMap1中该单词的value
                    if (hasWords.get(word) > allWords.get(word)){
                        break;
                    }
                }else{
                    break;
                }
                num++;
            }
            //判断是不是所有的条件都满足
            if (hasWords == allWords){
                res.add(i);
            }
        }
        return res;
    }
}

package 华为机试.LC49字母异位词分组;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/*
 * @description:
 * @author: Felix_XHF
 * @create:2021-08-09 13:37
 */
public class Main {
    public List<List<String>> groupAnagrams(String[] strs) {
        //用来存储key，和对应的List集合，该集合中所有的元素经过排序之后与key是一致的
        HashMap<String, List<String>> map = new HashMap<>();
        //新建一个字符串数组来保存strs中每个元素对应的key值
        String[] temp = new String[strs.length];

        int count = 0;
        //计算strs中每个元素对应的key
        for (String str : strs) {
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            String key = new String(chars);
            temp[count++] = key;
        }


        for (int i = 0; i < temp.length; i++) {
            //如果map中没有key，那么就将这个key添加到map中
            if (!map.containsKey(temp[i])){
                List<String> list = new ArrayList<>();
                list.add(strs[i]);
                map.put(temp[i],list);
            }else{
                //如果已经有key了，那么先取出该key对应的list，在list的后面添加新的值，在将key和list添加到map中去
                List<String> list = map.get(temp[i]);
                list.add(strs[i]);
                map.put(temp[i],list);
            }
        }
        //返回对应的结果，ArrayList中的值是map中的values
        return new ArrayList<List<String>>(map.values());
    }
}

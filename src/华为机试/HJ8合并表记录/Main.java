package 华为机试.HJ8合并表记录;

import java.util.*;

/*
 * @description:
 * @author: Felix_XHF
 * @create:2021-08-02 11:12
 */
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int sum = sc.nextInt();
        LinkedHashMap<Integer, Integer> map = new LinkedHashMap<>();

        for (int i = 0; i < sum; i++) {
            int key = sc.nextInt();
            int value = sc.nextInt();
            if (map.containsKey(key)){
                map.put(key,map.get(key)+value);
            }else {
                map.put(key,value);
            }
        }




        for (Map.Entry<Integer,Integer> entry: map.entrySet()){
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}

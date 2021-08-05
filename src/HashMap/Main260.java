package HashMap;

import java.util.HashMap;
import java.util.Map;

public class Main260 {
    public int[] singleNumber(int[] nums) {
        if(nums.length == 2){
            return new int[]{nums[0],nums[1]};
        }


        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i<nums.length; i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i],map.get(nums[i])+1);
            }else{
                map.put(nums[i],1);
            }
        }
        int[] res = new int[2];
        int count = 0;
        for (Integer key:
             map.keySet()) {
            if (map.get(key) == 1){
                res[count++] = key;
            }
        }
        return res;
    }
}

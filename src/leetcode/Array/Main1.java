package leetcode.Array;

import java.util.HashMap;

public class Main1 {
    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] res = new int[2];
        int temp;
        for(int i =0;i<nums.length;i++){
            temp = target - nums[i];
            if(map.containsKey(temp)){
                res[1] = i;
                res[0] = map.get(temp);
                break;
            }else{
                map.put(nums[i],i);
            }
        }
        return res;
    }


    public static void main(String[] args) {
        int[] ints = {2, 7, 11, 15};
        int[] ints1 = Main1.twoSum(ints, 9);
        for (int i : ints1) {
            System.out.println(i);
        }
    }
}

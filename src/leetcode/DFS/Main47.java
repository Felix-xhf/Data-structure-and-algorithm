package leetcode.DFS;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main47 {
    public List<List<Integer>> permuteUnique(int[] nums) {
        Set<List<Integer>> res = new HashSet<>();

        List<List<Integer>> zero = new ArrayList<>();
        List<Integer> path = new ArrayList<>();
        int len = nums.length;

        if (len== 0){
            return zero;
        }

        boolean[] used = new boolean[len];
        dfs(nums,0,len,res,path,used);


        for (List<Integer> re : res) {
            zero.add(re);
        }
        return zero;
    }

    private void dfs(int[] nums, int depth, int len, Set<List<Integer>> res, List<Integer> path, boolean[] used) {
        if (depth == len){
            res.add(new ArrayList<>(path));
        }

        for (int i = 0; i < len; i++) {
            if (!(used[i])){
                used[i] = true;
                path.add(nums[i]);
                dfs(nums,depth+1,len,res,path,used);
                path.remove(path.size()-1);
                used[i] = false;
            }
        }
    }

    public static void main(String[] args) {
        int[] nums = {1, 1, 2};
        Main47 main47 = new Main47();

        List<List<Integer>> lists = main47.permuteUnique(nums);
        System.out.println(lists);
    }
}

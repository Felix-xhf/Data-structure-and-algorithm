package leetcode.回溯;

import java.util.ArrayList;
import java.util.List;

//给定一个不含重复数字的数组 nums ，返回其 所有可能的全排列 。你可以 按任意顺序 返回答案。

public class Main46 {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        if (nums.length == 0){
            return res;
        }
        int len = nums.length;
        List<Integer> path = new ArrayList<>();
        boolean[] used = new boolean[len];
        dfs(nums,0,len,res,path,used);
        return res;
    }

    private void dfs(int[] nums, int depth, int len, List<List<Integer>> res, List<Integer> path, boolean[] used) {
        if (len == depth){
            res.add(new ArrayList<>(path));
            return;
        }

        for (int i = 0; i < len; i++) {
            if (!used[i]){
                path.add(nums[i]);
                used[i] = true;
                dfs(nums,depth+1,len,res,path,used);
                path.remove(path.size()-1);
                used[i] = false;
            }
        }
    }

    public static void main(String[] args) {
        int[] can = {2,3,6};
        int target = 7;
        Main46 main46 = new Main46();
        List<List<Integer>> lists = main46.permute(can);
        System.out.println(lists);
    }
}

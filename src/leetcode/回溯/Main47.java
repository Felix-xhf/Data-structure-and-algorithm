package leetcode.回溯;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main47 {
    public List<List<Integer>> permuteUnique(int[] nums){
        List<List<Integer>> res = new ArrayList<>();
        if (nums.length == 0){
            return res;
        }
        int len = nums.length;
        List<Integer> path = new ArrayList<>();

        //排序是剪枝的前提
        Arrays.sort(nums);



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
            // 剪枝条件：i > 0 是为了保证 nums[i - 1] 有意义
            // 写 !used[i - 1] 是因为 nums[i - 1] 在深度优先遍历的过程中刚刚被撤销选择
            if (i>0 && nums[i] == nums[i-1] && !used[i-1]){
                continue;
            }


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
        int[] can = {1,1,2};
        int target = 7;
        Main47 main47 = new Main47();
        List<List<Integer>> lists = main47.permuteUnique(can);
        System.out.println(lists);
    }
}

package leetcode.DFS;

import java.util.ArrayList;
import java.util.List;

public class Main46 {
    public List<List<Integer>> permute(int[] nums) {
        int len = nums.length;
        //使用一个动态数组保存所有的全排列
        List<List<Integer>> res = new ArrayList<>();

        //特殊情况，直接退出
        if (len== 0){
            return res;
        }

        //开辟一个辅助的空间，来判断当前的是否已经用过了
        boolean[] used = new boolean[len];

        //用于存储一个当前的数组
        List<Integer> path = new ArrayList<>();


        dfs(nums,len,0,path,used,res);

        return res;
    }

    private void dfs(int[] nums, int len, int depth, List<Integer> path, boolean[] used, List<List<Integer>> res) {
        if (depth == len){
            res.add(new ArrayList<>(path));
            return;
        }

        for (int i = 0; i < len; i++) {
            if (!used[i]) {  //如果该数字还没有用过，那么就走下面的步骤  true 用过了， false没有用过
                path.add(nums[i]);
                used[i] = true;

                System.out.println("递归之前=》" + path);
                dfs(nums, len, depth + 1, path, used, res);
                used[i] = false;
                path.remove(path.size() - 1);
                System.out.println("递归之后=》"+ path);

            }
        }
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        Main46 main46 = new Main46();

        List<List<Integer>> lists = main46.permute(nums);
        System.out.println(lists);
    }
}

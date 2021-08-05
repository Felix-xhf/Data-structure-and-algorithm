package leetcode.回溯;


/*
* leetcode39   组合总和
*
* */


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main39 {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        int len = candidates.length;
        List<List<Integer>> res = new ArrayList<>();
        if (len == 0 || candidates[0] > target){
             return res;
        }

        ArrayList<Integer> path = new ArrayList<>();
        dfs(candidates,0,len,target,path,res);
        return res;
    }

    private void dfs(int[] candidates, int begin, int len, int target, ArrayList<Integer> path, List<List<Integer>> res) {
        //target:为负数的时候 不再产生新的孩子结点
        if (target<0){
            return;
        }
        if (target==0){
            res.add(new ArrayList<>(path));
            return;
        }

        //从begin开始搜索
        for (int i = begin; i < len; i++) {
            path.add(candidates[i]);

            dfs(candidates,i,len,target-candidates[i],path,res);

            //回溯
            path.remove(path.size()-1);
        }
    }

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        if (candidates[0] > target){
            return res;
        }
        ArrayList<Integer> path = new ArrayList<>();
        dfs(candidates,path,res,0,target);
        return res;
    }

    private void dfs(int[] candidates, ArrayList<Integer> path, List<List<Integer>> res,int sum, int target) {
        if (sum == target){
            res.add(new ArrayList<>(path));
            return;
        }
        if (sum>target){
            return;
        }

        for (int i = 0; i < candidates.length; i++) {
            sum += candidates[i];
            path.add(candidates[i]);
            dfs(candidates,path,res,sum,target);
            path.remove(path.size()-1);
            sum -= candidates[i];
        }
    }




    public static void main(String[] args) {
        int[] can = {2,3,6,7};
        int target = 7;
        Main39 main39 = new Main39();
        List<List<Integer>> lists = main39.combinationSum(can, target);
        System.out.println(lists);
    }
}

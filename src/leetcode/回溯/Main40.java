package leetcode.回溯;

import java.util.ArrayList;
import java.util.List;

public class Main40 {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        if (candidates.length == 0){
            return res;
        }
        int len = candidates.length;
        boolean[] used = new boolean[len];
        List<Integer> path = new ArrayList<>();

        dfs(candidates,target,len,used,path,res);

        return res;

    }

    private void dfs(int[] candidates, int target, int len, boolean[] used, List<Integer> path, List<List<Integer>> res) {
        if (target < 0){
            return;
        }
        if (target == 0){
            res.add(new ArrayList<>(path));
            return;
        }
        for (int i = 0; i < len; i++) {
            if (!used[i]){
                path.add(candidates[i]);
                used[i] = true;
                dfs(candidates,target-candidates[i],len,used,path,res);
                path.remove(path.size()-1);
                used[i] = false;
            }
        }
    }
}

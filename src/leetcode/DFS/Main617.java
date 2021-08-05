package leetcode.DFS;

import Utils.TreeNode;

public class Main617 {
    public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
        if (root1 == null || root2 == null){
            if (root1 == null){
                return root2;
            }else {
                return root1;
            }
        }

        return dfs(root1,root2);
    }

    private TreeNode dfs(TreeNode root1, TreeNode root2) {
        // 如果 r1和r2中，只要有一个是null，函数就直接返回
        if(root1==null || root2==null) {
            return root1==null? root2 : root1;
        }

        root1.val += root2.val;
        root1.left = dfs(root1.left,root2.left);
        root1.right = dfs(root1.left,root2.right);
        return root1;
    }
}

package nowcoder.offer_JZ39平衡二叉树;

import Utils.TreeNode;

public class Solution {
    public boolean isBalanced(TreeNode root){
        if (root==null){
            return true;
        }

        int l = Max(root.left);
        int r = Max(root.right);

        return l-r >=-1 && l-r <=1 && isBalanced(root.left) && isBalanced(root.right);

    }




    public int Max(TreeNode root){
        if(root == null){
            return 0;
        }
        //分别得到了root的左右子树的深度
        int l = Max(root.left);
        int r = Max(root.right);

        if (l>r){
            return l+1;
        }else{
            return r+1;
        }
    }
}

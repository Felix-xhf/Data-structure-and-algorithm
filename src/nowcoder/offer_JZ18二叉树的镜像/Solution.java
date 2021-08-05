package nowcoder.offer_JZ18二叉树的镜像;

import Utils.TreeNode;

public class Solution {




    public TreeNode mirrorTree(TreeNode root){
        if (root==null){
            return root;
        }

        //获取反转过的子树
        TreeNode l = mirrorTree(root.left);
        TreeNode r = mirrorTree(root.right);

        //左右互换
        root.left = r;
        root.right = l;

        return root;
    }
}

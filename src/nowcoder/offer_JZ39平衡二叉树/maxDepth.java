package nowcoder.offer_JZ39平衡二叉树;

import Utils.TreeNode;

//求二叉树的最大深度
public class maxDepth {
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

package nowcoder.offer07重建二叉树;


import java.util.Arrays;

public class Solution {
    public static TreeNode buildTree(int[] preorder, int[] inorder){
        if (preorder ==null || preorder.length==0){
            return null;
        }

        //1.获取到树根节点的value值
        TreeNode root = new TreeNode(preorder[0]);

        int index = findIndex(preorder,inorder);


        //2.构建left左子树，right子树
//        root.left = buildTree(左子树的前序数组，左子树的中序数组);
        root.left = buildTree(Arrays.copyOfRange(preorder,1,index+1),Arrays.copyOfRange(inorder,0,index));


//        root.right = buildTree(右子树的前序数组，右子树的中序数组);
        root.right = buildTree(Arrays.copyOfRange(preorder,index+1,preorder.length),Arrays.copyOfRange(inorder,index+1,inorder.length));

        //3.返回root
        return root;

    }


    //构造一个找到索引为index的函数
    private static int findIndex(int[] preorder,int[] inorder){
        for (int i = 0; i < inorder.length; i++) {
            if(inorder[i] == preorder[0]){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] preorder = new int[]{3,9,20,15,7};
        int[] inorder = new int[]{9,3,15,20,7};
        TreeNode treeNode = Solution.buildTree(preorder, inorder);
        System.out.println(treeNode);
    }
}



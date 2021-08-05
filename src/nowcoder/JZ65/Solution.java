package nowcoder.JZ65;

public class Solution {


    public boolean hasPath (char[][] matrix, String word) {
        // write code here
        //开始遍历每一个元素
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                //每个点都当成【起点】处理，看是否满足。只要有一个满足，就返回true
                //(i,j)代表着在矩阵中搜索的起点，0代表字符串的起点
                if (dfs(i,j,0,matrix,word)){
                    return true;
                }
            }
        }
        return false;
    }

    private static boolean dfs(int i, int j, int k,char[][] matrix,String word){
        //当前的点越界了 or 与给定值不同 or 已经搜索过了(特殊处理)，直接返回false
        if (i<0 || i>= matrix.length || j< 0|| j>=matrix[0].length|| matrix[i][j] != word.charAt(k)){
            return false;
        }

        //检查到最后了，返回true
        if (k==word.length()-1){
            return true;
        }

        //临时保存，需要恢复，这就是回溯算法
        char c = matrix[i][j];
        matrix[i][j] = 0;//字符串没有0，它和任何给定的字符都匹配不上。表明当前字符已经搜索过了，杜绝循环递归
        //k+1 即为给定字符串的下一个位置。既然当前相同，则比较下一个是否相同
        boolean ret = dfs(i-1,j,k+1,matrix,word)||dfs(i+1,j,k+1,matrix,word)||dfs(i,j-1,k+1,matrix,word)||dfs(i,j+1,k+1,matrix,word);//只要有一个是true就是true
        matrix[i][j]=c;//恢复
        return ret;

    }
}

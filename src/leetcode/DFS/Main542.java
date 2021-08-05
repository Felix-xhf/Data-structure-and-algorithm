package leetcode.DFS;


import com.sun.javaws.IconUtil;

//01矩阵
public class Main542 {
    public int[][] updateMatrix(int[][] mat) {
        if (mat==null || mat.length==0 || mat[0].length==0){
            return mat;
        }

        int[][] res = new int[mat.length][mat[0].length];
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                if (mat[i][j] == 0){
                    res[i][j] = 0;
                }else{
                    int count = 0;
                    res[i][j] = dfs(mat,i,j,count);
                }

            }
        }
        return res;
    }

    private int dfs(int[][] mat, int i, int j,int count) {


        //若不合法直接返回
        if (i < 0 || i >= mat.length || j < 0 || j >= mat[0].length) {
            return 0;
        }

        if (mat[i+1][j] == 1 && mat[i-1][j] == 1&&mat[i][j-1] == 1&&mat[i][j+1] == 1){
            count = 1;

        }else{
            return count;
        }

        return count;
    }
}

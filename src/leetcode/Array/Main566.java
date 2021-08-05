package leetcode.Array;

public class Main566 {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int cow = mat.length;
        int row = mat[0].length;
        if (cow*row != r*c){
            return mat;
        }
        int[] res = new int[r*c];
        int count = 0;
        for (int i = 0; i < cow; i++) {
            for (int j = 0; j < row; j++) {
                res[count++] = mat[i][j];
            }
        }

        int result[][] = new int[r][c];
        count=0;
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                result[i][j] = res[count++];
            }
        }
        return result;
    }
}

package leetcode.DFS;

public class Main695 {
    public int maxAreaOfIsland(int[][] grid) {
        if (grid==null||grid.length==0||grid[0].length==0){
            return 0;
        }

        int res = 0;
        final int row = grid.length;
        final int col = grid[0].length;

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (grid[i][j] == 1){
                    int a = dfs(grid,i,j);
                    res = Math.max(a,res);
                }
            }
        }
        return res;
    }


    private int dfs(int[][] grid,int i,int j){
        //若不合法直接返回
        if (i<0 || i>=grid.length || j<0 || j>=grid[0].length){
            return 0;
        }
        //若该方格不满足，则直接返回
        if (grid[i][j] != 1){
            return 0;
        }


        //标记已经遍历
        grid[i][j] = 0;


        return 1+dfs(grid,i-1,j)+dfs(grid,i+1,j)+dfs(grid,i,j-1)+dfs(grid,i,j+1);


//        dfs(grid,i-1,j); //上边相连
//        dfs(grid,i+1,j); //下边相连
//        dfs(grid,i,j-1); //左边相连
//        dfs(grid,i,j+1); //右边相连
    }
}

package leetcode.DFS;

public class Main200 {
    public int numIslands(char[][] grid) {
        if (grid==null || grid.length==0 || grid[0].length==0){
            return 0;
        }

        int res = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == '1'){
                    res++;
                    dfs(grid,i,j);
                }
            }
        }
        return res;
    }

    private void dfs(char[][] grid, int i, int j) {
        //若不合法直接返回
        if (i<0 || i>=grid.length || j<0 || j>=grid[0].length){
            return;
        }
        //若该方格不满足，则直接返回
        if (grid[i][j] != '1'){
            return;
        }

        //标记已经遍历
        grid[i][j] = 0;

        dfs(grid,i-1,j); //上边相连
        dfs(grid,i+1,j); //下边相连
        dfs(grid,i,j-1); //左边相连
        dfs(grid,i,j+1); //右边相连
    }
}

package leetcode.DFS;

public class Main733 {
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        int oldColor = image[sr][sc];  //使用oldColor记录起始位置的颜色

        dfs(image,sr,sc,oldColor,newColor);

        return image;
    }

    private void dfs(int[][] image, int sr, int sc, int oldColor, int newColor) {
        //寻找出口条件
        if (sr<0||sr>=image.length||sc<0||sc>=image[0].length){
            return;
        }

        //条件2，当前点的颜色和起始点的颜色不一样，或者当前点的颜色和需要变为的颜色一致，不需要改变直接结束
        if (image[sr][sc] != oldColor || image[sr][sc] == newColor){
            return;
        }

        //判断四个方向  使用dfs

        //1.需要将当前点的坐标颜色变为newColor
        image[sr][sc] = newColor;
        //2.判断右边的坐标
        dfs(image,sr,sc+1,oldColor,newColor);
        //3.判断下边的坐标
        dfs(image,sr+1,sc,oldColor,newColor);
        //4.判断右边的坐标
        dfs(image,sr,sc-1,oldColor,newColor);
        //3.判断上边的坐标
        dfs(image,sr-1,sc,oldColor,newColor);
    }
}

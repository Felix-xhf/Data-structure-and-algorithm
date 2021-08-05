package nowcoder.JZ1;

public class Solution {
    //时间复杂度太大了，需要进行优化
    public static boolean Find(int target, int [][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                if (array[i][j]==target){
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean Find1(int target, int [][] array) {
        int i = array.length-1;
        int j = 0;
        while(true){
            if(i<0||j>= array[0].length){
                return false;
            }
            if (array[i][j]==target){
                return true;
            }else if (array[i][j]>target){
                i--;
            }else {
                j++;
            }
        }
    }


    public static void main(String[] args) {
        int[][] array = new int[][]{{1,2,8,9},{2,4,7,10,13},{4,7,10,13},{6,8,11,15}};
        System.out.println(Solution.Find1(7,array));



    }
}

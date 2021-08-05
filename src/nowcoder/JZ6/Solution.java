package nowcoder.JZ6;

public class Solution {
    public static int minNumberInRotateArray(int [] array) {
        for (int i = 0; i < array.length-1; i++) {
            if (array[i]>array[i+1]){
                return array[i+1];
            }
        }
        if (array.length==0){
            return 0;
        }
        return array[0];
    }

    public static void main(String[] args) {
        int[] array = new int[]{3,4,5,1,2};
        System.out.println(minNumberInRotateArray(array));
    }
}

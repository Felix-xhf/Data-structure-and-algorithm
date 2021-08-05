package nowcoder.JZ13;

public class Solution {
    public static int[] reOrderArray (int[] array) {
        // write code here
        int[] temp = new int[array.length];
        int count=0;
        int odd=0;
        for (int i = 0; i < array.length; i++) {
            if (array[i]%2==0){
                temp[count++]=array[i];
            }else{
                array[odd++]=array[i];
            }
        }
        int cur = 0;
        for (int i = odd; i < array.length; i++) {
            array[i]=temp[cur++];
        }
        return array;
    }

    public static void main(String[] args) {
        int[] array = new int[]{1,2,3,4};
        int[] ints = Solution.reOrderArray(array);
        for (int anInt : ints) {
            System.out.print(anInt);
        }
    }
}

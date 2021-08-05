package leetcode;

import java.util.HashSet;
import java.util.Set;

/*
 * @program:Exer
 *
 * @author: Felix_XHF
 *
 * @create:2021-07-23 19:49
 */
public class Main1893 {
    public boolean isCovered1(int[][] ranges, int left, int right) {
        Set<Integer> set = new HashSet<>();
        for (int[] range : ranges) {
            for (int j = range[0]; j <= range[1]; j++) {
                set.add(j);
            }
        }

        for (int i = left; i <=right; i++) {
            if (set.add(i)){
                return false;
            }
        }
        return true;
    }

    public boolean isCovered(int[][] ranges, int left, int right) {
        int[] temp = merge(ranges[0],ranges[1]);
        int count = 2;
        while (count<ranges.length){
            temp = merge(temp,ranges[count]);
            count++;
        }
        return temp[0] <=left && temp[1] >= right;

    }
    private int[] merge(int[] arr1,int[] arr2){
        int left;
        int right;
        if (arr1[0] < arr2[0]){
             left = arr1[0];
        }else{
             left = arr2[0];
        }

        if (arr1[1] > arr2[1]){
             right = arr1[1];
        }else {
             right = arr2[1];
        }
        System.out.println(right);
        System.out.println(left);
        return new int[]{left,right};
    }


    public static void main(String[] args) {
        Main1893 main1893 = new Main1893();
        int[][] ints = new int[3][2];
        ints[0] = new int[]{1,2};
        ints[1] = new int[]{3,4};
        ints[2] = new int[]{5,6};

        boolean covered = main1893.isCovered1(ints, 2, 5);
        System.out.println(covered);
    }
}

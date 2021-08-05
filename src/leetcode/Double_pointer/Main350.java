package leetcode.Double_pointer;

import java.util.ArrayList;
import java.util.Arrays;

public class Main350 {
    public static int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        ArrayList<Integer> list = new ArrayList<>();
        int i = 0;
        int j = 0;
        while(i<nums1.length && j<nums2.length){
            if(nums1[i] == nums2[j]){
                list.add(nums1[i]);
                i++;
                j++;
                continue;
            }
            if (nums1[i] > nums2[j]){
                j++;
                continue;
            }
            if (nums1[i] < nums2[j]){
                i++;
            }
        }
        int[] res = new int[list.size()];
        int count = 0;
        for (Integer integer : list) {
            res[count++] = integer;
        }
        return res;

    }

    public static void main(String[] args) {
        int[] nums1 = {1,2};
        int[] nums2 = {1,1};
        int[] intersect = Main350.intersect(nums1, nums2);
        for (int i : intersect) {
            System.out.println(i);
        }
    }
}

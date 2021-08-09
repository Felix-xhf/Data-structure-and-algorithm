package 华为机试.HJ28素数伴侣;

import java.util.Arrays;
import java.util.Scanner;

/*
 * @description:
 * @author: Felix_XHF
 * @create:2021-08-09 14:42
 */
public class Main {
    public static void main(String[] args) {
        Main main = new Main();

        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int len = sc.nextInt();
            int[] nums = new int[len];
            for (int i = 0; i < len; i++) {
                nums[i] = sc.nextInt();
            }

        }
    }

    private boolean Judgment(int num1,int num2){
        int sum = num1 + num2;
        if (sum <= 3){
            return sum>1;
        }

        for (int i = 2; i < sum; i++) {
            if (sum%i == 0){
                return true;
            }
        }
        return false;
    }
}

package 华为机试.HJ7取近似值;

import java.util.Arrays;
import java.util.Scanner;

/*
 * @description:
 * @author: Felix_XHF
 * @create:2021-08-02 10:48
 */
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        float input = sc.nextFloat();

        String in = input + "";
        String right = in.split("\\.")[0];
        String left = in.split("\\.")[1];
        int len = left.length();
        int pre = Integer.parseInt(right);
        int cur = Integer.parseInt(left);
        float current;
        if(cur<10){
            current = (float) cur;
        }else{
            current = (float) (cur/(Math.pow(10,len-1)));
        }


        if(current<5){
            System.out.print(pre);
        }else{
            System.out.print(pre+1);
        }
    }
}

package 华为机试.HJ11数字颠倒;

import java.util.Scanner;

/*
 * @description:
 * @author: Felix_XHF
 * @create:2021-08-02 13:31
 */
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        String in = input + "";
        StringBuilder sb = new StringBuilder(in);
        for(int i = 0;i<in.length()/2;i++){
            char temp = in.charAt(i);
            sb.setCharAt(i,in.charAt(in.length()-1-i));
            sb.setCharAt(in.length()-1-i,temp);
        }
        String cur = sb.toString();

        System.out.print(cur);
    }
}

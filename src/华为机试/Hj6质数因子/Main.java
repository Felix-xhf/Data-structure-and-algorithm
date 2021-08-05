package 华为机试.Hj6质数因子;

import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long input = sc.nextLong();

        StringBuilder sb = new StringBuilder();
        long left = input;
        for(long i = 2;i<=Math.sqrt(left);i++){
            if(i>2 && i%2==0){
                continue;
            }
            if(i>3 && i%3==0){
                continue;
            }
            if(i>5 && i%5==0){
                continue;
            }
            if(i>7 && i%7==0){
                continue;
            }
            if(i>11 && i%11==0){
                continue;
            }
            if(i>13 && i%13==0){
                continue;
            }

            while(input % i == 0){
                sb.append(i);
                sb.append(" ");
                input = input/i;
            }

        }
        if(input> Math.sqrt(left)){
            sb.append(input);
        }

        //sb.deleteCharAt(sb.length()-1);
        System.out.println(sb.toString());
    }
}
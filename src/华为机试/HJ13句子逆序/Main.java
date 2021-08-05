package 华为机试.HJ13句子逆序;

import java.util.Scanner;
import java.util.Stack;

/*
 * @description：
 * 输入：I am a boy
 * 输出：boy a am I
 * @author: Felix_XHF
 * @create:2021-08-02 13:43
 */
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        input = input + " ";
        Stack<String> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();
        int index = 0;
        while(index < input.length()){
            if (input.charAt(index) != ' '){
                sb.append(input.charAt(index++));
            }else{
                stack.push(sb.toString());
                sb.delete(0,sb.length());
                index++;
            }
        }
        while(!stack.isEmpty()){
            System.out.print(stack.pop());
        }
    }
}

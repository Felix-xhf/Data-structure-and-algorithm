package 华为机试.HJ5进制转换;

import java.util.Scanner;

/*
 * @description:
 * @author: Felix_XHF
 * @create:2021-08-01 21:05
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()) {
            String str = scanner.nextLine();

            int res = 0;
            str = str.substring(2,str.length());
            char[] chars = str.toCharArray();

            for (int i = str.length()-1; i >=0; i--) {
                int j = str.length()-1-i;
                if (chars[i] == 'A'){
                    res = (int) (res + 10*Math.pow(16,j));
                    continue;
                }
                if (chars[i] == 'B'){
                    res = (int) (res + 11*Math.pow(16,j));
                    continue;
                }
                if (chars[i] == 'C'){
                    res = (int) (res + 12*Math.pow(16,j));
                    continue;
                }
                if (chars[i] == 'D'){
                    res = (int) (res + 13*Math.pow(16,j));
                    continue;
                }
                if (chars[i] == 'E'){
                    res = (int) (res + 14*Math.pow(16,j));
                    continue;
                }
                if (chars[i] == 'F'){
                    res = (int) (res + 15*Math.pow(16,j));
                    continue;
                }
                res = (int) (res + Integer.parseInt(String.valueOf(chars[i]))*Math.pow(16,j));
            }
            System.out.println(res);
        }
    }
}

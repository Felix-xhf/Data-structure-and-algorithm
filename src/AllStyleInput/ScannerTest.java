package AllStyleInput;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ScannerTest {
    @Test
    public void test1(){
        //不知道有多少行输入(或者多测试用例）。如果是先获取所有输入，再集中处理，使用ctrl+D结束输入。
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();
        while(scanner.hasNext()){
            list.add(scanner.next());
        }
        scanner.close();
    }

    /*
    * @Description:
    * 输入说明
        1 输入一个正偶数n
        2 输入n个整数
        注意：数据可能有多组
        * 例如：
        *   4
            2 5 6 13
            2
            3 6
    * @Author: Mr.Felix
    * @Time: 2021/8/9
    **/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int len = sc.nextInt();
            int[] nums = new int[len];
            for (int i = 0; i < len; i++) {
                nums[i] = sc.nextInt();
            }
            System.out.println(Arrays.toString(nums));
        }
    }
}

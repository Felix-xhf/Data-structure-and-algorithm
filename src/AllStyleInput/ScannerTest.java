package AllStyleInput;

import org.junit.Test;

import java.util.ArrayList;
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
}

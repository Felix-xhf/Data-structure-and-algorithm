package 面试;

import java.lang.reflect.Field;

/*
 * @description:
 * @author: Felix_XHF
 * @create:2021-08-04 20:51
 */
public class Demo1 {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        String s = new String ("abc");

        //在这中间可以添加N行代码。但必须保证s引用的指向不变，最终将输出变成abcd

        //反射
        Field value = s.getClass().getDeclaredField("value");
        value.setAccessible(true);
        value.set(s,"abcd".toCharArray());

        System.out.println(s);
    }
}

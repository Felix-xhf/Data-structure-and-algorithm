package 面试;

/*
 * @description:
 * @author: Felix_XHF
 * @create:2021-08-04 20:59
 */
public class Demo2 {
    public static void main(String[] args) {
        String s1 = new String("abc"); //创建了两个对象 "abc"常量对象，s1也是一个对象
        String s2 = "abc";  //创建了一个对象，就是s2
        //s1==s2 ? true or false
        System.out.println(s1==s2);   //false s1 和 s2的地址不一样


        String s3 = s1.intern();  //String对象的intern方法，首先会检查字符串常量池中是否存在“abc”，如果存在则返回该字符串引用，如果不存在，则把“abc”添加到常量池中，并返回该字符串的引用
        //s2==s3 ? true or false
        System.out.println(s2 == s3);  //true
    }
}

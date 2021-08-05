package leetcode.Double_pointer;

public class Main557 {
    public static String reverseWords(String s) {
        s = s+" ";
        char[] c = s.toCharArray();
        int start=0;
        for (int i = 0; i < c.length; i++) {
            if (c[i]!=' '){
                continue;
            }else {
                reverse(c,start,i-1);
                start = i+1;
            }
        }
        String res = new String(c);
        res = res.substring(0,res.length()-1);
        return res;
    }
    private static void reverse(char[] c ,int start,int end){
        char temp;
        while(start<end){
            temp =c[start];
            c[start] = c[end];
            c[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        String s = "Let's take LeetCode contest";
        String s1 = Main557.reverseWords(s);
        System.out.println(s1);
    }

}

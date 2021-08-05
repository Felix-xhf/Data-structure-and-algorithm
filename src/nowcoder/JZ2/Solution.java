package nowcoder.JZ2;

public class Solution {
    public static String replaceSpace (String s) {
        // write code here
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' '){
                sb.append("%20");
            }else{
                sb.append(s.charAt(i));
            }
        }
        return String.valueOf(sb);
    }

    public static void main(String[] args) {
        String s = "We Are Happy";
        System.out.println(replaceSpace(s));

    }
}

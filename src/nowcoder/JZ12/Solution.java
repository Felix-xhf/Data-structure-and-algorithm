package nowcoder.JZ12;

public class Solution {
    public static double Power(double base, int exponent) {
        if (exponent>0){
            double res = base;
            for (int i = 1; i < exponent; i++) {
                res = base*res;
            }
            return res;
        }
        if (exponent==0){
            return 1;
        }
        if (exponent<0){
            exponent = exponent* -1;
            base = 1/base;
            double res = base;
            for (int i = 1; i < exponent; i++) {
                res = base*res;
            }
            return res;
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(Power(2.0, 3));
    }
}

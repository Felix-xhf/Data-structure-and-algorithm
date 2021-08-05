package nowcoder.JZ8;

public class Solution {
    public int jumpFloor(int target) {
        if (target<=1){
            return 1;
        }
        return jumpFloor(target-1)+jumpFloor(target-2);
    }


    public static void main(String[] args) {
        Solution solution = new Solution();
        int i = solution.jumpFloor(7);
        System.out.println(i);
    }
}

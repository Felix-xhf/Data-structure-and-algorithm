package leetcode.dichotomy;

/*
* 第一个错误的版本
* */
public class Main278 {
    boolean isBadVersion(int version){
        return true;
    }
    public int firstBadVersion(int n) {
        int left=0;
        int right = n-1;
        int mid = left+(right-left)/2;
        while(left<=right){
            if(!isBadVersion(mid)){//说明之前的到这个地方的都是坏的
                left = mid+1;
                mid = left+(right-left)/2;
                continue;
            }else{//说明这个就是已经是坏了，并且之后的都是好的
                right = mid-1;
                mid = left+(right-left)/2;
            }
        }
        return mid;
    }
}

package ClimbingStairs;

public class Solution {

    public static int climbStairs(int n) {
        int [] a = new int[n];
        if(n<3)return n;
        a[0]=1;
        a[1]=2;
        for(int i =2;i<n;i++){
            a[i]=a[i-1]+a[i-2];
        }
        return a[n-1];
    }
    public static void main(String[] args) {
        System.out.println(climbStairs(3));
    }
}


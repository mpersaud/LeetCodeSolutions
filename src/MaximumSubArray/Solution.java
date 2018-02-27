package MaximumSubArray;
class Solution {
    public static int maxSubArray(int[] nums) {
        int max=0;
        int maxsoFar=0;

        for(int i =0; i<nums.length;i++){
            maxsoFar= maxsoFar+nums[i];
            if(maxsoFar<0) {
                maxsoFar = 0;
            }
            if(max<maxsoFar) {
                max = maxsoFar;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println(maxSubArray(new int[]{-2,1,-3,4,-1,2,1,-5,4}));
    }

}
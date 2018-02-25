package RemoveDuplicatesFromSortedArray;

class Solution {
    static public int removeDuplicates(int[] nums) {
        int dup =0;
        for(int i=1;i<nums.length;i++){
            if(nums[dup]!=nums[i]){
                dup++;
                nums[dup]=nums[i];
            }
        }
        return nums.length-dup+1;

    }

    public static void main(String[] args) {
        int[]a = new int[]{1,1,2,3,3,4,5,5,6};
        int i = removeDuplicates(a);
        for(int j=0;j<i;j++){
            System.out.print (a[j]+"");
        }
        System.out.println();
        System.out.println("len:"+i);
    }
}
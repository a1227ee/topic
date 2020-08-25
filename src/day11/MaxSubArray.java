package day11;

public class MaxSubArray {
    public int maxSubArray(int[] nums) {
        int[] sum=new int[nums.length];
        sum[0]=nums[0];
        int max=nums[0];
        for (int i=1;i<nums.length;i++) {
            sum[i]=Math.max(0,sum[i-1])+nums[i];
            max=Math.max(sum[i],max);
        }
        return max;
    }
}

package day10;

public class MaxSubArray {
    public int maxSubArray(int[] nums) {
        int res = nums[0];
        for (int i = 1; i < nums.length; i++) {
            nums[i]+=Math.max(nums[i-1],0);
            res=Math.max(res,nums[i]);
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println("23".compareTo("32"));
    }
}

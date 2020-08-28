package day14;

/**
 * @ClassName SearchRange
 * @Deacription: 34. 在排序数组中查找元素的第一个和最后一个位置
 * @Author zzx
 * @Date 2020/8/28 9:56
 **/

public class SearchRange {
    public int[] searchRange(int[] nums, int target) {
        int r = nums.length-1;
        int l=0;

        while (l <= r){
            int index=l+(r-l)/2;
            if (nums[index]==target) {
                l=index;r=index;
                while (l>=0 && nums[l]==target) l--;
                while (r<nums.length && nums[r]==target) r++;
                return new int[]{l++,r--};
            }

            if (nums[index]<target){
                l=index+1;
            }else{
                r=index-1;
            }
        }
        ThreadLocal<Object> objectThreadLocal = new ThreadLocal<>();

        return new int[]{-1,-1};
    }
}

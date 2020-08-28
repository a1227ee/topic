package day14;

/**
 * @ClassName Search
 * @Deacription:33. 搜索旋转排序数组
 * @Author zzx
 * @Date 2020/8/28 0:22
 **/

public class Search {
    public int search(int[] nums, int target) {
        int len = nums.length-1;
        int index=0;

        while (index<=len){
            int mid=(index+len)/2;
            if (nums[mid]==target) return mid;
            //说明这是升序 最左边到中间是升序
            if (nums[0]<=nums[mid]){
                if (nums[0] <= target && target<nums[mid]){
                    len=mid-1;
                }else{
                    index=mid+1;
                }
            }else{
                if (nums[mid] < target && target <= nums[nums.length-1]){
                    index=mid+1;
                }else{
                    len=mid-1;
                }

            }

        }
        return -1;

    }
}

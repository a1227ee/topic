package day06;

public class Exchange {
    public int[] exchange(int[] nums) {
        int len = nums.length-1;
        int i=0;
        while (i<len){
            while (i<len && (nums[i] & 1)==1){
                i++;
            }
            while (i<len && (nums[len] & 0)==0){
                len--;
            }
            swap(nums,i,len);
        }
        return nums;
    }
    public void swap(int[] nums,int j,int k){
        int temp = nums[j];
        nums[j]=nums[k];
        nums[k]=temp;
    }

    public static void main(String[] args) {
        System.out.println(11&1);
    }
}

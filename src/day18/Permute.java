package day18;

import java.util.ArrayList;
import java.util.List;

import static day14.QuickSort.swap;

/**
 * @ClassName Permute
 * @Deacription:
 * @Author zzx
 * @Date 2020/9/1 16:09
 **/

public class Permute {
    List<List<Integer>> ans=new ArrayList<List<Integer>>();
    public List<List<Integer>> permute(int[] nums) {
        process(0,nums,new ArrayList<Integer>());
        return ans;
    }
    public void process(int index,int[] nums,List<Integer> list){
        if (index==nums.length){
            ans.add(list);
            return;
        }
        for (int i=index;i<nums.length;i++){
            swap(nums,index,i);
            list.add(nums[index]);
            process(index+1,nums,list);
            list.remove(list.size()-1);
            swap(nums,index,i);
        }
    }
    public static void swap(int[] arr,int left,int right) {
        int temp = arr[left];
        arr[left]=arr[right];
        arr[right]=temp;
    }
}

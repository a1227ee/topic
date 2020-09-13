package day20;

/**
 * @ClassName quitSort
 * @Deacription:
 * @Author zzx
 * @Date 2020/9/4 10:44
 **/

public class quitSort {
    public void quickSort(int[] arr,int left,int right){
        if (left<right){
            swap(arr,left+(int)(Math.random()*(right-left+1)),right);
            int[] res = partition(arr, left, right);
            quickSort(arr,left,res[0]-1);
            quickSort(arr,res[1]+1,right);

        }

    }
    public int[] partition(int[] arr,int left,int right){
        int less=left-1;
        int more=right+1;
        int cur=left;
        int target=arr[right];
        while (cur<more){
            if (arr[cur]<target){
                swap(arr,++less,cur++);
            }else if (arr[cur]>target){
                swap(arr,cur,--more);
            }else{
                cur++;
            }
        }
        return new int[]{less+1,more-1};



    }
    public void swap(int[] arr,int l,int r){
        int temp=arr[l];
        arr[l]=arr[r];
        arr[r]=temp;
    }
}

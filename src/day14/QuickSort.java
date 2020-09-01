package day14;

import java.util.Arrays;
import java.util.Queue;
import java.util.Random;

/**
 * @ClassName QuickSort
 * @Deacription:
 * @Author zzx
 * @Date 2020/8/29 1:26
 **/

public class QuickSort {
//    public static void quickSort(int[] arr,int left,int right) {
//        if (left<right) {
//            swap(arr,left+ (int) (Math.random() * (right - left + 1)), right);
//            int[] res = partition(arr, left, right);
//
//            quickSort(arr, left, res[0] - 1);
//            quickSort(arr, res[1] + 1, right);
//        }
//    }
//    public static void  swap(int[] arr, int l,int r){
//        int temp = arr[l];
//        arr[l]=arr[r];
//        arr[r]=temp;
//    }
//
//    public static int[] partition(int[] arr,int l,int r){
//
//        int num=arr[r];
//        int less=l-1;
//        int more=r+1;
//        int cur=l;
//
//        while (cur<more){
//            if (num>arr[cur]){
//                swap(arr,cur++,++less);
//            }else if (num<arr[cur]){
//                swap(arr,cur,--more);
//            }else{
//                cur++;
//            }
//        }
//        return new int[]{less+1,more-1};
//    }

    public static void main(String[] args) {
        int[] arr = {9, 8, 7, 6, 5, 4, 3, 2, 1, 5, 6, 9, 8, 7, 4};

        quickSort(arr,0,arr.length-1);

        System.out.println(Arrays.toString(arr));
    }

    public static void quickSort(int[] arr,int left,int right) {
        if (left<right){
            swap(arr,left+(int)(Math.random()*(right-left+1)),right);
            int[] partition = partition(arr, left, right);
            quickSort(arr,left,partition[0]-1);
            quickSort(arr,partition[1]+1,right);
        }
    }
    public static int[] partition(int[] arr,int left,int right) {
        int num=arr[right];
        int less=left-1;
        int more=right+1;
        int cur=left;
        while (cur<more){
            if (num>arr[cur]){
                swap(arr,cur++,++less);
            }else if (num < arr[cur]){
                swap(arr,cur,--more);
            }else {
                cur++;
            }
        }
        return new int[]{less+1,more-1};


    }

    public static void swap(int[] arr,int left,int right) {
        int temp = arr[left];
        arr[left]=arr[right];
        arr[right]=temp;
    }
}

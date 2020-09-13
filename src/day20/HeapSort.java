package day20;

/**
 * @ClassName HeapSort
 * @Deacription:
 * @Author zzx
 * @Date 2020/9/4 23:33
 **/

public class HeapSort {
    public static void main(String[] args) {
        int[] arr = {16, 7, 3, 20, 17, 8};
        heapSort(arr);
        System.out.println(arr);
    }

    private static void heapSort(int[] arr) {
        //创建堆
        for (int i=(arr.length-1)/2;i>=0;i--){
            addHeap(arr,i,arr.length);
        }

        for (int i=arr.length-1;i>0;i--){
            int temp=arr[i];
            arr[i]=arr[0];
            arr[0]=temp;
            addHeap(arr,0,i);
        }
    }

    private static void addHeap(int[] arr, int parent, int length) {
        int temp=arr[parent];

        int lChild=2*parent+1;

        while (lChild<length){
            int rChild=lChild+1;
            if (rChild<length && arr[lChild]<arr[rChild])lChild++;

            if (temp>arr[lChild]){
                break;
            }
            arr[parent]=arr[lChild];
            parent=lChild;
            lChild=2*lChild+1;
        }
        arr[parent]=temp;
    }
}

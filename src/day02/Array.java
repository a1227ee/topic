package day02;

public class Array {
    public int minArray(int[] numbers) {
        int left = 0, right = numbers.length - 1;
        while (left < right) {
            int index=(left+right)/2;
            if (numbers[index]>numbers[right]){
                left=index+1;
            }else if(numbers[index]<numbers[right]){
                right=index;
            }else{
                right--;
            }
        }
        return numbers[left];
    }
}

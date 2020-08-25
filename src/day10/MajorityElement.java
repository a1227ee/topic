package day10;

public class MajorityElement {
    public int majorityElement(int[] nums) {
        int sum=1;int cur=nums[0];
        for (int num : nums) {
            if (cur==num)sum++;
            else {
                sum--;
                if (sum<1){
                    cur=num;
                    sum=1;
                }
            }
        }
        return cur;
    }
}

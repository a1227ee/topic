package day18;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName CombinationSum2
 * @Deacription:
 * @Author zzx
 * @Date 2020/9/1 15:17
 **/

public class CombinationSum2 {
    /**
     * 40 组合数字
     */
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        return null;
    }


    /**
     * 39 组合总数
     */
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        process1(0,candidates,target,new ArrayList<>());
        return ans;
    }
    List<List<Integer>> ans=new ArrayList<List<Integer>>();
    public void process1(int index,int[] candidates, int target,List<Integer> list){
        if (target<0){
            return;
        }
        if (target==0){
            ans.add(new ArrayList<>(list));
            return;
        }
        for (int i=index;i<candidates.length;i++){
            list.add(candidates[i]);
            process1(i,candidates,target-candidates[i],list);
            list.remove(list.size());
        }
    }
}

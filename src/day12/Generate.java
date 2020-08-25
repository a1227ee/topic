package day12;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Generate {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> lists = new ArrayList<List<Integer>>();

        for (int i=1;i<=numRows;i++){
            List<Integer> list = new ArrayList<Integer>();

            for (int j=0;j<i;j++){
                if (j==0 || j==i-1){
                    list.add(1);
                    continue;
                }
                List<Integer> temp = lists.get(i-2);
                list.add(temp.get(j)+temp.get(j-1));
            }
            lists.add(list);
        }
        return lists;
    }


    public static void main(String[] args) {
        System.out.println(111);
        Generate generate = new Generate();
        List<List<Integer>> generate1 = generate.generate(5);
        for (List<Integer> list : generate1) {
            System.out.println(list.toString());
        }
    }
}

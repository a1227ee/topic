package day08;

import java.util.Stack;

public class ValidateStackSequences {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        Stack<Integer> s1 = new Stack<>();
        int cur=0;
        for (int i = 0; i < pushed.length; i++) {
            s1.push(pushed[i]);

             while (!s1.isEmpty() && (s1.peek()==popped[cur])){
                s1.pop();
                cur++;
            }
        }
        if (!s1.isEmpty()) return false;
        return true;


    }

    public static void main(String[] args) {
        int[] s1= new int[]{1, 2, 3, 4, 5};
        int[] s2= new int[]{4,5,3,2,1};

        System.out.println(new ValidateStackSequences().validateStackSequences(s1, s2));
    }
}

package day03;

import jdk.nashorn.internal.ir.CallNode;

import java.util.LinkedList;
import java.util.Stack;

public class CQueue {
    Stack<Integer> s1;
    Stack<Integer> s2;
    public CQueue() {
        s1=new Stack<Integer>();
        s2=new Stack<Integer>();
    }

    public void appendTail(int value) {
        LinkedList<Integer> stack1 = new LinkedList<>();
        stack1.pop();
        s1.push(value);
    }

    public int deleteHead() {

        if (s2.isEmpty()) {
           while (!s1.isEmpty())
               s2.push(s1.pop());
        }
        return s2.isEmpty()?-1:s2.pop();
    }
}

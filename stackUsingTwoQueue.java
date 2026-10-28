import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

class MyStack {
    private Queue<Integer> st;
    private Queue<Integer> helper;

    public MyStack() {
        st = new LinkedList<>();
        helper = new LinkedList<>();
    }
    
    public void push(int val) {

        while (st.size() != 0) {

            helper.add(st.remove());

        }
        st.add(val);
        while (helper.size() != 0) {
            st.add(helper.remove());
        }

    }
    
    public void pop() {
        System.out.println(st.poll());
    }

    public int top() {
        return st.peek();
    }

    public boolean empty() {
        if (st.size() == 0) {
            return true;
        }
        return false;
    }
}


public class stackUsingTwoQueue {
    public static void main(String[] args) {
        MyStack me = new MyStack();
        me.push(10);
        me.push(20);
        me.push(2);
        me.push(30);
        me.pop();
        System.out.println(me.top());
        System.out.println(me.empty());
        me.pop();
        me.pop();
        me.pop();
        System.out.println(me.empty());
    }
    
}

import java.util.Stack;

class MyQueue {
    private Stack<Integer> st;
    private Stack<Integer> helper;

    public MyQueue() {
        st = new Stack<>();
        helper = new Stack<>();
    }
    
    public void push(int val) {
        while (st.size() != 0) {
            helper.add(st.pop());
        }
        st.add(val);
        while (helper.size() != 0) {
            st.add(helper.pop());
        }
    }
    
    public int pop() {
        return st.pop();
    }

    public int peek() {
        return st.peek();
    }

    public boolean empty() {
        if (st.size() == 0) {
            return true;
        }
        return false;
    }
}


public class queueUsingTwoStacks {
    public static void main(String[] args) {
        MyQueue me = new MyQueue();
        me.push(10);
        me.push(20);
        me.push(2);
        me.push(30);
        System.out.println(me.pop());
        System.out.println(me.peek());
        System.out.println(me.empty());
        System.out.println(me.pop());
        System.out.println(me.pop());
        System.out.println(me.pop());
        System.out.println(me.empty());
    }
}

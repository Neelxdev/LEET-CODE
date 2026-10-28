import java.util.Stack;

public class Minstack {
    private Stack<Integer> st;
    private Stack<Integer> min;
    public Minstack() { // CONSTRUCTOR
        st = new Stack<>();
        min = new Stack<>();
    }
    public static void main(String[] args) {
        Minstack mt = new Minstack();
        mt.push(-2);
        mt.push(0);
        mt.push(-3);
        System.out.println(mt.getMin());
        mt.pop();
        System.out.println("Peeked item: " + mt.top());
        System.out.println(mt.getMin());
        
    }


    public void push(int val) {
        if (st.size() == 0 || min.peek() >= val) {
            min.add(val);
        }
        st.add(val);
    }

    public void pop() {
        int ele1 = st.pop();
        if (ele1 == min.peek()) {
            min.pop();
        }
        System.out.println("Popped item: "+ ele1);
    }

    public int top() {
        return st.peek();
    }

    public int getMin() {
        return min.peek();
    }
}

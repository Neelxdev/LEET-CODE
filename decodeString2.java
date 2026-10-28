import java.util.Stack;

public class decodeString2 {
    public static void main(String[] args) {
        System.out.println(solution("3[a2[bc]]"));
        System.out.println(solution("2[abc]3[cd]ef"));
        System.out.println(solution("3[a]2[bc]"));
    }

    static String solution(String s) {
        Stack<Integer> numberStack = new Stack<>();
        Stack<String> st = new Stack<>();
        int num = 0;
        for (Character ch : s.toCharArray()) {
            if (Character.isDigit(ch)) {
                num = num * 10 + (ch - '0');

            } else if (ch.equals('[')) {
                numberStack.push(num);
                st.push("[");
                num = 0;
            } else if (ch.equals(']')) {
                String word = "";
                while (!st.peek().equals("[")) {
                    word = st.pop() + word;
                }
                st.pop();
                int count = numberStack.pop();
                st.push(word.repeat(count));
            } else {
                st.push(String.valueOf(ch));
            }
        }
        String ans = "";
        while (!st.isEmpty()) {
            ans = st.pop() + ans;
        }
        return ans;
    }
}

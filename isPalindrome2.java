public class isPalindrome2 {
    public static void main(String[] args) {
        int num = 121;
        System.out.println(solution(num));
    }
    
    static boolean solution(int num) {
        String newNum = String.valueOf(num);
        String reversed = new StringBuilder(newNum).reverse().toString();
        return newNum.equals(reversed);
    }
}

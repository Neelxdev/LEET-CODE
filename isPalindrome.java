public class isPalindrome {
    public static void main(String[] args) {
        int num = 121;
        System.out.println(solution(num));
    }
    
    static boolean solution(int num) {
        int org = num;
        int rev = 0;
        while (num != 0) {
            int rem = num % 10;
            rev = rev * 10 + rem;
            num /= 10;
        }
        return rev == org;
    }
}

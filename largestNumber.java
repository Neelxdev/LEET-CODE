
import java.util.Arrays;

public class largestNumber {
    public static void main(String[] args) {
        System.out.println(solution(new int[] {
            30,5,9,80,6,34,31,3
        }));
    }
    
    static String solution(int[] nums) {
        String[] num = new String[nums.length];
        for (int i = 0; i < nums.length; i++) {
            num[i] = nums[i] + "";

        }
        Arrays.sort(num, (s1, s2) -> (s2 + s1).compareTo(s1 + s2));
        if (num[0].equals("0")) {
            return "0";
        }
        String ans = "";
        for (String ch : num) {
            ans += ch;
        }
        
        return ans;
    }
}

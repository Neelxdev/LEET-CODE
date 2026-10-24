import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class arrayForm2 {
    public static void main(String[] args) {
        int[] nums = { 9, 5, 4 };
        int k = 128;
        System.out.println(solution(nums, k));
    }
    
    static List<Integer> solution(int[] nums, int k) {
        List<Integer> ans = new ArrayList<>();
        int i = nums.length - 1;
        int carry = 0;
        while (i >= 0 || k > 0) {
            int numval = 0;
            int rem = k % 10;
            if (i >= 0) {
                numval = nums[i];
            }
            int sum = numval + rem + carry;
            int digit = sum % 10;
            carry = sum / 10;
            ans.add(digit);
            i--;
            k /= 10;
        }
        if (carry != 0) {
            ans.add(carry);
        }
        Collections.reverse(ans);
        return ans;
    }
}

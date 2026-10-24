import java.util.Arrays;

public class productOfArrayExceptSelf2 {
    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 4 };
        System.out.println(Arrays.toString(solution(nums)));
    }
    
    static int[] solution(int[] nums) {
        int[] ans = new int[nums.length];
        ans[nums.length - 1] = 1;
        int suffix = 1;
        for (int i = nums.length - 2; i >= 0; i--) {
            ans[i] = suffix * nums[i+1];
            suffix = suffix * nums[i+1];
        }
        int prefix = 1;
        for (int i = 1; i < nums.length; i++) {
            prefix *= nums[i - 1];
            ans[i] *= prefix;

        }
        return ans;
    }
}

import java.util.Arrays;

public class productOfArrayExceptSelf {
    public static void main(String[] args) {
        int[] nums = { 1,2,3,4 };
        System.out.println(Arrays.toString(solution(nums)));
    }
    
    static int[] solution(int[] nums) {
        int ans[] = new int[nums.length];
        ans[0] = nums[0];
        int prefix = 1;
        for (int i = 1; i < nums.length; i++) {
            ans[i] = prefix * nums[i - 1];
            prefix *= nums[i - 1];

        }
        int suffix = 1;
        for (int i = nums.length - 1; i >= 0; i--) {
            ans[i] *= suffix;
            suffix = suffix * nums[i]; 
        }
        return ans;

    }
}

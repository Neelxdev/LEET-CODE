import java.util.Arrays;

public class squaresOfSortedArray2 {
    public static void main(String[] args) {
        int[] nums = { -8, -4, 0, 1, 2, 3, 13 };
        System.out.println(Arrays.toString(solution(nums)));
    }
    
    static int[] solution(int[] nums) {
        int[] ans = new int[nums.length];
        int i = ans.length - 1;
        int start = 0, end = nums.length - 1;
        while (start <= end) {
            int startVal = nums[start] * nums[start];
            int endVal = nums[end] * nums[end];

            if (startVal > endVal) {
                ans[i] = startVal;
                start++;
            } else {
                ans[i] = endVal;
                end--;
            }
            i--;
        }
        
        return ans;
    }
    
}
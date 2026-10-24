import java.util.Arrays;

public class twoSumII {
    public static void main(String[] args) {
        int[] nums = { -2,-1, 7, 9, 11 };
        int target = 8;
        System.out.println(Arrays.toString(solution(nums, target)));
    }

    static int[] solution(int[] nums, int target) {
        int start = 0, end = nums.length - 1;
        while (start <= end) {

            if (nums[start] + nums[end] == target) {
                return new int[] { start + 1, end + 1 };
            } else if (nums[start] + nums[end] < target) {
                start++;
            } else {
                end--;
            }
        }
        throw new IllegalArgumentException("No match found");
    }
}

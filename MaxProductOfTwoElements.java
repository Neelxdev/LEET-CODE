import java.util.Arrays;

public class MaxProductOfTwoElements {
    public static void main(String[] args) {
        int nums[] = { 3,4,5,2 };
        System.out.println(solution(nums));
    }
    
    static int solution(int[] nums) {
        Arrays.sort(nums);

        return (nums[nums.length-1] - 1) * (nums[nums.length-2] - 1);
    }
}

import java.sql.Array;
import java.util.Arrays;

public class squaresOfSortedArray {
    public static void main(String[] args) {
        int nums[] = { -4, -2, 0, 1, 2, 3, 4 };
        System.out.println(Arrays.toString(solution(nums)));
    }

    static int[] solution(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            nums[i] = nums[i] * nums[i];
        }
        Arrays.sort(nums);
        return nums;
    }
}

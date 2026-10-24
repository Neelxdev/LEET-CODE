import java.util.Arrays;

public class twoSum{

    static int[] solution(int[] nums, int target) {
        for (int i = 0; i < nums.length ; i++) {
            for (int j = i + 1; j < nums.length ; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return null;
    }



    public static void main(String[] args) {
        int num[] = { 2, 11, 7, -2 };
        int target = 9;
        System.out.println(Arrays.toString(solution(num, target)));
    }
}
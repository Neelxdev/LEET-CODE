import java.util.Arrays;

public class findingStartingAndEndingOfElement {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new int[] {
            5,7,7,8,8,10
        }, 8)));
    }
    
    static int[] solution(int[] nums, int target) {
        int[] ans = new int[nums.length];
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                ans[j] = i;
                j++;
            }
        }
        return Arrays.copyOf(ans, j);
        
    }
}
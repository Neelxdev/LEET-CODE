import java.util.ArrayList;
import java.util.Arrays;

public class findTargetIndices {
    public static void main(String[] args) {
        System.out.println((solution(new int[] {
            1,2,5,2,3
        }, 2)));
    }

    static ArrayList<Integer> solution(int[] nums, int target) {
        Arrays.sort(nums);
        ArrayList<Integer> ans = new ArrayList<>();
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                j++;
                ans.add(j);
            }
        }
        
        
        return ans;
    }
}

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class twoSum2 {
    public static void main(String[] args) {
        int nums[] = { 2, 6, 4, 7 };
        System.out.println(Arrays.toString(solution(nums, 9)));
    }
    
    static int[] solution(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int comp = target - nums[i];
            if (!map.containsKey(comp)) {
                map.put(nums[i], i);
            } else {
                return new int[] { map.get(comp), i };
            }
        }
        throw new IllegalArgumentException("No match");
    }
}

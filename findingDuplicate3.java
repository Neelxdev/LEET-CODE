public class findingDuplicate3 {
    public static void main(String[] args) {
        System.out.println(solution(new int[] {
                3, 1, 3, 4, 2
        }));
    }

    static int solution(int[] nums) {
        int ans = -1;
        for (int i = 0; i < nums.length; i++) {
            int j = Math.abs(nums[i]);
            if (nums[j] > 0) {
                nums[j] = -nums[j];
            } else {
                ans = nums[i];
                break;
            }
        }
        
        // Generating the original array
        for (int num : nums) {
            num = Math.abs(num);
        }

        return ans;
    }
}

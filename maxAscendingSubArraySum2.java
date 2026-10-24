public class maxAscendingSubArraySum2 {
    public static void main(String[] args) {
        System.out.println(solution(new int[] {
            10,20,30,5,10,50
        }));
    }
    
    static int solution(int[] nums) {
        int ans = -1;
        int max = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i - 1] < nums[i]) {
                max += nums[i];
            } else {
                ans = Math.max(ans, max);
                max = nums[i];
            }
        }
        ans = Math.max(ans, max);
        return ans;
    }
}

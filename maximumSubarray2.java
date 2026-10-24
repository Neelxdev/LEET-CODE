public class maximumSubarray2 {
    public static void main(String[] args) {
        System.out.println(solution(new int[] {
                1
        }));
    }

    static int solution(int[] nums) {
        int sum = nums[0], maxSum = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < sum + nums[i]) {
                sum += nums[i];
            } else {
                sum = nums[i];
            }
            maxSum = Math.max(sum, maxSum);
            
        }
        // maxSum = Math.max(sum, maxSum);
        return maxSum;
    }
}

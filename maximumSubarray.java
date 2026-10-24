public class maximumSubarray {
    public static void main(String[] args) {
        System.out.println(solution(new int[] {
            -2,1,-3,4,-1,2,1,-5,4
        }));
    }

    static int solution(int[] nums) {
        int maxSum = 0;
        for (int i = 0; i < nums.length; i++) {
            int sum = 0;
            for (int j = i; j < nums.length; j++) {
                sum += nums[j];
                maxSum = Math.max(maxSum, sum);
                
            }
        }
        return maxSum;
    }
}

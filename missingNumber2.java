public class missingNumber2 {
    public static void main(String[] args) {
        int[] nums = { 0, 1, 3 };
        System.out.println(solution(nums));
    }
    
    static int solution(int[] nums) {
        int n = nums.length;
        int sum = n * (n + 1) / 2;
        int arraySum = 0;
        for (int i = 0; i < n; i++) {
            arraySum += nums[i];
        }
        return sum - arraySum;
    }
}

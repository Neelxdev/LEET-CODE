public class MaxProductOfTwoElements2 {
    public static void main(String[] args) {
        int nums[] = { 3, 4, 5, 2 };
        System.out.println(solution(nums));
    }
    
    static int solution(int[] nums) {
        int max = 0, smax = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max) {
                smax = max;
                max = nums[i];
            } else if (nums[i] > smax) {
                smax = nums[i];
            }
        }
        
        return (max - 1) * (smax - 1);
    }
}

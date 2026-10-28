public class pivotIndex2 {
    public static void main(String[] args) {
        System.out.println(solution(new int[] {
                1, 7, 3, 6, 5, 6
        }));
    }

    static int solution(int[] nums) {
        int leftSum = 0, sum = 0;
        for (int num : nums) {
            sum += num;
        }
        for (int i = 0; i < nums.length; i++) {
            int rightSum = sum - leftSum - nums[i];
            if (leftSum == rightSum) {
                return i;
            }
            leftSum += nums[i];
        }
        return -1;
    }
}

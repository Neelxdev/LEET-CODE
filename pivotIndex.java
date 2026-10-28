public class pivotIndex {
    public static void main(String[] args) {
        System.out.println(solution(new int[] {
                1, 7, 3, 6, 5, 6
        }));
    }

    static int solution(int[] nums) {
        int i = 0, prefix = 0, suffix = 0;
        int[] leftSum = new int[nums.length];
        int[] rightSum = new int[nums.length];
        while (i < nums.length) {
            leftSum[i] = prefix;
            prefix += nums[i++];
        }
        while (i > 0) {
            rightSum[i-1] = suffix;
            suffix += nums[i - 1];
            i--;
        }
        
        for (int k = 0; k < nums.length; k++) {
            if (rightSum[k] == leftSum[k]) {
                return k;
            }
        }
        return -1;
        
    }
}

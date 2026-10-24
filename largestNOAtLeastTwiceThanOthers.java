public class largestNOAtLeastTwiceThanOthers {
    public static void main(String[] args) {
        int[] nums = { 3, 1, 0, 11, 5, 6 };
        System.out.println(solution(nums));
    }

    static int solution(int[] nums) {
        if (nums == null || nums.length == 0)
            return -1;
        if (nums.length == 1)
            return 0;

        int largest = 0;
        int slargest = -1;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > nums[largest]) {
                slargest = largest;
                largest = i;
            } else if (slargest == -1 || nums[i] > nums[slargest]) {
                slargest = i;
            }
        }

        if (nums[largest] >= 2 * nums[slargest]) {
            return largest;
        }

        return -1;
    }
}

public class maxCountOfNegativePositiveInteger2 {
    public static int[] nums = { -3, -2, -1, 0, 0, 2, 3 };

    public static void main(String[] args) {
        System.out.println(solution());
    }

    static int positiveNumberIndex(int[] nums) {
        int low = 0, high = nums.length - 1;
        int ans = nums.length;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (nums[mid] > 0) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }

    static int negativeNumberIndex(int[] nums) {
        int low = 0, high = nums.length - 1;
        int ans = nums.length;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (nums[mid] >= 0) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }

    static int solution() {
        int pi = positiveNumberIndex(nums);
        int ni = negativeNumberIndex(nums);

        int positiveNumbers = nums.length - pi;
        int negativeNumbers = ni;

        return Math.max(positiveNumbers, negativeNumbers);
    }
}

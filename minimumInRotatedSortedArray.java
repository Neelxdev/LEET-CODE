public class minimumInRotatedSortedArray {
    public static void main(String[] args) {
        System.out.println(solution(new int[] {
                4, 5, 6, 7, 0, 1, 2
        }));
    }

    static int solution(int[] nums) {
        int s = 0, e = nums.length - 1;
        while (s <= e) {
            int mid = s + (e - s) / 2;
            if (nums[mid] < nums[mid - 1]) {
                return nums[mid];
            } else if (nums[mid] > nums[mid + 1]) {
                return nums[mid + 1];
            } else if (nums[mid] >= nums[s]) {
                s = mid + 1;
            } else {
                e = mid - 1;
            }
        }
        return -1;
    }
}

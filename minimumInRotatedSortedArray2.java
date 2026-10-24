public class minimumInRotatedSortedArray2 {
    public static void main(String[] args) {
        System.out.println(solution(new int[] {
            4,5,6,7,0,1,2
        }));
    }

    static int solution(int[] nums) {
        int start = 0, end = nums.length - 1;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] > nums[end]) {
                start = mid + 1;
            } else {
                end = mid;
            }
        }
        return nums[start];
    }
}

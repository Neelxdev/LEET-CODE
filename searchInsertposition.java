public class searchInsertposition {
    public static void main(String[] args) {
        System.out.println(solution(new int[] {
            1,3,5,6
        }, 9));
    }

    static int solution(int[] nums, int target) {
        int low = 0, high = nums.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (target > nums[mid]) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }

        }
        
            return low;
        
       
    }
    
}

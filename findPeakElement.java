public class findPeakElement {
    public static void main(String[] args) {
        System.out.println(solution(new int[] {
            1,2,1,3,5,6,4
        }));
    }
    
    static int solution(int[] nums) {
        if(nums.length == 1){
            return 0;
        }else if(nums[0] > nums[1]){
            return 0;
        } else if (nums[nums.length - 1] > nums[nums.length - 2]) {
            return nums.length - 1;
        } else {
            
            int low = 0, high = nums.length - 1;
            while (low < high) {
                int mid = low + (high - low) / 2;
            if (nums[mid] > nums[mid - 1] && nums[mid] > nums[mid + 1]) {
                return mid;
            } else if (nums[mid] < nums[mid + 1]) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
            
        }
        return -1;
    }
}

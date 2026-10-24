public class singleElementSortedArray {
    public static void main(String[] args) {
        System.out.println(solution(new int[] {
            3,3,5,5,8,8
        }));
    }
    
    static int solution(int[] nums) {
        int s = 1, e = nums.length - 2;
        
        if (nums[0] != nums[1]) {
            return nums[0];
        }
        if (nums[nums.length - 1] != nums[nums.length - 2]) {
            return nums[nums.length - 1];
        }

        while (s <= e) {
            int mid = s + (e - s) / 2;
            if (nums[mid + 1] != nums[mid] && nums[mid - 1] != nums[mid]) {
                return nums[mid];
            } else if ((mid % 2 != 0 && nums[mid] == nums[mid + 1]) || (mid % 2 == 0 && nums[mid] == nums[mid - 1])) {
                e = mid - 1;
            } else {
                s = mid + 1;
            }
        }
        throw new IllegalArgumentException("Not found");
    }
}

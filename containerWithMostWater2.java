public class containerWithMostWater2 {
    public static void main(String[] args) {
        int[] height = { 1, 9, 6, 2, 5, 4,  3, 9, 7 };
        System.out.println(solution(height));
    }
    
    static int solution(int[] nums) {
        int area = 0;
        int low = 0, high = nums.length - 1;
        while (low < high) {
            int a = (high - low) * Math.min(nums[low], nums[high]);
            if (a > area) {
                area = a;
            }
            if (nums[low] < nums[high]) {
                low++;
            } else {
                high--;
            }

        }
        return area;
    }
}

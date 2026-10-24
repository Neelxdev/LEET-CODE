public class containerWithMostWater {
    public static void main(String[] args) {
        int[] height = { 1, 8, 6, 2, 5, 4, 8, 3, 7 };
        System.out.println(solution(height));
        // int[] nums = { 1, 1 };
        // System.out.println(solution(nums));
    }
    
    static int solution(int[] nums) {
        int area = 0;
        for (int i = 0; i < nums.length-1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                int a = Math.min(nums[i], nums[j]) * (j - i);
                if (a > area) {
                    area = a;
                }
            }
        }
        return area;
    }
}

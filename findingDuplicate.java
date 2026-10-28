public class findingDuplicate {
    public static void main(String[] args) {
        System.out.println(solution(new int[] {
            3,1,3,4,2
        }));
    }

    static int solution(int[] nums) {
    
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] == nums[i]) {
                    return nums[j];
                }
            }
        }
        throw new IllegalArgumentException("NOT FOUND");
    }
}

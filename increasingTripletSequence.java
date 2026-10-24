public class increasingTripletSequence {
    public static void main(String[] args) {
        System.out.println(solution(new int[] {
            5,4,3,2,1
        }));
    }
    
    static boolean solution(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    if (nums[i] < nums[j] && nums[j] < nums[k]) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}

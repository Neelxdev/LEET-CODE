public class increasingTripletSequence2 {
    public static void main(String[] args) {
        System.out.println(solution(new int[] {
            20,100,10,12,5,13  
        }));
    }
    
    static boolean solution(int[] nums) {
        int first = Integer.MAX_VALUE;
        int second = Integer.MAX_VALUE;
        int third = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < first) {
                first = nums[i];
            } else if (nums[i] < second) {
                second = nums[i];
            } else {
                third = nums[i];
                return true;
            }
        }
        return false;
    }
}

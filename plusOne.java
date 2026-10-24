import java.util.Arrays;

public class plusOne {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new int[] {
            9,9,9
        })));
    }

    static int[] solution(int[] nums) {
        int i = nums.length - 1;
        int sum = nums[i] + 1;
        nums[i] = sum % 10;
        int carry = sum/10;

        
        while (i > 0 && carry != 0) {

            --i;
            int carrySum = nums[i] + carry;
            int digit = carrySum % 10;
            carry = carrySum / 10;
            nums[i] = digit;

        }
        if (carry != 0) {
            int[] result = new int[nums.length + 1];
            result[0] = carry;
            return result;
        }
        
        return nums;
    }
}

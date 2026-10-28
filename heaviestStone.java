
import java.util.Arrays;

public class heaviestStone {
    public static void main(String[] args) {
        System.out.println((solution(new int[] {
            2,7,4,1,8,1
        })));
    }

    static int solution(int[] nums) {

        int n = nums.length;
        while (n > 2) {
            Arrays.sort(nums);
            int max = nums[n - 1];
            int smax = nums[n - 2];
            if (max == smax) {
                n = n - 2;
            } else {
                nums[n - 2] = max-smax;
                n = n - 1;
            }
        }
        
        return n == 1 ? nums[0] : 0;
    }
}

import java.util.Arrays;
// DUTCH NATIONAL FLAG ALGORITHM
public class sortColorsInPlace {
    public static void main(String[] args) {
        System.err.println(Arrays.toString(solution(new int[] {
            2,0,2,1,1,0
        })));
    }
    
    static int[] solution(int[] nums) {
        int l = 0, m = 0, h = nums.length - 1;
        while (m < h) {
            if (nums[m] == 0) {
                
                int temp = nums[m];
                nums[m] = nums[l];
                nums[l] = temp;        
             
                
                l++;
                m++;
            } else if (nums[m] == 1) {
                m++;
            } else  {
                int temp = nums[m];
                nums[m] = nums[h];
                nums[h] = temp;

                h--;
            }
        }
        
        return nums;
    }
}

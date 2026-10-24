import java.util.Arrays;

public class arrayForm {
    public static void main(String[] args) {
        int nums[] = { 2, 1, 5};
        int k = 806;
        System.out.println(Arrays.toString(solution(nums, k)));
    }
    
    static int[] solution(int nums[], int k) {
        int num = 0;
        for (int i = 0; i < nums.length; i++) {
            num = num * 10 + nums[i];
        }
        int newNum = num + k;
        String numString = String.valueOf(newNum);
        int[] arr = new int[numString.length()];
        for (int i = 0; i < numString.length(); i++) {
            arr[i] = numString.charAt(i) - '0';
        }
        return arr;      
    }
}

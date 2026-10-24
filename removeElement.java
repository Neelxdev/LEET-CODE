public class removeElement {
    public static void main(String[] args) {
        int[] nums = { 0, 1, 2, 2, 3, 0, 4, 2 };
        int k = 2;
        System.out.println(solution(nums, k));
    }

    static int solution(int[] nums, int k) {
        int i = 0;
        int j = 0;
        while (i < nums.length) {
            if (nums[i] != k) {
                nums[j] = k;
                j++;
            }
            i++;

        }
        return j;
    }
}

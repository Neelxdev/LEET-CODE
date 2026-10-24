public class averageExcludingMinMax {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{
            4000,2000,1000,3000
        }));
    }

    static double solution(int[] nums) {
        int max = -1;
        int min = Integer.MAX_VALUE;
        int sum = 0;
        for (int num : nums) {
            sum += num;
            max = Math.max(max, num);
            min = Math.min(min, num);
        }
        return (sum - max - min) / (nums.length - 2);
    }
}

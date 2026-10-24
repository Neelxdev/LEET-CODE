public class maxCountOfNegativePositiveInteger {
    public static void main(String[] args) {
        System.out.println(solution(new int[] {
            -3,-2,-1,0,0,1,2
        }));
    }

    static int solution(int[] nums) {
        // int maxCount = 0;
        int pcount = 0, ncount = 0;
        for (int num : nums) {
            if (num > 0) {
                pcount++;
            } else if (num < 0) {
                ncount++;
            }
        }
        return Math.max(ncount, pcount);
    }

}

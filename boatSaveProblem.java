import java.util.Arrays;

public class boatSaveProblem {

    public static void main(String[] args) {
        System.out.println(solution(new int[] {
            3,5,4,3
        }, 5));
    }

    static int solution(int[] weights, int limit) {
        int count = 0;
        Arrays.sort(weights);
        int low = 0, high = weights.length - 1;
        while (low <= high) {
            if (weights[low] + weights[high] > limit) {
                high--;
            } else {
                low++;
                high--;
            }
            count++;
        }
        return count;
    }
}
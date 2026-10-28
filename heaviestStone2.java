import java.util.Collections;
import java.util.PriorityQueue;

public class heaviestStone2 {
    public static void main(String[] args) {
        System.out.println((solution(new int[] {
                8,6,7,3
        })));
    }

    static int solution(int[] nums) {
        PriorityQueue<Integer> weights = new PriorityQueue<>(Collections.reverseOrder());
        for (int num : nums) {
            weights.add(num);
        }

        while (weights.size() > 1) {
            int max = weights.remove();
            int smax = weights.remove();
            if (max == smax) {
                weights.add(0);
            } else {
                int newWeight = max - smax;
                weights.add(newWeight);
            }
        }
        return weights.size() == 0 ? 0 : weights.remove();

    }
}

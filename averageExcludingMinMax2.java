
import java.util.PriorityQueue;

public class averageExcludingMinMax2 {
    public static void main(String[] args) {
        System.out.println(solution(new int[] {
            4000,1000,2000,3000
        }));
    }

    static int solution(int[] nums) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int num : nums) {
            pq.add(num);
        }
        pq.remove();

        int ans = 0;
        int count = 0;
        while (pq.size() > 1) {

            ans += pq.remove();
            
            count++;
        }
        return ans / count;
    }
}

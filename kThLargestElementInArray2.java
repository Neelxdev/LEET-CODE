
import java.util.PriorityQueue;

public class kThLargestElementInArray2 {
    public static void main(String[] args) {
        System.out.println(solution(new int[] {
                6, 7, 3, 0, 1, 2, 9, 5, 4
        }, 3));
    }
    
    static int solution(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int i = 0;
        while (i < nums.length) {
            if (pq.size() < k) {
                pq.add(nums[i]);
            } else if (pq.peek() < nums[i]) {
                pq.remove();
                pq.add(nums[i]);
            }

            i++;
        }
        return pq.peek();
    }
}

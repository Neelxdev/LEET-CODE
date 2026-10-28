import java.util.HashMap;

public class longestconsecutiveSequence {
    public static void main(String[] args) {
        System.out.println(solution(new int[] {
            5,100,1,200,3,4,2
        }));
    }

    static int solution(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, 0);
        }
        for (int key : map.keySet()) {
            if (!map.containsKey(key - 1)) {
                map.replace(key, 1);
            }
        }
        int max = 0;
        for (int key : map.keySet()) {
            int k = 1;
            if (map.get(key) == 1) {
                while (map.containsKey(key + k)) {
                    k++;
                }
            }
            max = Math.max(max, k);
        }
        return max;
    }
}

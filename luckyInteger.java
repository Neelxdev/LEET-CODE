
import java.util.HashMap;

public class luckyInteger {
    public static void main(String[] args) {
        System.out.println((solution(new int[] {
            2, 2,3, 3, 3
        })));
    }

    static int solution(int[] nums) {
        int ans = -1;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            if (map.containsKey(num)) {
                map.put(num, map.get(num) + 1);
            } else {
                map.put(num, 1);
            }
        }
        for (Integer key : map.keySet()) {
            if (key.equals(map.get(key))) {
                ans = Math.max(ans, key);
            } 
            
        }
        return ans;
    }
}

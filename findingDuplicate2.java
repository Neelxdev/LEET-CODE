import java.util.HashMap;
import java.util.Map;

public class findingDuplicate2 {
    public static void main(String[] args) {
        System.out.println(solution(new int[] {
                3, 1, 3, 4, 2
        }));
    }

    static int solution(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            if (!map.containsKey(num)) {
                map.put(num, 1);
            } else {
                map.replace(num, map.get(num) + 1);
            }
        }
        // map.forEach((key, value)->{
        //     if (value > 1) {
        //         System.out.println(key);;
        //     }
        // });
        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            if(entry.getValue() > 1){
                return entry.getKey();
            }
        }
        return -1;
    }
}

import java.util.ArrayList;

public class findTargetIndices2 {
    public static void main(String[] args) {
        System.out.println((solution(new int[] {
                1, 2, 5, 2, 3
        }, 2)));
    }

    static ArrayList<Integer> solution(int[] nums, int target) {
        ArrayList<Integer> ans = new ArrayList<>();
        int count = 0;
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            
                
                if (nums[i] == target) {
                    count++;
                } else if(target>nums[i]){
                    index++;
                }
            
        }
        while (count > 0) {
            ans.add(index);
            count--;
            index++;
        }
        return ans;
    }
}

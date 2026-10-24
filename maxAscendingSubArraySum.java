
import java.util.ArrayList;
import java.util.Collections;

public class maxAscendingSubArraySum{
    public static void main(String[] args){
        System.out.println(solution(new int[]{
            10,20,30,5,10,50
        }));
    }

    static int solution(int[] nums){
        ArrayList<Integer> ans = new ArrayList<>();
        int s = nums[0];
        
        for(int i = 1; i<nums.length; i++){
            if(nums[i-1]<nums[i]){
                s +=  nums[i];
                ans.add(s);
            } else {
                s = nums[i];
            }
        }
        return Collections.max(ans);
    }
}
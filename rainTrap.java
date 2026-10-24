
public class rainTrap {

    public static void main(String[] args) {
        System.out.println((solution(new int[] {
            0,1,0,2,1,0,1,3,2,1,2,1
        })));
    }
    
    static int solution(int[] height) {
        int n = height.length;
        int[] low = new int[n], high = new int[n];
        low[0] = height[0];
        high[n - 1] = height[n - 1];
        int ans = 0;
        for (int i = 1; i < height.length; i++) {
            low[i] = Math.max(low[i-1], height[i]);
        }
        for (int i = n - 2; i >= 0; i--) {
            high[i] = Math.max(height[i], high[i+1]);
        }
        
        for (int i = 0; i < n - 1; i++) {
            ans += Math.min(low[i], high[i]) - height[i];
        }
        return ans;
    }
}
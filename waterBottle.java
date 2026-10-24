public class waterBottle {
    public static void main(String[] args) {
        System.out.println(solution(-50,4));
    }

    static int solution(int n, int numExchange) {
        if (numExchange <= 0 || n<0) {
            throw new IllegalArgumentException("Enter valid number");
        }
                
        if (n < numExchange) {
            return n;
        }
        int ans = n;

        while (n >= numExchange) {
            int newbottle = n / numExchange;
            int remBottle = n % numExchange;

            ans += newbottle;
            n = newbottle + remBottle;
        }
        return ans;
        
    }
}

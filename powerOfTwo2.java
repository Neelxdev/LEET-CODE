public class powerOfTwo2 {
    public static void main(String[] args) {
        int num = 31;
        System.out.println(solution(num));
    }
    
    static boolean solution(int n) {
        return n > 0 && (n & (n - 1)) == 0; 
    }
}

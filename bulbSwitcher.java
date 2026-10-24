public class bulbSwitcher {
    public static void main(String[] args) {
        int n = 10;
        System.out.println(solution(n));
    }
    
    static int solution(int n) {
        return (int)Math.floor(Math.sqrt(n));
    }
}

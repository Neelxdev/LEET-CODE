public class powerOfTwo {
    public static void main(String[] args) {
        int num = 31;
        System.out.println(solution(num));
    }

    static boolean solution(int x) {
        if (x < 0) {
            return false;
        }

        while (x % 2 == 0) {
            x /= 2;
        }
        return x == 1;
    }
}

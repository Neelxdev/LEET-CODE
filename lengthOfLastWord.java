public class lengthOfLastWord {
    public static void main(String[] args) {
        System.out.println(solution("Hello World 76"));
    }

    static int solution(String str) {
        int i = str.length()-1;
        int count = 0;
        while (i>=0 && str.charAt(i) != ' ') {
            count++;
            i--;
        }
        return count;
    }
}

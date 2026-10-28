public class reverseString2 {
    public static void main(String[] args) {
        String str = "a good  example";
        System.out.println((solution(str)));
    }

    static String solution(String s) {
        String[] words = s.split("\\s+");
        StringBuilder sb = new StringBuilder("");
        for (int i = words.length - 1; i >= 0; i--) {
            sb.append(words[i] + " ");
        }
        String result = sb.toString().strip();
        return result;
    }
}

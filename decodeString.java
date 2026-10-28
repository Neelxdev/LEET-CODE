public class decodeString {
    public static void main(String[] args) {
        System.out.println(solution("2[abc]3[cd]ef"));
        
    }
    // This solution does not work for all cases. See the second one
    static String solution(String s) {
        int i = 0;
        StringBuilder sb = new StringBuilder();
        char[] chars = s.toCharArray();
        int count = 0;
        while (i < chars.length) {
            if (chars[i] != '[' && chars[i] != ']') {
                count = Integer.parseInt(String.valueOf(chars[i]));
                i++;
            } else if (chars[i] == '[') {
                String word = "";
                while (chars[i + 1] != ']') {
                    i++;
                    word = chars[i] + "";
                }
                while (count > 0) {
                    sb.append(word);
                    count--;
                }
                i++;
            } else {
                i++;
            }

        }
        return sb.toString();
        
    }
}

public class reverseString {
    public static void main(String[] args) {
        String str = "a good  example";
        System.out.println((solution(str)));
    }

    static String solution(String s) {
        String str = s.strip();
        int i = 0;
        String word = "", reversed= "";
        while (i < str.length()) {
            if (str.charAt(i) != ' ') {
                word += str.charAt(i);
                
            } else {

                reversed = word + " " + reversed;
                reversed = reversed.strip();
                word = "";
            }
            i++;
            
        }
        reversed= word+" "+reversed;
                
        return reversed.strip();
    }
}

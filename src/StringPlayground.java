public class StringPlayground {
    public static void main(String[] args) {
        System.out.println(parenthesisBalance("({3 * 7] * [2 / 2)", 0));
    }

    public static String parenthesisBalance(String s, int count) {
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(' || c == '[' || c == '{') { count++; }
            else if (c == ')' || c == ']' || c == '}') { count--; }
        }
        return Integer.toString(count);
    }
}
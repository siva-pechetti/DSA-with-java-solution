package Stack_Queue;

import java.util.Stack;

public class InfixToPrefix {


    public static String infixToPrefix(String s) {
        Stack<Character> st = new Stack<>();
        String ans = "";

        s = reverse(s);

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch == '(') {
                s = s.substring(0, i) + ')' + s.substring(i + 1);
            }
            else if (ch == ')') {
                s = s.substring(0, i) + '(' + s.substring(i + 1);
            }
        }

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (Character.isLetterOrDigit(ch)) {
                ans += ch;
            }
            else if (ch == '(') {
                st.push(ch);
            }
            else if (ch == ')') {
                while (!st.empty() && st.peek() != '(') {
                    ans += st.pop();
                }
                st.pop();
            }
            else {
                while (!st.empty()
                        && st.peek() != '('
                        && precedence(st.peek()) >= precedence(ch)) {
                    ans += st.pop();
                }

                st.push(ch);
            }
        }

        while (!st.empty()) {
            ans += st.pop();
        }

        return reverse(ans);
    }

    public static String reverse(String s) {
        return new StringBuilder(s).reverse().toString();
    }

    public static int precedence(char ch) {
        if (ch == '^') {
            return 3;
        }
        else if (ch == '*' || ch == '/') {
            return 2;
        }
        else if (ch == '+' || ch == '-') {
            return 1;
        }

        return -1;
    }

    public static void main(String[] args) {
        String s = "A+B*(C-D)";

        System.out.println(infixToPrefix(s));
    }
}
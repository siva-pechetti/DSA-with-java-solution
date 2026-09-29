package Stack_Queue;

import java.util.Stack;

public class InfixToPostfix {


    public static String infixToPostfix(String s) {
        Stack<Character> st = new Stack<>();
        String ans = "";

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
                while (!st.empty() && precedence(st.peek()) >= precedence(ch)) {
                    ans += st.pop();
                }
                st.push(ch);
            }
        }

        while (!st.empty()) {
            ans += st.pop();
        }

        return ans;
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

        String result = infixToPostfix(s);

        System.out.println("Infix:   " + s);
        System.out.println("Postfix: " + result);
    }
}
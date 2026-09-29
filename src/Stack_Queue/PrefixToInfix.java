package Stack_Queue;

import java.util.Stack;

public class PrefixToInfix {

    public String prefixToInfix(String s) {
        Stack<String> st = new Stack<>();

        int i = s.length() - 1;

        while (i >= 0) {
            if (Character.isLetterOrDigit(s.charAt(i))) {
                st.push(String.valueOf(s.charAt(i)));
            } else {
                String t1 = st.pop();
                String t2 = st.pop();

                String ans = "(" + t1 + s.charAt(i) + t2 + ")";

                st.push(ans);
            }

            i--;
        }

        return st.peek();
    }
}
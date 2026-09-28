package Leetcode_Stack_Queues;

import java.util.Stack;

public class PostfixToInfix {

    public int evalRPN(String[] tokens) {
        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < tokens.length; i++) {

            if (!tokens[i].equals("+") &&
                    !tokens[i].equals("-") &&
                    !tokens[i].equals("*") &&
                    !tokens[i].equals("/")) {

                st.push(Integer.parseInt(tokens[i]));
            } else {
                int t2 = st.pop();
                int t1 = st.pop();

                int ans = 0;

                if (tokens[i].equals("+")) {
                    ans = t1 + t2;
                } else if (tokens[i].equals("-")) {
                    ans = t1 - t2;
                } else if (tokens[i].equals("*")) {
                    ans = t1 * t2;
                } else {
                    ans = t1 / t2;
                }

                st.push(ans);
            }
        }

        return st.peek();
    }
}
import java.util.*;

public class longestvalidparenthesis {

    public static int longestValidParentheses(String s) {

        Stack<Integer> st = new Stack();
        st.push(-1);
        int max = 0;

        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) == '(') {
                st.push(i);
                continue;
            }

            st.pop();

            if (st.isEmpty()) {
                st.push(i);
            }

            else {
                max = Math.max(max, i - (st.peek()));
            }
        }
        return max;
    }

    public static void main(String[] args) {
        String s = "(()";
        System.out.println(longestValidParentheses(s));
    }
}

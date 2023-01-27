import java.util.*;

public class peopleinaqueue {

    public static int[] canSeePersonsCount(int[] heights) {
        int n = heights.length;
        Stack<Integer> st = new Stack();
        int[] ans = new int[n];

        for (int i = 0; i < n; i++) {

            while (!st.empty() && heights[i] > heights[st.peek()]) {
                ans[st.peek()]++;
                st.pop();
            }
            if (!st.empty()) {
                ans[st.peek()]++;
            }
            st.push(i);
        }

        return ans;
    }

    public static void main(String[] args) {
        int heights[] = { 10, 6, 8, 5, 11, 9 };
        System.out.println(canSeePersonsCount(heights));

    }
}

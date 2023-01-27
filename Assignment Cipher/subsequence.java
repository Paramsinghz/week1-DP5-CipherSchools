package Strings;

public class subsequence {
    static boolean subsequence(String s1, String s2) {

        int s1_ptr = 0;
        int s2_ptr = 0;

        while (s2_ptr <= s1_ptr) {

            if (s1.charAt(s1_ptr) == s2.charAt(s2_ptr)) {

                s1_ptr++;
                s2_ptr++;
                if (s2_ptr == s2.length() - 1) {
                    return true;
                }

            }
            if (s1.charAt(s1_ptr) != s2.charAt(s2_ptr)) {
                s1_ptr++;
            }
            if (s1_ptr == s1.length() - 1) {
                break;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        String s1 = "abcde";
        String s2 = "aed";
        System.out.println(subsequence(s1, s2));
    }

}

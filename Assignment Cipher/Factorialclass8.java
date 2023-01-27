
public class Factorialclass8 {

    public static int fact(int n) {

        if (n == 1 || n == 0) {
            return 1;
        }

        int recans = fact(n - 1);
        int bigprobans = recans * n;

        return bigprobans;

    }

    public static int factusingtailcall(int number, int ans) {
        if (number == 1)
            return ans;

        return factusingtailcall(number - 1, ans * number);
    }

    public static void main(String[] args) {
        System.out.println(fact(5));
        System.out.println(factusingtailcall(5, 1));
    }

}

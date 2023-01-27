
public class powxn {

    static double pow(double base, int power) {

        double ans = base;

        if (power == 0) {
            return 1;
        }
        if (power == 1) {
            return ans;
        }

        ans = pow(ans, power / 2);
        ans = ans * ans;

        if (power % 2 != 0) {
            ans = ans * base;
        }
        return ans;
    }

    public double myPow(double x, int n) {

        if (n < 0) {
            return 1 / pow(x, n);
        }
        return pow(x, n);
    }

    public static void main(String[] args) {
        double base = 2.00;
        int powe = 10;
        System.out.println(pow(base, powe));
    }

}

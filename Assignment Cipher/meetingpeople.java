
public class meetingpeople {
    static boolean isMeet(int p1, int p2, int s1, int s2) {
        if (p1 > p2 && s1 > s2) {
            return false;
        }
        if (p2 > p1 && s2 > s1) {
            return false;
        }

        int distancecover = Math.abs(p1 - p2);
        int speedcover = Math.abs(s1 - s2);

        if (distancecover % speedcover == 0) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int p1 = 3;
        int p2 = 5;
        int s1 = 2;
        int s2 = 7;

        boolean res = isMeet(p1, p2, s1, s2);

        if (res) {
            System.out.println("They Meet");
        } else {
            System.out.println("They Do Not Meet");
        }
    }
}

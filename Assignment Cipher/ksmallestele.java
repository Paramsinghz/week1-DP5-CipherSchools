
public class ksmallestele {

    public static void kelement(int arr[], int k) {

        for (int i = k; i < arr.length; i++) {
            int currele = arr[i];

            int max = arr[k - 1];
            int maxindex = k - 1;
            for (int revindex = k - 2; revindex >= 0; revindex--) {
                if (arr[revindex] > max) {

                    max = arr[revindex];
                    maxindex = revindex;
                }
            }

            if (currele < max) {
                while (maxindex < k - 1) {
                    arr[maxindex] = arr[maxindex + 1];
                    maxindex++;
                }
                arr[k - 1] = currele;

            }
        }
        for (int i = 0; i < k; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int arr[] = { 50, 25, 100, 200, 30 };
        kelement(arr, 2);
    }
}

public class trappingrain {

    static int trapped(int arr[], int n) {
        int min[] = new int[n];
        int max[] = new int[n];
        int water = 0;
        min[0] = arr[0];
        max[n - 1] = arr[n - 1];

        for (int i = 1; i < n - 1; i++) {

            min[i] = Math.max(min[i - 1], arr[i]);
        }
        for (int i = n - 2; i > 0; i--) {

            max[i] = Math.max(max[i + 1], arr[i]);
        }

        for (int i = 1; i < n - 1; i++) {

            water = water + (Math.min(min[i], max[i]) - arr[i]);

        }
        return water;
    }

    public static void main(String[] args) {

        int arr[] = { 0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1 }, n = arr.length;
        System.out.println(trapped(arr, n));
    }
}

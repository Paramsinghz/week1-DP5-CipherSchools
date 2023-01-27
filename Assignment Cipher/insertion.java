package Sorting;

public class insertion {

    static boolean compare(int a, int b) {

        return a < b;
    }

    static void insertionsort(int arr[], int n) {
        for (int i = 1; i < n; i++) {

            int key = arr[i];
            int curr;
            for (curr = i - 1; curr >= 0; curr--) {
                if (compare(key, arr[curr])) {
                    arr[curr + 1] = arr[curr];
                } else {
                    break;
                }

            }

            arr[curr + 1] = key;

        }
        for (int j = 0; j < n; j++) {

            System.out.println(arr[j]);
        }

    }

    public static void main(String[] args) {

        int arr[] = { 10, 2, 30, 4, 50, 60, 70, 80, 90 };
        insertionsort(arr, arr.length);
    }
}

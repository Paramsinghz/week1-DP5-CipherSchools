class slidingwindow {

    static int slide(int arr[], int k) {

        int res = arr[0];

        for (int i = 1; i < k; i++) {
            res += arr[i];
        }
        int max = res;
        for (int i = k; i < arr.length; i++) {

            res += (arr[i] - arr[i - k]);
            max = Math.max(max, res);

        }

        return max;
    }

    public static void main(String args[]) {

        int arr[] = { 1, 8, 30, -5, 20, 7 }, k = 3;
        System.out.println(slide(arr, k));
    }
}
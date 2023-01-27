class stock {

    static void buy(int arr[], int n, int profit, int max) {

        for (int i = n - 1; i >= 1; i--) {

            if (arr[i] <= arr[i - 1]) {

                profit = profit + (max - arr[i]);
                max = arr[i - 1];

            }
            if (i == 1 && arr[1] > arr[0]) {
                profit += max - arr[0];
            }

        }

        System.out.println(profit);
    }

    public static void main(String args[]) {

        int arr[] = { 1, 1, 1 }, n = 3, profit = 0, max = arr[n - 1];
        buy(arr, n, profit, max);
    }
}
class readingbookmin {

    static int pages(int arr[], int n, int k) {

        int low = 0;
        int high = 0;
        int res = 0;
        int ans = -1;
        for (int i = 0; i < n; i++) {
            high += arr[i];
            low = Math.min(res, arr[i]);
        }

        while (low <= high) {
            int mid = low + ((high - low) / 2);

            if (isfeasible(arr, n, k, mid) == true) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }

    static boolean isfeasible(int arr[], int n, int k, int mid) {
        int sum = 0;
        int student = 1;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
            if (sum > mid) {
                student++;
                sum = arr[i];
            }
            if (student > k) {
                return false;
            }

        }
        return true;
    }

    public static void main(String args[]) {
        int arr[] = { 10, 20, 10, 30 }, n = 4, k = 2;
        System.out.println(pages(arr, n, k));
    }
}
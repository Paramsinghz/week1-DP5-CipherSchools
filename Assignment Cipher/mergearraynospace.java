
public class mergearraynospace {

    public static void merge(int[] nums1, int m, int[] nums2, int n) {

        int temp = 0;
        int s = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (nums2[j] < nums1[i]) {
                    temp = nums1[i];
                    nums1[i] = nums2[s];
                    nums2[s] = temp;

                    sort(nums2);
                }
            }
        }
        int j = 0;
        for (int k = nums1.length - n; k < nums1.length; k++) {
            nums1[k] = nums2[j];
            j++;
        }
    }

    static void sort(int arr[]) {

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
            }
        }
    }

    public static void main(String[] args) {
        int nums1[] = { 1, 2, 3, 0, 0, 0 };
        int nums2[] = { 2, 5, 6 };
        int m = nums1.length;
        int n = nums2.length;
        merge(nums1, m, nums2, n);
    }
}

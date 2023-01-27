class prefixsum {

    static int getSumNaive(int start, int end) {
        int sum = 0;
        int arr[] = { 2, 8, 3, 9, 6, 5, 4 };

        for (int i = start; i <= end; i++) {
            sum += arr[i];
        }

        return sum;

    }

    static int getSum(int start, int end) {
        int arr[] = { 2, 8, 3, 9, 6, 5, 4 };
        int n = arr.length;

        int[] newarr = new int[n];
        newarr[0] = arr[0];
        int sum = arr[0];

        for (int i = 1; i < arr.length; i++) {
            sum += arr[i];
            newarr[i] = sum;
        }

        if (start == 0) {

            return newarr[end];

        }

        return newarr[end] - newarr[start - 1];

    }

    public static void main(String args[]) {

        System.out.println(getSum(0, 2));
        System.out.println(getSum(1, 3));
        System.out.println(getSum(2, 6));

    }
}
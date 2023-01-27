package Sorting;

import java.util.Arrays;

public class merge_sort {

    static boolean asc(int a, int b) {
        return a < b;
    }

    static void mergesort(int arr[], int start, int end) {
        if (start >= end) {
            return;

        }

        int mid = (start + end) / 2;

        mergesort(arr, start, mid);
        mergesort(arr, mid + 1, end);

        mergearray(arr, start, end, mid);

    }

    static void mergearray(int arr[], int start, int end, int mid) {

        int arr1[] = Arrays.copyOfRange(arr, start, mid + 1);
        int arr2[] = Arrays.copyOfRange(arr, mid + 1, end + 1);

        int i = 0;
        int j = 0;
        int k = start;
        int inversion = 0;

        while (i < arr1.length && j < arr2.length) {

            if (asc(arr1[i], arr2[j])) {
                arr[k] = arr1[i];

                i++;
                k++;
            } else {
                arr[k] = arr2[j];
                inversion++;
                j++;
                k++;
            }
        }

        while (i < arr1.length) {
            arr[k] = arr1[i];
            inversion++;
            i++;
            k++;
        }

        while (j < arr2.length) {
            arr[k] = arr2[j];

            j++;
            k++;
        }
        inverse(inversion);

    }

    static void display(int arr[]) {

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.print(" ");
    }

    static void inverse(long n) {

        System.out.println("1");

    }

    public static void main(String[] args) {
        int arr[] = { 3, 2, 1 };
        mergesort(arr, 0, arr.length - 1);
        display(arr);

    }

}

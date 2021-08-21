package com.company;

public class BinarySearch {
    int binary_search(int[] arr, int n) {
        int min = 0;
        int max = arr.length - 1;
        while (min <= max) {
            int mid = (min + max) / 2;
            if (arr[mid] == n) return mid;
            else if (arr[mid] < n) min = mid + 1;
            else max = mid - 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = new int[10];
        for (int i = 0; i < 10; i++) arr[i] = i + 1;
        BinarySearch bs = new BinarySearch();
        System.out.println(bs.binary_search(arr, 10));
    }
}

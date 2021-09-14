package com.company;

import java.util.Arrays;
import java.util.Random;

public class QuickSort {
    int[] arr;

    public QuickSort(int[] arr) {
        this.arr = arr;
    }

    public int partition(int first, int last) {
        int pivot = new Random().nextInt(last - first + 1) + first;

        int temp = arr[pivot];
        arr[pivot] = arr[last];
        arr[last] = temp;

        for (int i = first; i <= last; i++) {
            if (arr[i] < arr[last]) {
                temp = arr[i];
                arr[i] = arr[first];
                arr[first] = temp;
                first++;
            }
        }
        temp = arr[first];
        arr[first] = arr[last];
        arr[last] = temp;

        return first;
    }

    public int select(int first, int last, int k) {
        int pivot = partition(first, last);

        if (pivot < k) return select(pivot + 1, last, k);
        else if (pivot > k) return select(first, pivot - 1, k);
        return arr[k];
    }

    public void quick_sort(int first, int last) {
        if (first < last) {
            int pivot = partition(first, last);
            quick_sort(pivot + 1, last);
            quick_sort(first, pivot - 1);
        }
    }

    public void sort() {
        for (int i = 0; i < 9; i++) {
            select(0, 9, i);
        }
    }

    public static void main(String[] args) {
        int[] arr = {10, 12, 83, 14, 9, 15, 74, 36, 78, 65};

        QuickSort sa = new QuickSort(arr);
        sa.quick_sort(0, 9);
        System.out.println(Arrays.toString(sa.arr));
    }
}

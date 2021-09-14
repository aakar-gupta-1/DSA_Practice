package com.company;

import java.util.Random;

public class SelectAlgo {

    int[] arr;

    public SelectAlgo(int[] arr) {
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

    public static void main(String[] args) {
        int[] arr = {10, 12, 83, 14, 9, 15, 74, 36, 78, 65};

        SelectAlgo sa = new SelectAlgo(arr);
        System.out.println(sa.select(0, 9, 9));
    }
}

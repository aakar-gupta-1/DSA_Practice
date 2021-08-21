package com.company;

public class Recursion {
    public int factorial_head(int n) {
        if (n == 1) return n;
        return n * factorial_head(n - 1);
    }

    public int factorial_tail(int n, int res) {
        if (n == 1) return res;
        return factorial_tail(n - 1, n * res);
    }

    public int fibonacci_head(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }

        return fibonacci_head(n - 1) + fibonacci_head(n - 2);
    }

    public int fibonacci_tail(int n, int fib1, int fib2) {
        if (n == 1) return fib2;

        return fibonacci_tail(n - 1, fib2, fib2 + fib1);
    }

    public int linear_search(int[] arr, int n, int i) {
        if (i >= arr.length) return -1;
        if (arr[i] == n) return i;
        return linear_search(arr, n, i + 1);
    }

    public static void main(String[] args) {
        Recursion recursion = new Recursion();
        System.out.println(recursion.fibonacci_head(10));
        System.out.println(recursion.fibonacci_tail(10, 0, 1));
    }
}

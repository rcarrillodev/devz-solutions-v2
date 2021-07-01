package dev.rcarrillo.devz.dynamicprogramming;

import java.util.Arrays;

/**
 * Solve Fibonacci problem using DP with tabulation
 */
public class FibonacciTabSolution {

    public static void main(String[] args) {
        int fib = fib(10);
        System.out.println(fib);
    }

    private static int fib(int number) {
        int[] tab = new int[number+1];
        Arrays.fill(tab,0);
        tab[1]= 1;
        for(int i=2; i<=number; i++){
            tab[i] = tab[i-1] + tab[i-2];
        }
        return tab[number];
    }
}

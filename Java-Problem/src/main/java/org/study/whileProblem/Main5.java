package org.study.whileProblem;

/**
 * While5. Дано целое число N (> 0), являющееся некоторой степенью числа 2:
 * N = 2K. Найти целое число K — показатель этой степени.
 */
public class Main5 {
    private static final int DIVIDER = 2;

    public static void main(String[] args) {
        System.out.println(division(16));
    }

    public static int division(int N) {
        int count = 0;
        if (N >= 0) {
            while (N - DIVIDER >= 0) {
                N = N - DIVIDER;
                count++;
            }
        } else {
            throw new RuntimeException(String.format("Input param must be positive N=%s", N));
        }
        if (N != 0) {
            throw new RuntimeException("Input param must be N = 2K.");
        }
        return count;
    }
}

package org.study.whileProblem;

/**
 * While3. Даны целые положительные числа N и K.
 * Используя только операции сложения и вычитания,
 * найти частное от деления нацело N на K, а также остаток от этого деления.
 */
public class Main3 {

    public static void main(String[] args) {
        division(16, 6);
    }

    public static void division(int N, int K) {
        int count = 0;
        int answer = N;
        if (N >= 0 && K >= 0) {
            while (answer - K >= 0) {
                answer = answer - K;
                count++;
            }
        } else {
            throw new RuntimeException(String.format("Input param must be positive N=%s, K=%s", N, K));
        }
        System.out.println(count);
        System.out.println(answer);
    }
}

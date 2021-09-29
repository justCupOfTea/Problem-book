package org.study.whileProblem;

/**
 * While4. Дано целое число N (> 0).
 * Если оно является степенью числа 3, то вывести True, если не является — вывести False.
 */
public class Main4 {
    private static final int DIVIDER = 3;

    public static void main(String[] args) {
        System.out.println(division(9));
    }

    public static boolean division(int N) {
        int answer = N;
        if (N >= 0) {
            while (answer - DIVIDER >= 0) {
                answer = answer - DIVIDER;
            }
        } else {
            throw new RuntimeException(String.format("Input param must be positive N=%s", N));
        }
        return answer == 0;
    }
}

package org.study.whileProblem;

import java.util.Scanner;

/**
 * Цикл с условием: группа While
 * While1. Даны положительные числа A и B (A > B). На отрезке длины A размещено максимально возможное количество отрезков
 * длины B (без наложений). Не используя операции умножения и деления, найти длину незанятой части отрезка A.
 */
public class Main1 {
    private static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        int a = Integer.parseInt(input("A"));
        int b = Integer.parseInt(input("B"));
        System.out.println(length(a, b));
    }

    public static Integer length(int a, int b) {
        int answer = a;
        if (b > 0 && a > b) {
            while (answer > 0) {
                answer = answer - b;
            }
        } else {
            throw new RuntimeException(String.format("Input param A=%s, B=%s", a, b));
        }

        return answer == 0 ? 0 : b + answer;
    }

    private static String input(String parameterName) {
        System.out.printf("Input parameter %s%n", parameterName);
        return SCANNER.nextLine();
    }
}

package org.study.whileProblem;

/**
 * While2. Даны положительные числа A и B (A > B). На отрезке длины A размещено максимально возможное количество отрезков длины
 * B (без наложений). Не используя операции умножения и деления, найти количество отрезков B, размещенных на отрезке A.
 */
public class Main2 {

    public static void main(String[] args) {
        System.out.println(count(25, 6));
    }

    public static int count(int a, int b) {
        int count = 0;
        int tmp = a;
        if (b > 0 && a > b) {
            while (tmp - b >= 0) {
                tmp = tmp - b;
                count++;
            }
        } else {
            throw new RuntimeException(String.format("Input param A=%s, B=%s", a, b));
        }
        return count;
    }
}

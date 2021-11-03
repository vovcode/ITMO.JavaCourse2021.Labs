package Other.Algorithms;

import java.util.Scanner;

public class FibonacciRecursive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int fibNumber;
        System.out.println("Введите число Фибонначи");
    }

    public static int countFib(int value) {
        if (value == 0) {
            return 0;
        }
        if (value == 1) {
            return 1;
        }
        return countFib(value - 1) + countFib(value - 2);
    }
}

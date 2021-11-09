package Other.Algorithms;

import java.util.Scanner;

public class FibonacciRecursive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int fibNumber;
        System.out.println("Введите N-e число Фибонначи");
        fibNumber = sc.nextInt();
        fibNumber = countFib(fibNumber);
        System.out.println("Искомое значение равно " + fibNumber);
        System.out.println("Введите N-e число Фибонначи");
        fibNumber = sc.nextInt();
        fibNumber = getFibonacciNumberValue(fibNumber);
        System.out.println("Искомое значение равно " + fibNumber);
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
    public static int getFibonacciNumberValue(int N) {
        int num1 = 0;
        int num2 = 1;
        int sumOfTwoNumbers;
        for (int i = 0; i < N; i++) {
            sumOfTwoNumbers = num1 + num2;
            num1 = num2;
            num2 = sumOfTwoNumbers;
        }
        return num1;
    }
}

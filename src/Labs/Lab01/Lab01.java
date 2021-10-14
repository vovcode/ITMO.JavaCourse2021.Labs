package Labs.Lab01;

import java.util.Scanner;

public class Lab01 {

    public static void main(String[] args) {
        System.out.println("Начало задания 1");
        saySomeStuff();
        System.out.println("Конец задания 1\n");
        System.out.println("Начало задания 2");
        solveMyMath();
        System.out.println("Конец задания 2\n");
        System.out.println("Начало задания 3");
        solveMyMath2();
        System.out.println("Конец задания 3\n");
        System.out.println("Начало задания 4");
        multiplyNums();
        System.out.println("Конец задания 4\n");
        System.out.println("Начало задания 5");
        getIntsFromInput();
        System.out.println("Конец задания 5\n");
        System.out.println("Начало задания 6");
        numOddOrEven();
        System.out.println("Конец задания 6\n");
    }

    public static void saySomeStuff() {
        System.out.println("Я");
        System.out.println("хорошо");
        System.out.println("знаю");
        System.out.println("Java");
    }

    public static void solveMyMath() {
        System.out.println((46 + 10) * (10 / 3));
        System.out.println((29) * (4) * (-15));
    }

    public static void solveMyMath2() {
        int number = 10500;
        int result = (number / 10) / 10;
        System.out.println(result);
    }

    public static void multiplyNums() {
        double num1 = 3.6;
        double num2 = 4.1;
        double num3 = 5.9;
        double result = num1 * num2 * num3;
        System.out.println(result);
    }

    public static void getIntsFromInput() {
        Scanner in = new Scanner(System.in);
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        int num3 = in.nextInt();

        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);
    }

    public static void numOddOrEven() {
        Scanner in = new Scanner(System.in);
        int b = in.nextInt();
        if (b % 2 == 0 & b > 100) {
            System.out.print("Выход за пределы диапазона");
        } else if (!(b % 2 == 0)) {
            System.out.print("Нечетное");
        } else if (b % 2 == 0) {
            System.out.println("Четное");
        }
    }

}

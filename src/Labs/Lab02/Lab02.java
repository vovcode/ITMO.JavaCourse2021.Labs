package Labs.Lab02;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Lab02 {
    public static void main(String[] args) {
        //Задание 1
        System.out.println("Начало задания 1");
        writeOddNums();
        System.out.println("Конец задания 1\n");
        //Задание 2
        System.out.println("Начало задания 2");
        divByThreeFiveBoth();
        System.out.println("Конец задания 2\n");
        //Задание 3
        System.out.println("Начало задания 3");
        boolean isSumTrue; //Содержит значение, возвращаемое методом третьего задания (проверка равенства суммы двух чисел третьему)
        isSumTrue = isSumEqualToNum();
        System.out.println("Результат: " + isSumTrue);
        System.out.println("Конец задания 3\n");
        //Задание 4
        System.out.println("Начало задания 4");
        boolean isTrueToConditions; //Содержит значение, возвращаемое методом четвертого задания (сравнение вводимых чисел)
        isTrueToConditions = comparisonOnConditions();
        System.out.println("Результат: " + isTrueToConditions);
        System.out.println("Конец задания 4\n");
        //Задание 5
        System.out.println("Начало задания 5");
        int[] arrayToInspect = randomSizeAndFillArray();//Сохранение рандомного массива для повторного использования в Задании 6
        isFirstOrLastArrayElement(arrayToInspect);
        System.out.println("Конец задания 5\n");
        //Задание 6
        System.out.println("Начало задания 6");
        arrayContainsValue(arrayToInspect);
        System.out.println("Конец задания 6\n");
    }

    public static void writeOddNums() {
        for (int i = 0; i <= 99; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
    }

    public static void divByThreeFiveBoth() {
        String divByThree = "";
        String divByFive = "";
        String divByBoth = "";
        for (int i = 1; i <= 100; i++) {
            if ((i % 3 == 0) && (i % 5 == 0)) {
                divByBoth += i + " ";
            } else if (i % 3 == 0) {
                divByThree += i + " ";
            } else if (i % 5 == 0) {
                divByFive += i + " ";
            }
        }
        System.out.println("Делятся на 3: " + divByThree);
        System.out.println("Делятся на 5: " + divByFive);
        System.out.println("Делятся на 3 и 5: " + divByBoth);
    }

    public static boolean isSumEqualToNum() {
        int num1, num2, num3, sumResult;
        Scanner in = new Scanner(System.in);
        System.out.println("Введите первое число:");
        num1 = in.nextInt();
        System.out.println("Введите второе число:");
        num2 = in.nextInt();
        System.out.println("Введите третье число:");
        num3 = in.nextInt();
        sumResult = num1 + num2;
        if (num3 == sumResult) {
            return true;
        }
        return false;
    }

    public static boolean comparisonOnConditions() {
        int num1, num2, num3;
        Scanner in2 = new Scanner(System.in);
        System.out.println("Введите первое число:");
        num1 = in2.nextInt();
        System.out.println("Введите второе число:");
        num2 = in2.nextInt();
        System.out.println("Введите третье число:");
        num3 = in2.nextInt();
        if ((num2 > num1) && (num3 > num2)) {
            return true;
        } else {
            return false;
        }
    }

    public static void isFirstOrLastArrayElement(int[] arrayToCheck) {
        int firstNum, lastNum;
        firstNum = arrayToCheck[0];
        lastNum = arrayToCheck[arrayToCheck.length - 1];
        if ((firstNum == 3) || (lastNum == 3)) {
            System.out.println(Arrays.toString(arrayToCheck));
            System.out.println(true + " - массив содержит 3 в качестве первого или последнего элемента");
        } else {
            System.out.println(Arrays.toString(arrayToCheck));
            System.out.println(false + " - в массиве нет 3 в качестве первого или последнего элемента");
        }
    }

    public static void arrayContainsValue(int[] arrayToCheck) {
        int target1, target2;
        target1 = 1;
        target2 = 2;
        int containCount = 0;//Переменная, равная количеству случаев включения в массив значения "1" или "3"
        for (int i : arrayToCheck) {
            if ((arrayToCheck[i] == 1) || (arrayToCheck[i] == 3)) {
                containCount++;
            }
        }
        if (containCount > 0) {
            System.out.println("Массив содержит 1 или 3");
        } else {
            System.out.println("Массив не содержит 1 или 3");
        }
    }

    public static int[] randomSizeAndFillArray() { //Метод возвращает рандомное значение

        Random random = new Random();
        int randomLength = random.nextInt(100) + 2;
        int[] arrayToCheck = new int[randomLength];

        for (int i = arrayToCheck[0]; i < (arrayToCheck.length - 1); i++) {
            Random random2 = new Random();
            int randomNumber = random2.nextInt(11);//Генерация рандомного числа от 0 до 10
            arrayToCheck[i] = randomNumber;
        }
        return arrayToCheck;
    }
}
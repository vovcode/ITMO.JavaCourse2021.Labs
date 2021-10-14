package Labs.Lab02;

import java.util.Scanner;

public class Lab02 {
    public static void main(String[] args) {
        writeOddNums();
        divByThreeFiveBoth();

        boolean isSumTrue; //Содержит значение, возвращаемое методом третьего задания (проверка равенства суммы двух чисел третьему)
        isSumTrue = isSumEqualToNum();
        System.out.println("Результат: " + isSumTrue);

        boolean isTrueToConditions; //Содержит значение, возвращаемое методом четвертого задания (сравнение вводимых чисел)
        isTrueToConditions = comparisonOnConditions();
        System.out.println("Результат: " + isTrueToConditions);


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

    public static boolean isFirstOrLastArrayElement(int[] arrayToCheck) { //Исправить в Void
        int firstNum, lastNum;
        firstNum = arrayToCheck[0];
        lastNum = arrayToCheck[arrayToCheck.length - 1];
        if ((firstNum == 3) || (lastNum == 3)) {
            return true;
        } else {
            return false;
        }
    }
    public static boolean arrayContainsValue(int[] arrayToCheck){
        int target1, target2;
        target1 = 1;
        target2 = 2;
        return true;
    }
}
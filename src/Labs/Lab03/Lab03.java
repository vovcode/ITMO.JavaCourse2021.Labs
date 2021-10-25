package Labs.Lab03;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Lab03 {
    public static void main(String[] args) {
        System.out.println("Начало задания 1");
        checkArrayIfSorted(printArrayInput(getArrayLengthInput()));
        System.out.println("Конец задания 1\n");
        System.out.println("Начало задания 2");
        ArrayInputPrint();
        System.out.println("Конец задания 2\n");
        System.out.println("Начало задания 3");
        swapArrayLimitValues(printArrayInput(getArrayLengthInput()));
        System.out.println("Конец задания 3\n");
        System.out.println("Начало задания 4\n");
        int[] array = new int[]{1,1,2,3,3};
        System.out.println(findFirstUniqueElement(array));
        System.out.println("Конец задания 4\n");
        System.out.println("Начало задания 5\n");
        System.out.println("Введите N-ое число Фибоначчи: ");
        Scanner in = new Scanner(System.in);
        int nValue = in.nextInt();
        System.out.println("N-ое значение Фибоначчи равно " + getFibonacchiNumberValue(nValue));
        System.out.println("Конец задания 5\n");

    }

    public static int getArrayLengthInput() {
        System.out.println("Введите количество элементов проверяемого массива");
        Scanner sc = new Scanner(System.in);
        int arrayLength = sc.nextInt();
        return arrayLength;
    }

    public static int[] printArrayInput(int arrayLength) {
        int[] arrayToPrint = new int[arrayLength];
        Scanner sc2 = new Scanner(System.in);
        System.out.println("Введите элементы массива по порядку:");
        for (int i = 0; i < arrayLength; i++) {
            System.out.printf("Элемент массива %d:", i);
            arrayToPrint[i] = sc2.nextInt();
        }
        System.out.println("Массив: " + Arrays.toString(arrayToPrint));
        return arrayToPrint;
    }

    //Метод проверки массива на отсортированность по возрастанию
    public static void checkArrayIfSorted(int[] arrayToCheck) {
        boolean isSorted = true;
        for (int i = 0; i < arrayToCheck.length - 1; i++) {
            if (arrayToCheck[i] < arrayToCheck[i + 1]) {
                isSorted = true;
            } else if (arrayToCheck[i] > arrayToCheck[i + 1]) {
                isSorted = false;
                break;
            }
        }
        if (isSorted == true) {
            System.out.println("OK");
        } else if (isSorted == false) {
            System.out.println("Please, try again");
        }
    }

    public static void ArrayInputPrint() {
        int arrayLength;
        Scanner sc3 = new Scanner(System.in);
        System.out.println("Array length: ");
        arrayLength = sc3.nextInt();
        int[] arrayToPrint = new int[arrayLength];

        System.out.println("Numbers of array:");
        for (int i = 0; i < arrayLength; i++) {
            arrayToPrint[i] = sc3.nextInt();
        }
        System.out.println("Result: " + Arrays.toString(arrayToPrint));
    }

    public static void swapArrayLimitValues(int[] arrayToCheck) {
        int firstValue, lastValue;
        System.out.println("Array 1: " + Arrays.toString(arrayToCheck));
        firstValue = arrayToCheck[0];
        lastValue = arrayToCheck[arrayToCheck.length - 1];
        arrayToCheck[0] = lastValue;
        arrayToCheck[arrayToCheck.length - 1] = firstValue;
        System.out.println("Array 2: " + Arrays.toString(arrayToCheck));
    }

    public static int findFirstUniqueElement(int[] arrayToCheck) {
        for (int i = 0; i < arrayToCheck.length; i++) {
            int j;
            for (j = 0; j < arrayToCheck.length; j++)
                if (i != j && arrayToCheck[i] == arrayToCheck[j])
                    break;
            if (j == arrayToCheck.length)
                return arrayToCheck[i];
        }
        return -1;
    }

    public static int getFibonacchiNumberValue(int N) {
        //0 1 1 2 3
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

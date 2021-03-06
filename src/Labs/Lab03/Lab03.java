package Labs.Lab03;

import java.nio.CharBuffer;
import java.text.Format;
import java.util.Arrays;
import java.util.IllegalFormatException;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.Collectors;

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
        int[] array = new int[]{1, 1, 2, 3, 3};
        System.out.println(findFirstUniqueElement(array));
        System.out.println("Конец задания 4\n");
        System.out.println("Начало задания 5\n");
        System.out.println("Введите N-ое число Фибоначчи: ");
        Scanner in = new Scanner(System.in);
        int nValue = in.nextInt();
        System.out.println("N-ое значение Фибоначчи равно " + getFibonacciNumberValue(nValue));
        System.out.println("Конец задания 5\n");
        System.out.println("Начало задания 6\n");
        int[] arrayToSort = Arrays.copyOf(randomSizeAndFillArray(), randomSizeAndFillArray().length);
        System.out.println("Массив до сортировки: " + Arrays.toString(arrayToSort));
        mergeSort(arrayToSort);
        System.out.println("Массив после сортировки слиянием: " + Arrays.toString(arrayToSort));
        System.out.println("Конец задания 6\n");
//        System.out.println("Начало задания 7\n");
//        int[] myArray = new int[]{0, 2, 3, 4, 3, 0, 5, 0, 6, 5};
//        int[] mySortedArray = new int[]{0, 0, 0, 2, 3, 3, 4, 5, 5, 6};
//        int k = 2;
//        indMostFrequent(myArray, k);
//        oof();
//        findMostFreq();
//        System.out.println("Конец задания 7\n");

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

    public static int[] randomSizeAndFillArray() { //Метод возвращает рандомное значение
        Random random = new Random();
        int randomLength = random.nextInt(100) + 2;
        int[] arrayToCheck = new int[randomLength];
        Random random2 = new Random();
        for (int i = 0; i < arrayToCheck.length; i++) {
            int randomNumber = random2.nextInt(11);//Генерация рандомного числа от 0 до 10
            arrayToCheck[i] = randomNumber;
        }
        return arrayToCheck;
    }

    public static void mergeSort(int[] array) {
        if (array.length < 2) {
            return;
        }
        int middleIndex = Math.round(array.length / 2);
        int[] leftArray = Arrays.copyOfRange(array, 0, middleIndex);
        int[] rightArray = Arrays.copyOfRange(array, middleIndex, array.length);

        mergeSort(leftArray);
        mergeSort(rightArray);
        merge(leftArray, rightArray, array);
    }

    public static void merge(int[] leftArray, int[] rightArray, int[] array) { // leftArray, rightArray - уже отсортированные массивы

        int leftSize = array.length / 2;
        int rightSize = array.length - leftSize;
        int i = 0, l = 0, r = 0; //i - индекс позиции внутри оригинального массива, l - внутри левого массива, r - внутри правого массива

        while (l < leftSize && r < rightSize) {
            if (leftArray[l] < rightArray[r]) {
                array[i] = leftArray[l];
                i++;
                l++;
            } else {
                array[i] = rightArray[r];
                i++;
                r++;
            }
        }
        while (l < leftSize) {
            array[i] = leftArray[l];
            i++;
            l++;
        }
        while (r < rightSize) {
            array[i] = rightArray[r];
            i++;
            r++;
        }
    }

//    public static void oof(/*int[] array*/) throws IllegalFormatException {
//        //mergeSort(array);
//        //Получение distinct массива
//        int[] array = new int[]{0, 0, 0, 2, 3, 3, 4, 5, 5, 6};
//        String arr = "";
//        int k = 0;
//        for (int i = 0; i < array.length - 1; i++) {
//            k++;
//            if (array[i] == array[k]) {
//                String temp = String.valueOf(array[i]);
//                if (!arr.contains(temp)) {
//                    arr += array[i];
//                }
//            } else if (array[i] != array[k]) {
//                String temp2 = String.valueOf(array[k]);
//                if (!arr.contains(temp2)) {
//                    arr += array[k];
//                }
//            }
//        }
//        int len = arr.length();
//        int[] fltdArray = new int[len];
//        int subsIndex = 0;//Индекс substring от сроки arr
//        for (int i = 0; i < len; i++) {
//            int temp;
//            temp = Integer.parseInt(arr.substring(subsIndex, subsIndex + 1));
//            fltdArray[i] = temp;
//            subsIndex++;
//        }
//        //Distinct массив получен
//        int[] counterArray = new int[fltdArray.length];
//        int counter = 0;
//        int counterArrayIndex = 0;
//        int fltdArrayIndex = 0;
//        for (int i = 0; i < array.length; i++) {
//            if (fltdArrayIndex == fltdArray.length) {
//                break;
//            }
//            if ((array[i] == fltdArray[fltdArrayIndex]) && (counterArrayIndex != fltdArray.length) && (fltdArrayIndex < fltdArray.length)) {
//                counter++;
//            }
//            if ((array[i] != fltdArray[fltdArrayIndex]) && (counterArrayIndex != fltdArray.length) && (fltdArrayIndex < fltdArray.length)) {
//                counterArray[counterArrayIndex] = counter;
//                counterArrayIndex++;
//                fltdArrayIndex++;
//                counter = 0;
//            }
//        }
//        System.out.println(Arrays.toString(counterArray));
//    }

   /* public static void findMostFreq() {
        int[] array = new int[]{0, 0, 0, 2, 3, 3, 4, 5, 5, 6};
        int[] fltdArray = new int[]{0, 2, 3, 4, 5, 6};
        int [] countArray = new int [fltdArray.length];

        String arrayValues = Arrays.toString(array);
        int arrLength =arrayValues.length();
        String fltdArrayValues = Arrays.toString(fltdArray);
        int fArrLength = fltdArrayValues.length();

        int value = 0;
        int strIndex = 0;
        System.out.println(arrayValues.charAt(4));
        for (int i = 0; i < arrLength; i++) {

        }
    }*/


    /*public static void findMostFreq() {
        int[] array = new int[]{0, 0, 0, 2, 3, 3, 4, 5, 5, 6};
        int[] fltdArray = new int[]{0, 2, 3, 4, 5, 6};
        int fArrayIndex = 0;
        int cArrayIndex = 0;
        int[] counterArray = new int[fltdArray.length];
        int counter = 0;
        for (int i = 0; i < array.length; i++) {
            if (cArrayIndex==fltdArray.length){
                break;
            }
            if ((fltdArray[fArrayIndex] == array[i])) {
                counter++;
                counterArray[cArrayIndex] = counter;
                cArrayIndex++;
            }
            if ((fltdArray[fArrayIndex] == array[i + 1])) {
                counter++;
                counterArray[cArrayIndex-1] = counter;
                cArrayIndex+=2;
            }
        }
        System.out.println(Arrays.toString(counterArray));*/
}




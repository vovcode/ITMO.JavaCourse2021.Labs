package Labs.Lab03;

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
        //Тут местами менять
        System.out.println("Конец задания 3\n");
        System.out.println("Конец задания 4\n");
        //findFirstUniqueElement(printArrayInput(getArrayLengthInput()));
        System.out.println("Конец задания 4\n");
//        TestingArray();

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
        for (int i = 0; i < arrayToCheck.length; i++) {//проверить тут
            if (arrayToCheck[i] < arrayToCheck[i + 1]) {
                isSorted = true;
            } else if (arrayToCheck[i] > arrayToCheck[i + 1]) {
                isSorted = false;
            }
        }
        if (isSorted == true) {
            System.out.println("OK");
        } else {
            System.out.println("Please, try again");
        }
    }
    public static void ArrayInputPrint(){
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
   /* public static void findFirstUniqueElement(int[] arrayToCheck){
        //Смотрит есть ли дубликаты в массиве, если нет, то сохраняет, если есть несколько, то берет первое значение
        int uniqueElement = 0;
        for (int i = 0; i < arrayToCheck.length; i++) {
            if (arrayToCheck[i] != arrayToCheck[i + 1]){
                uniqueElement = arrayToCheck[i];
                break;
            }
            else if(arrayToCheck[i] == arrayToCheck[i + 1]){
                //do nothing
            }
        }
        System.out.println("Первое уникальное число в массиве: " + uniqueElement);
    }*/
    public static void TestingArray(){
        int[] arrayToCheck = new int []{1,2,2,3,4,4,5,6,7,8};
        for (int i = 0; i < arrayToCheck.length; i++){
            // Попробовать foreach loop, вложенный for
        }
        System.out.println(Arrays.toString(arrayToCheck));
    }
}
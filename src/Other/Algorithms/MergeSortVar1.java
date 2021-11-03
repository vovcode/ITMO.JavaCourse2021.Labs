package Other.Algorithms;

import java.util.Arrays;

public class MergeSortVar1 {
    public static void main(String[] args) {
        //merge sort = recursively divide array in 2, sort, re-combine
        //run-time complexity = O(n Log n)
        //space complexity = O(n)
        int[] array = new int[]{8, 9, 2, 1, 5, 3, 4, 7, 6};
        mergeSort(array);
        System.out.println(Arrays.toString(array));
        }
    public static void mergeSort(int[] array) {
        int length = array.length;
        if (length <= 1) { //Базовый случай; то же самое что и условие (length < 2) - необходим для рекурсии
            return;
        }
        int middle = length / 2;
        int[] leftArray = new int[middle];
        int[] rightArray = new int[length - middle];

        int i = 0; // переменная левого массива
        int j = 0; // переменная правого массива

        for (; i < length; i++) {
            if (i < middle) {
                leftArray[i] = array[i];
            } else { //т.е i >= middle
                rightArray[j] = array[i];
                j++;
            }
        }
        mergeSort(leftArray);
        mergeSort(rightArray);
        merge(leftArray, rightArray, array);
    }


    public static void merge(int[] leftArray, int[] rightArray, int[] array) {
        int leftSize = array.length / 2;
        int rightSize = array.length - leftSize;
        int i = 0, l = 0, r = 0; //i - индекс позиции внутри оригинального массива, l - внутри левого массива, r - внутри правого массива

        //Проверка условий для слияния массивов
        while (l < leftSize && r < rightSize) { // заполнение оригинального массива элементами, пока в массивах left и right есть значения
            if (leftArray[l] < rightArray[r]) {
                array[i] = leftArray[l];
                i++;
                l++;
            } else { //если элемент справа больше левого (или равен ему)
                array[i] = rightArray[r];
                i++;
                r++;
            }
        }
        //Ниже действия с последним остающимся элементом, который невозможно сравнить с другим логикой выше из-за отсутствия такового
        while (l < leftSize){
            array[i]=leftArray[l];
            i++;
            l++;
        }
        while (r < rightSize){
            array[i]=rightArray[r];
            i++;
            r++;
        }
    }
}

package Other.Algorithms;

import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        int[] array = new int[]{-1, 0, 3, 5, 7, 9, 12};
        int target = 3;
        System.out.println("Индекс искомого значения равен " + doBinarySearch(array, target));

        int[] array2 = new int[]{1, 2, 3, 5, 8, 12, 33};
        int start2 = 0;
        int end2 = array2.length - 1;
        int target2 = 8;
        System.out.println("Индекс искомого значения равен " + doBinarySearch2(array2, start2, end2, target2));

        int[] array3 = new int[]{1, 2, 3, 5, 8, 12, 33};
        int start3 = 0;
        int end3 = array2.length - 1;
        int target3 = 9999; //Данное значение не входит в массив
        System.out.println("Вхождение значения в массив: " + doBinarySearch3(array2, start3, end3, target3));
    }

    //Бинарный поиск производится только по отсоритрованным данным (в любом порядке)!
    // Mid index массива равен array length / 2. Например, для int array {0, 1, 2, 4, 5, 8}: 6 / 2 = 3; 3 - mid index, т. е. элемент массива со значением 4.
    public static int doBinarySearch(int[] array, int target) {
        int left = 0; //Левый указатель стоит на нулевом элементе массива
        int right = array.length - 1; //Правый указатель стоит на конечном элементе массива
        int mid = 0; //Центральный указатель

        while (left <= right) {
            mid = Math.round((right - left) / 2) + left;
            if (target == array[mid]) {
                return mid;
            } else if (target < array[mid]) {
                right = mid - 1; //сдвиг правой позиции при откидывании правой части
            } else {
                left = mid + 1;
            }
        }
        return -1;
    }

    public static int doBinarySearch2(int[] array, int start, int end, int target) { //Рекурсивный подход бинарного поиска для поиска индекса искомого значения
        if (start > end) return -1;
        int midIndex = Math.round((start + end) / 2);
        if (array[midIndex] == target) {
            return midIndex;
        }
        if (array[midIndex] > target) {
            return doBinarySearch2(array, start, midIndex - 1, target);
        } else {
            return doBinarySearch2(array, midIndex + 1, end, target);
        }
    }

    public static boolean doBinarySearch3(int[] array, int start, int end, int target) { //Рекурсивный подход бинарного поиска для проверки вхождения значения в массив
        if (start > end) return false;
        int midIndex = Math.round((start + end) / 2);
        if (array[midIndex] == target) {
            return true;
        }
        if (array[midIndex] > target) {
            return doBinarySearch3(array, start, midIndex - 1, target);
        } else {
            return doBinarySearch3(array, midIndex + 1, end, target);
        }
    }
}

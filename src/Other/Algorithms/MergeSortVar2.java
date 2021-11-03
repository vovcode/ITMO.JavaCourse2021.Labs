package Other.Algorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

public class MergeSortVar2 {
    public static void main(String[] args) {
        int[] array = new int[]{8, 9, 2, 1, 5, 3, 4, 7, 6, 10, 11, 12};
        mergeSort(array);
        System.out.println(Arrays.toString(array));
    }

    public static void mergeSort(int[] array) {
        if (array.length < 2) { //Длина массива не больше 1; в данной ситуации массив считается отсортированным
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
}

package Other.Algorithms;

public class BinarySearch {
    public static void main(String[] args) {
        int[] array = new int[]{-1, 0, 3, 5, 7, 9, 12};
        int target = 3;
        System.out.println(doBinarySearch(array, target));
    }

    //Бинарный поиск производится только по отсоритрованным данным!
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
}

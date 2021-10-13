package Lessons.Lesson3;

public class Practise1 {
    public static void main(String[] args) {
        //int[] test = {0, 1, 2, 4, 3, 2, 0, 2};
        //System.out.println(Arrays.toString(removeElement(test, 2)));

    }
    public static int[] removeElement(int[] array, int val) {
        int offset = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == val) {
                offset++;
            } else {
                array[i - offset] = array[i];
            }
        }
        int [] newArray = new int [array.length -offset];
        for (int i =0; i< newArray.length; i++){
            newArray[i] = array[i];
        }
        return newArray;
    }
    public static int positiveNumSum(int[] numArray){
        int result = 0;
        for (int i: numArray){
            if (i <0 ) continue;
            result += i;
        }
        return result;
    }
}
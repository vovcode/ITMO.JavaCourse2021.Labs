package Labs.Lab01;

import java.util.Scanner;

public class Lab01 {

    public static void main(String[] args) {
        saySomeStuff1();
        solveMyMath2();
        solveMyMath3();
        multiplyNums4();
        getIntsFromInput5();
        numOddOrEven6();
    }


    public static void saySomeStuff1(){
        System.out.println("Я");
        System.out.println("хорошо");
        System.out.println("знаю");
        System.out.println("Java");
    }
    public static void solveMyMath2(){
        System.out.println(( 46 + 10 ) * ( 10 / 3 ));
        System.out.println((29 ) * ( 4 ) * (- 15 ));
    }
    public static void solveMyMath3(){
        int number = 10500;
        int result = (number/10)/10;
        System.out.println(result);
    }
    public static void multiplyNums4(){
        double num1 = 3.6;
        double num2 = 4.1;
        double num3 = 5.9;
        double result = num1 * num2 * num3;
        System.out.println(result);
    }
    public static void getIntsFromInput5(){
        Scanner in = new Scanner(System.in);
        int num1=in.nextInt();
        int num2=in.nextInt();
        int num3=in.nextInt();

        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);
    }
    public static void numOddOrEven6(){
        Scanner in = new Scanner(System.in);
        int b =in.nextInt();
        if (b % 2 == 0 & b > 100){
            System.out.print("Выход за пределы диапазона");
        }
        else if (!(b % 2 == 0)){
            System.out.print("Нечетное");
        }
        else if (b % 2 == 0){
            System.out.println("Четное");
        }
    }

}

package Labs.Lab04;

import javax.print.attribute.standard.Finishings;
import java.util.Arrays;
import java.util.Scanner;

public class Lab04 {
    public static void main(String[] args) {
        System.out.println("Начало задания 1");
        findLongestString();
        System.out.println("\nКонец задания 1\n");
        System.out.println("Начало задания 2");
        System.out.println("Введите слово, чтобы проверить являетсяя ли оно палиндромом");
        String word;
        Scanner scanner = new Scanner(System.in);
        word = scanner.nextLine();
        checkIfPalindrome(word);
        if (checkIfPalindrome(word)) {
            System.out.println("true - введенное слово является палиндромом");
        } else {
            System.out.println("false - введенное слово не палиндром");
        }
        System.out.println("\nКонец задания 2\n");
        System.out.println("Начало задания 3");
        String textInput = "Ехал бяка через реку,\nВидит бяка — в реке бяка.\nСунул бяка руку в реку,\nбяка за руку бяка — цап!\n";
        System.out.println(textInput);
        System.out.println(censorWord(textInput));
        System.out.println("\nКонец задания 3\n");
        System.out.println("Начало задания 4");
        String initialString = "Ехал бяка через реку,\nВидит бяка — в реке бяка.\nСунул бяка руку в реку,\nбяка за руку бяка — цап!\n";
        String substring = "бяка";
        System.out.println(countSubstringInString(initialString, substring));
        System.out.println("\nКонец задания 4\n");
        System.out.println("Начало задания 5");
        System.out.println("Введите строку без знаков препинания. Слова в ней будут инвертированы.");
        Scanner sc = new Scanner(System.in);
        String userInput = sc.nextLine();
        System.out.println(reverseStringWordByWord(userInput));
        System.out.println("\nКонец задания 5\n");
    }

    public static void findLongestString() {
        System.out.println("Введите количество проверяемых строк");
        Scanner sc = new Scanner(System.in);
        int strCount = sc.nextInt();
        String[] str = new String[strCount];
        sc.nextLine();
        for (int i = 0; i < str.length; i++) {
            str[i] = sc.nextLine().trim();
        }

        System.out.println("\nВы ввели следующие строки: ");
        for (String string : str) {
            System.out.println(string);
        }

        String biggestString = "";
        int elementLength = str[0].length();
        for (int i = 0; i < str.length; i++) {
            if (str.length == 1) {
                biggestString = str[0];
                System.out.println(biggestString);
                break;
            }
            if (str[i].length() > elementLength) {
                elementLength = str[i].length();
                biggestString = str[i];
            } else if ((str[i].length() == elementLength) && (str[i].equals(str[0]))) {
                elementLength = str[i].length();
                biggestString = str[i];
            }
        }
        System.out.printf("Самая длинная строка: %s. Ее длина %s символов.", biggestString, elementLength);
    }

    public static boolean checkIfPalindrome(String word) {
        StringBuilder stringBuilder = new StringBuilder(word);
        stringBuilder.reverse();
        if (stringBuilder.toString().equals(word)) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean checkStringLength(String str) { //Возвращает true, если строка не null и не ""
        return (str != null && !str.isEmpty());
    }

    public static String censorWord(String text) {
        if (text.contains("бяка")) {
            text = text.replaceAll("бяка", "[вырезано цензурой]");
        } else if (!text.contains("бяка") || !(checkStringLength(text))) {
            text = "В тексте отсутствуют слова для замены.";
        }
        return text;
    }

    public static int countSubstringInString(String initialString, String substring) {
        if (!checkStringLength(initialString) || !checkStringLength(substring)) {
            return 0;
        }
        int count = 0, fromIndex = 0;
        while ((fromIndex = initialString.indexOf(substring, fromIndex)) != -1) {
            System.out.println("Подстрока найдена на индексе: " + fromIndex);
            count++;
            fromIndex = fromIndex + substring.length();
        }
        return count;
    }

    public static String reverseStringWordByWord(String inputString) {
        inputString = inputString.trim();
        if (!checkStringLength(inputString)) {
            return "Отсутствует обработываемая строка";
        }
        String[] inputToArray = inputString.split(" ");
        String reversedString = "";

        for (String word : inputToArray) {
            StringBuilder reverseString = new StringBuilder(word);
            reverseString.reverse();//Инвертирование строки объектом StringBuilder
            reversedString += reverseString.toString() + " "; //Привидение типа к String
        }
        reversedString.trim();
        return reversedString;
    }
}




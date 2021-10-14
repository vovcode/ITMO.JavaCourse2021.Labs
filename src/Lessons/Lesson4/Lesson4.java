package Lessons.Lesson4;

import java.util.Arrays;

public class Lesson4 {
    public static void main(String[] args) {
        String str = "This is \nmultiple \nstring";
        System.out.println(str);

        String str1 = "";
        System.out.println(str1.length());

        String nullStr = null;
        System.out.println(nullStr);// No pointer exception

        String nullStr2 = null;
        //System.out.println(nullStr2.length());

        String s = "ab";
        char c = s.charAt(1);
        System.out.println(c);

        char last = s.charAt(s.length() - 1); //Значение последнего элемента
        System.out.println(last);

        String text = "simple text string";
        boolean empty = (text.isEmpty());
        System.out.println(empty);
        text = "";
        empty = text.isEmpty();
        System.out.println(empty);

        String textIn = "simple text string";
        textIn = textIn.toUpperCase();
        System.out.println(textIn);

        String someText = "123this";
        boolean startWith = someText.startsWith(someText); //or endsWith
        System.out.println(startWith);

        String someText2 = "123this";
        String repl = someText2.replace('1', '5');
        System.out.println(repl);

        String trimMethod = " \t text ! \n \t  ";
        System.out.println(trimMethod.trim());

        String name = "Anna";
        String seconName = "Ivanova";

        String fullName1 = name + " " + seconName;
        String fullName2 = name.concat(" ").concat(seconName);
        System.out.println(fullName1);
        System.out.println(fullName2);

        String str3 = "Str" + 10 + false;
        System.out.println(str3);

        int number = 100;
        String text3 ="this is some text";
        String result = text3 + number + 50;
        System.out.println(result);

        // Нуллабильное значение - может быть null
        // Любой ссылочный тип м. б. нуллабильным, примитивные - нет
        Integer in = null;
        String string1 = null;
        String first = "first";
        //System.out.println(string1.equalsIgnoreCase(first));

        String second = "second";
        String strFirst = "First";
        String strSecond = "Second";
        System.out.println(first.equals(second));
        System.out.println(first.equals(strFirst));
        System.out.println(second.equalsIgnoreCase(strSecond));

        String justSomeText ="simple text string";

        char[] symbols ={'A', 'B', 'C','D','E'};
        System.out.println(symbols);
        String strOut = String.valueOf(symbols); //Перевод char в string
        System.out.println(strOut);

        char[] charsFromString = strOut.toCharArray();//Перевод string в char
        System.out.println(charsFromString);

        String[] parts = justSomeText.split (" "); //Разбиение массива на строки по regex
        System.out.println(Arrays.toString((parts)));

        for (int i = 0; i < justSomeText.length(); i++) {
            System.out.println(justSomeText.charAt(i) + " ");
        }

        System.out.printf("My name is %s. I was born in %d %d", "Mike", 1998, 1998);
        int age = 35;
        char init ='M';
        String strSomeString = String.format("\nMy age is %d %c", age,init);
        System.out.println(strSomeString);

        StringBuilder emptystr = new StringBuilder("java!");
        System.out.println(emptystr.length());
        System.out.println(emptystr.charAt(4));
        emptystr.setCharAt(0,'J');
        emptystr.deleteCharAt(4);
        System.out.println(emptystr);
        emptystr.append("12345" + (50+50));
        System.out.println(emptystr);
    }
}

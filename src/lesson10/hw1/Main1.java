package lesson10.hw1;

import java.util.Scanner;

public class Main1
{
    /**Основное задание
     1. Написать программу со следующим функционалом:
     На вход передать строку (будем считать, что это номер документа).
     Номер документа имеет формат xxxx-yyy-xxxx-yyy-xyxy, где x — это число, а y — это буква.
     - Вывести на экран в одну строку два первых блока по 4 цифры.
     - Вывести на экран номер документа, но блоки из трех букв заменить на *** (каждая буква заменятся на *).
     - Вывести на экран только одни буквы из номера документа в формате yyy/yyy/y/y в нижнем регистре.
     - Вывести на экран буквы из номера документа в формате "Letters:yyy/yyy/y/y" в верхнем регистре(реализовать с помощью класса StringBuilder).
     - Проверить содержит ли номер документа последовательность abc и вывети сообщение содержит или нет(причем, abc и ABC считается одинаковой последовательностью).
     - Проверить начинается ли номер документа с последовательности 555.
     - Проверить заканчивается ли номер документа на последовательность 1a2b.
     Все эти методы реализовать в отдельном классе в статических методах,
     которые на вход (входным параметром) будут принимать вводимую на вход
     программы строку.
     */
    public static void main(String[] args)
    {
        String string = "9876-QwE-5432-aSd-1Z9x";
        if (isDesiredNumber(string))
        {
            System.out.println("Document number: ");
            System.out.println(string);
        }
        else
        {
            return;
        }
        System.out.println("Enter the number from 1 to 7: ");
        Scanner scanner = new Scanner(System.in);
        while (true)
        {
            switch (scanner.nextInt())
            {

                case 1 -> firstTwoBlocks(string);
                case 2 -> withStars(string);
                case 3 -> lowerCase(string);
                case 4 -> upperCase(string);
                case 5 -> System.out.println(containsABC(string));
                case 6 -> System.out.println(numberStartsAt555(string));
                case 7 -> System.out.println(numberEndsWith1a2b(string));
            }
        }
    }
    public static void firstTwoBlocks(String string)
    {
        String[] blocks = string.split("-");
        System.out.println("Вывести на экран в одну строку два первых блока по 4 цифры.");
        System.out.println(blocks[0] + "-" + blocks[2]);
    }
    public static void withStars(String string)
    {
        String[] block = string.split("-");
        block[1] = block[3] = "***";
        string = String.join("-", block);
        System.out.println("Вывести на экран номер документа, но блоки из трех букв заменить на *** (каждая буква заменятся на *).");
        System.out.println(string.substring(0,string.length() - 2));
    }
    public static void lowerCase(String string)
    {
        string = string.toLowerCase();
        String[] block = string.split("-");
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(block[1]).append("/").append(block[3]).append("/").append(block[4].charAt(1)).append("/").append(block[4].charAt(3));
        System.out.println("Вывести на экран только одни буквы из номера документа в формате yyy/yyy/y/y в нижнем регистре.");
        System.out.println(stringBuilder);
    }
    public static void upperCase(String string)
    {
        string = string.toUpperCase();
        String[] block = string.split("-");
        StringBuilder stringBuilder = new StringBuilder();
        System.out.println("Вывести на экран буквы из номера документа в формате Letters:yyy/yyy/y/y в верхнем регистре(реализовать с помощью класса StringBuilder).");
        stringBuilder.append("Letters:").append(block[1]).append("/").append(block[3]).append("/").append(block[4].charAt(1)).append("/").append(block[4].charAt(3));
        System.out.println(stringBuilder);
    }
    public static boolean containsABC(String string)
    {
        string = string.toLowerCase();
        System.out.println("Проверить содержит ли номер документа последовательность abc и вывети сообщение содержит или нет(причем, abc и ABC считается одинаковой последовательностью).");
        return string.contains("abc");
    }
    public static boolean numberStartsAt555(String string)
    {
        System.out.println("Проверить начинается ли номер документа с последовательности 555.");
        return string.startsWith("555");
    }
    public static boolean numberEndsWith1a2b(String string)
    {
        System.out.println("Проверить заканчивается ли номер документа на последовательность 1a2b.");
        return string.endsWith("1a2b");
    }
    public static boolean isDesiredNumber(String string)
    {
        String format = "[1-9]{4}-[a-zA-Z}]{3}-[1-9]{4}-[a-zA-Z]{3}-[1-9][a-zA-Z][1-9][a-zA-Z]";
        //*                9876  -     QwE    -   5432 -     aSd      -        1Z9x

        return string.matches(format);
    }
}

package lesson13.hw1;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main
{
    /**
     * Задача 1:
     * Пользователь вводит набор чисел в виде одной строки с клавиатуры. Например: "1, 2, 3,
     * 4, 4, 5". Избавиться от повторяющихся элементов в строке. Вывести результат на экран.
     * При решении использовать коллекции.
     */
    public static void main(String[] args)
    {
        String numbers = "";
        System.out.println("Enter a set of numbers: ");
        try (Scanner scanner = new Scanner(System.in))
        {
            numbers = scanner.nextLine();
        }
        String[] number = numbers.split(" ");
        Set<String> set = new HashSet<>(Arrays.asList(number));
        System.out.println("No duplicate numbers: ");
        System.out.println(set);
    }
}

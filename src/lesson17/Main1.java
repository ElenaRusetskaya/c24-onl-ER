package lesson17;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main1
{
    /**
     * Задача 1:
     * Вывести в консоль из строки которую пользователь вводит с клавиатуры все
     * аббревиатуры. Аббревиатурой будем считать слово от 2 до 6 символов, состоящее
     * только из прописных букв, без чисел.
     */
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        while (true)
        {
            System.out.println("Enter the line: ");
            String input = scanner.nextLine();
            String range = "\\b[a-zA-Z]{2,6}\\b";
            Pattern pattern = Pattern.compile(range);
            Matcher matcher = pattern.matcher(input);
            while (matcher.find())
            {
                System.out.println("The string is correct: ");
                System.out.println(matcher.group());
            }
        }
    }
}

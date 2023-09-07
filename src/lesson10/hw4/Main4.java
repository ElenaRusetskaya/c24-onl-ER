package lesson10.hw4;

import java.util.*;

public class Main4
{
    /** 4. Дана строка произвольной длины с произвольными словами.
     Написать программу для проверки является ли любое выбранное слово в
     строке палиндромом. Например, есть строка, вводится число 3, значит необходимо проверить
     является ли 3-е слово в этой строке палиндромом.
     Предусмотреть предупреждающие сообщения на случаи ошибочных
     ситуаций: например, в строке 5 слов, а на вход программе передали число
     500 и т. п. ситуации.
     */
    public static void main(String[] args)
    {
        String string = " fffff ab f 1234 jkjk 121 jafaj";
        List<String> numberWord = stringPalindrome(string);
        System.out.println("line: " + string);
        System.out.print("Word number: ");
        Scanner scanner = new Scanner(System.in);
        while (true)
        {
            int palindrome = scanner.nextInt() - 1;
            if (palindrome < 0 || palindrome > numberWord.size() - 1)
            {
                System.out.println("There are not so many words");
                continue;
            }
            System.out.println("Palindrome: " + isPalindrome(string, palindrome));
        }
    }
    public static boolean isPalindrome(String string, int palindrome)
    {
        List<String> word = stringPalindrome(string);
        String word1 = word.get(palindrome);
        StringBuilder stringBuilder = new StringBuilder(word1);
        return word.equals(stringBuilder.reverse().toString());
    }
    public static List<String> stringPalindrome(String string)
    {
        string = string.trim();
        if (string.isEmpty())
        {
            return new ArrayList<>();
        }
        ArrayList<String> word = new ArrayList<>(Arrays.asList(string.split(" ")));
        for (int i = 0; i < word.size(); )
        {
            if (word.get(i).isEmpty())
            {
                word.remove(i);
            }
            else
            {
                i++;
            }
        }
        return word;
    }
}

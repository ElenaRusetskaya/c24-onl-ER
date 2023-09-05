package lesson10.hw2;

public class Main2
{
    /**2. Дана строка произвольной длины с произвольными словами.
     Найти самое короткое слово в строке и вывести его на экран.
     Найти самое длинное слово в строке и вывести его на экран.
     Если таких слов несколько, то вывести последнее из них.
     */
    public static void main(String[] args)
    {
        String string = " Given a string of arbitrary length with arbitrary words ";
        System.out.println("String: " + string);
        System.out.println("The shortest word: ");
        System.out.println(shortestWord(string));
        System.out.println("The longest word: ");
        System.out.println(longestWord(string));
    }
    public static String shortestWord(String string)
    {
        string = string.trim();
        if (string.isEmpty())
        {
            return "";
        }
        String[] word = string.split(" ");
        String shortWord = word[0];;
        for (String word1 : word)
        {
            if (word1.isEmpty())
            {
                continue;
            }
            if (shortWord.length() >= word1.length())
            {
                shortWord = word1;
            }
        }
        return shortWord;
    }
    public static String longestWord(String string)
    {
        string = string.trim();
        if (string.isEmpty())
        {
            return "";
        }
        String[] word = string.split(" ");
        String longWord = word[0];;
        for (String word1 : word)
        {
            if (word1.isEmpty())
            {
                continue;
            }
            if (longWord.length() <= word1.length())
            {
                longWord = word1;
            }
        }
        return longWord;
    }

}

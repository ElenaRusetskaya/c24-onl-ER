package lesson10.hw5;

public class Main5
{
    /**5. Дана произвольная строка.
     Вывести на консоль новую строку, которой задублирована каждая буква из начальной строки.
     Например, "Hello" -> "HHeelllloo".
     */
    public static void main(String[] args)
    {
        String string = "Hello";
        System.out.println("Word: " + string);
        System.out.println("Every letter is duplicated: " + duplicatedWord(string));
    }
    public static String duplicatedWord(String string)
    {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < string.length(); i++)
        {
            stringBuilder.append(string.charAt(i)).append(string.charAt(i));
        }
        return stringBuilder.toString();
    }
}

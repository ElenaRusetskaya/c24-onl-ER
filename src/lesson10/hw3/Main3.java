package lesson10.hw3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Main3
{
    /**3. Дана строка произвольной длины с произвольными словами.
     Найти слово, в котором число различных символов минимально. Слово
     может содержать буквы и цифры. Если таких слов несколько, найти первое
     из них. Например, в строке "fffff ab f 1234 jkjk" найденное слово должно
     быть "fffff".
     */
    public static void main(String[] args)
    {
        String string = " fffff ab f 1234 jkjk ";
        System.out.println("Offer: " + string);
        System.out.println("A word with a minimum number of characters: " + MinSymbol(string));
    }
    public static String MinSymbol(String string)
    {
        string = string.trim();
        if (string.isEmpty())
        {
            return "";
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
        Set[] set = new HashSet[word.size()];
        for (int i = 0; i < set.length; i++)
        {
            set[i] = new HashSet<>();
        }
        for (int i = 0; i < word.size(); i++)
        {
            for (int j = 0; j < word.get(i).length(); j++)
            {
                set[i].add(word.get(i).charAt(j));
            }
        }
        int symbol = 0;
        int min = set[symbol].size();
        for (int i = 0; i < set.length; i++)
        {
            if (min > set[i].size())
            {
                min = set[i].size();
                symbol = 1;
            }
        }
        return word.get(symbol);
    }
}

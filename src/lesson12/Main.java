package lesson12;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main
{
    /**
     * Задача 1:
     * В задании приложен файл Ромео и Джульетта на английском, вычитать его в приложении.
     * Проанализировать и записать в другой файл самое длинное слово.
     */
    public static void main(String[] args)
    {
        String longWord = "";
        String overview;
        File textFile = new File("F:\\IT\\c24-onl\\untitled\\resources\\lesson12\\RomeoAndJuliet.txt");
        try
        {
            Scanner scanner = new Scanner(textFile);
            while (scanner.hasNextLine())
            {
                overview = scanner.next();
                if (overview.length() > longWord.length())
                {
                    longWord = overview;
                }
            }
            File answerFile = new File("F:\\IT\\c24-onl\\untitled\\resources\\lesson12\\LongWord.txt");
            FileWriter writer = new FileWriter(answerFile);
            writer.write(longWord);
            writer.close();
            System.out.println("The longest word: " + longWord);
        }
        catch (FileNotFoundException exception)
        {
            System.out.println("Invalid file path" + exception.getMessage());
        }
        catch (IOException exception)
        {
            System.out.println("Error" + exception.getMessage());
        }
    }
}

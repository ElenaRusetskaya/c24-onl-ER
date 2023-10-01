package lesson15.hw1;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.util.Scanner;

public class Main1
{
    /**
     * Задача 1:
     * Пользователь вводит в консоль дату своего рождения. Программа должна вернуть дату,
     * когда пользователю исполнится 100 лет. Использовать Date/Time API.
     */
    public static void main(String[] args)
    {
        System.out.println("Enter your date of birth: yyyy-MM-dd");
        Scanner scanner = new Scanner(System.in);
        while (true)
        {
            String dateOfBirth = scanner.nextLine();
            LocalDate oneHundredYears = LocalDate.parse(dateOfBirth);
            try
            {
                System.out.println("The year you turn 100:");
                System.out.println(oneHundredYears.plusYears(100));
            }
            catch (DateTimeException exception)
            {
                System.out.println("Incorrect date format!");
            }
        }
    }
}

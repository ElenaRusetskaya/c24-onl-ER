package lesson15.hw5;

import java.util.Scanner;
import java.util.function.Supplier;

public class Main5
{
    /**
     * Задача 5:
     * Используя Supplier написать метод, который будет возвращать введенную с консоли
     * строку задом наперед.
     */
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a suggestion: ");
        StringBuilder stringBuilder = new StringBuilder(scanner.nextLine());
        Supplier <String> supplier = () ->
        {
            System.out.println("The string in the opposite direction: ");
            return stringBuilder.reverse().toString();
        };
        System.out.println(supplier.get());
    }
}

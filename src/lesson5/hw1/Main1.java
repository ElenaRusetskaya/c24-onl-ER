package lesson5.hw1;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main1
        /**
         * Задача 1:
         * 1.1 Создать двумерный массив, заполнить его случайными числами.
         * 1.2 Добавить к каждому значению число, которое пользователь будет вводить с консоли.
         * 1.3 Найти сумму всех получившихся элементов и вывести в консоль.
         */
{
    public static void main(String[] args)
    {
        int[][] arr = new int[5][5];
        Random rnd = new Random();
        for (int i = 0; i < arr.length; i++)
        {
            for (int j = 0; j < arr[i].length; j++)
            {
                arr[i][j] = rnd.nextInt(10);
            }
        }
        for (int i = 0; i < arr.length; i++)
        {
            System.out.println(Arrays.toString(arr[i]));
        }

        int num = inputInt();
        addNumber(arr, num);
        System.out.println(Arrays.deepToString(arr));
        int sum = countSum(arr);
        System.out.println("Sum of values" + sum);
    }

    public static void addNumber(int[][] arr, int number)
    {
        for (int i = 0; i < arr.length; i++)
        {
            for (int j = 0; j < arr.length; j++)
            {
                arr[i][j] += number;
            }
        }
    }
    public static int countSum(int[][] arr)
    {
        int sum = 0;
        for (int i = 0; i < arr.length; i++)
        {
            for (int j = 0; j < arr[i].length; j++)
            {
                sum += arr[i][j];
            }
        }
        return sum;
    }
    public static int inputInt()
    {
        int num;
        while (true)
        {
            try
            {
                System.out.println("Enter a number: ");
                Scanner scanner = new Scanner(System.in);
                if (scanner.hasNextInt())
                {
                    num = scanner.nextInt();
                } else
                {
                    throw new RuntimeException("Incorrect");
                }
                return num;
            } catch (RuntimeException exception)
            {
                System.out.println(exception.getMessage());
                System.out.println();
                System.out.println("Sum of all values");
            }
        }
    }
}

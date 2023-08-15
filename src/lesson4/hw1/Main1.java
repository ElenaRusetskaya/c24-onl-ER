package lesson4.hw1;

import java.util.Arrays;
import java.util.Scanner;

public class Main1
{
    /**
     *Задача 1:
     * Пройти по массиву, вывести все элементы в прямом и в обратном порядке.
     */
    public static void main(String[] args)
    {
        int[] arr = generateRandomArray();
        System.out.println("Your random array");
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println("From the minimum ");
        System.out.println(Arrays.toString(arr));

        int[] array2 = new int[arr.length];
        for (int i = 0, l = arr.length - 1; l >= 0; i++, l--)
        {
            array2[i] = arr[l];
        }
        System.out.println("From the maximum ");
        System.out.println(Arrays.toString(array2));
    }
    public static int[] generateRandomArray()
    {
        Scanner scanner = new Scanner(System.in);
        int arrSize;
        System.out.println("Please intup array size >0:");
        if (scanner.hasNextInt())
        {
            arrSize = scanner.nextInt();
        }
        else
        {
            System.out.println("Incorrect intup.");
            return null;
        }
        if (arrSize <=0)
        {
            System.out.println("Incorrect intup.");
            return null;
        }

        int[] arr = new int[arrSize];
        for (int i = 0; i < arrSize; i++)
        {
            arr[i] = Math.round((float) Math.random() * 10);
        }

        return arr;
    }
}


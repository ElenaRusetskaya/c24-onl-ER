package lesson4.hw5;

import java.util.Arrays;
import java.util.Scanner;

public class Main5
{
    /**
     * Задача 5:
     * Пройти по массиву и поменять местами элементы первый и последний, второй и
     * предпоследний и т.д.
     */
    public static void main(String[] args)
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
            return;
        }
        if (arrSize <=0)
        {
            System.out.println("Incorrect intup.");
            return;
        }

        int[] arr = new int[arrSize];
        for (int i = 0; i < arrSize; i++)
        {
            arr[i] = Math.round((float) Math.random() * 100);
        }
        System.out.println("Your random array:");
        System.out.println(Arrays.toString(arr));
        int one = arr.length - 1;
        int l;
        for (int i = 0; i < arr.length / 2; i++)
        {
            l = arr[i];
            arr[i] = arr[one];
            arr[one] = l;
            one--;
        }
        System.out.println("Modified array: ");
        System.out.println(Arrays.toString(arr));
    }
}

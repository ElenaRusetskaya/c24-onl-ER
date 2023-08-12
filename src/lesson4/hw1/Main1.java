package lesson4.hw1;

import java.util.Arrays;
import java.util.Scanner;

public class Main1
{
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

        System.out.println("Your random array");
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        for (int i = arr.length - 1; i >= 0 ; i--)
        {
            System.out.println(arr[i]);
        }
    }
}

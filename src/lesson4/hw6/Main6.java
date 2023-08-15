package lesson4.hw6;

import java.util.Arrays;

public class Main6
{
    /**
     * Задача 6:
     * Проверить, является ли массив возрастающей последовательностью (каждое следующее
     * число больше предыдущего).
     */
    public static void main(String[] args)
    {
        int[] arr = { 2, 34, 154, 9, 74, 36, 24, 14, 45, 13};
        System.out.println("Your array: ");
        System.out.println(Arrays.toString(arr));
        int l = 0;
        for (int i = 0; i < arr.length - 1; i++)
        {
            if (arr[i] < arr[i + 1])
            {
                l++;
            }
        }
        if (l == arr.length - 1)
        {
            System.out.println("Your array is an increasing sequence");
        }
        else
        {
            System.out.println("Your array is not an increasing sequence");
        }
    }

}


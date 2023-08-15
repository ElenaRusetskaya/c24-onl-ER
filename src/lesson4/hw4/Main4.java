package lesson4.hw4;

import java.util.Arrays;

public class Main4
{
    /**
     *Задача 4:
     * Найти и вывести количество нулевых элементов. Если нулевых элементов нет - вывести
     * сообщение, что их нет
     */
    public static void main(String[] args)
    {
       int[] arr = { 3, 5, 3, 7, 0, 1, 9, 8, 2};
        System.out.println("Your array: ");
        System.out.println(Arrays.toString(arr));
        int count = 0;
        for (int i = 0; i < arr.length; i++)
        {
            if (arr[i] == 0)
            {
                count++;
            }
        }
        if (count == 0)
        {
            System.out.println(" There are no null values in your array");
        }
        else
        {
            System.out.println("Your array " + count + " Zero elements");
        }
    }
}

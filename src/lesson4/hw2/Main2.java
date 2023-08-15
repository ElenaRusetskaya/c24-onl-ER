package lesson4.hw2;

import java.util.Arrays;

public class Main2
{
    /**
     *Задача 2:
     * Найти минимальный-максимальный элементы и вывести в консоль.
     */
    public static void main(String[] args)
    {
        int [] month = {3, 7, 6, 4, 3, 6, 1};

        for (int i = 0; i < month.length; i++)
        {
            System.out.print(month[i] + " ");
        }
        int min = month[0];
        for (int i = 0; i < month.length; i++)
        {
            if (min > month[i])
            {
                min = month[i];
            }
        }
        System.out.println();
        System.out.println(Arrays.toString(month));
        System.out.println("Min is: " + min);

        int max = month[0];
        for (int i = 0; i < month.length; i++)
        {
            if (max < month[i])
            {
                max = month[i];
            }
        }
        System.out.println();
        System.out.println(Arrays.toString(month));
        System.out.println("Max is: " + max);;
    }

}

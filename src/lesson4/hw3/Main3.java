package lesson4.hw3;

import java.util.Arrays;

public class Main3
{
    /**
     *Задача 3:
     * Найти индексы минимального и максимального элементов и вывести в консоль
     */
    public static void main(String[] args)
    {
        double array[] = { 21, 4, 53, 15, 92, 45 };
        int indexOfMax = 0;
        int indexOfMin = 0;
        for (int i = 1; i < array.length; i++)
        {
            if (array[i] > array[indexOfMax])
            {
                indexOfMax = i;
            }
            else if (array[i] < array[indexOfMin])
            {
                indexOfMin = i;
            }
        }
        System.out.println("Your array: ");
        System.out.println(Arrays.toString(array));
        System.out.println("indexMax");
        System.out.println(indexOfMax);
        System.out.println("indexMin");
        System.out.println(indexOfMin);
    }
}

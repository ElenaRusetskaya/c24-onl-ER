package lesson15.hw2;

import java.util.function.Predicate;

public class Main2
{
    /**
     * Задача 2:
     * Используя Predicate среди массива чисел вывести только те, которые являются
     * положительными.
     */
    public static void main(String[] args)
    {
        int[] arr = {-1, 2, -3, 4, -5, 6, -7, 8, -9, 10};
        for (int i : arr)
        {
            Predicate <Integer> predicate = x -> x > 0;
            if (predicate.test(i))
            {
                System.out.print(i + ", ");
            }
        }
    }
}

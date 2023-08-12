package lesson2.hw1;

public class Main1
{
    /**
     *Задача 1:
     * Напишите программу, которая будет принимать на вход число из консоли и на выход
     * будет выводить сообщение четное число или нет. Для определения четности числа
     * используйте операцию получения остатка от деления (операция выглядит так: '% 2').
     */
    public static void main(String[] args)
    {
        int n = 5;
        System.out.println();
        if ( n % 2 == 0)
        {
            System.out.println(1 + n + 2);
        }
        else
        {
            System.out.println(1 + n + 3);
        }
    }
}

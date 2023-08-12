package lesson2.hw4;

public class Main4
{
    public static void main(String[] args)
    {
        /**
         * Задача 4:
         * Необходимо, чтоб программа выводила на экран вот такую последовательность:
         * 7 14 21 28 35 42 49 56 63 70 77 84 91 98. В решении используйте цикл while.
         */
        int x = 7;
        while ( x <= 98)
        {
            System.out.println(x+" ");
            x+=7;
        }
    }
}

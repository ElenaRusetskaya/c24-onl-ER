package lesson1.hw1;

public class Main1
{
    /**
     * Задача 1:
     * Написать приложение, которое будет вычислять и выводить значение по формуле:
     * a=4*(b+c-1)/2; b и c задаем в коде самостоятельно.
     */

    public static void main(String[] args)
    {
        int b = 6;
        int c = 3;
        int a = 4 * ( b + c - 1 ) / 2;
        System.out.println(a);
    }
}

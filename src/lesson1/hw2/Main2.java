package lesson1.hw2;

public class Main2
{
    /**
     * Задача 2:
     * В переменной n хранится двузначное число. Создайте программу, вычисляющую и
     * выводящую на экран сумму цифр n. Например: n =26, в результате мы должны получить 8
     * (2+6).
     */
    public static void main(String[] args)
    {
        int n = 26;
        int a = n % 10;
        int b = (n/10) % 10;
        System.out.println(a + b);
    }
}

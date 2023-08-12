package lesson1.hw3;

public class Main3
{
    /**
     *Задача 3:
     * В переменной n хранится трёхзначное число. Создайте программу, вычисляющую и
     * выводящую на экран сумму цифр n. Например: n =126, в результате мы должны получить
     * 9 (1+2+6).
     */
    public static void main(String[] args)
    {
        int n = 126;
        int a = n % 10;
        int b = (n/10) % 10;
        int c = (n/100) % 10;
        System.out.println(a + b + c);
    }
}

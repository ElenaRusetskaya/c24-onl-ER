package lesson19.hw1;

public class Main1
{
    /**
     * Задача 1:
     * Пользователь вводит с клавиатуры значение в массив. После чего запускаются два
     * потока. Первый поток находит максимум в массиве, второй — минимум. Результаты
     * вычислений возвращаются в метод main().
     */
    public static void main(String[] args)
    {
        int[] arr = { 1, -3, 5, -7, 9, -11, 13, -15};
        ThreadMaxMin x = new ThreadMaxMin(arr);
        ThreadMaxMin y = new ThreadMaxMin(arr);
        try
        {
            x.getThread().join();
            y.getThread().join();
        }
        catch (InterruptedException exception)
        {
            System.out.println("Error!");
        }
        System.out.println("ThreadMax = " + x.getMax());
        System.out.println("ThreadMin = " + y.getMin());
    }
}

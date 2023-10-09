package lesson16.hw1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main1
{
    /**
     * Задача 1:
     * Создать коллекцию класса ArrayList наполнить ее элементами типа Integer. С помощью
     * Stream'ов:
     * - Удалить дубликаты
     * - Оставить только четные элементы
     * - Вывести сумму оставшихся элементов в стриме
     */
    public static void main(String[] args)
    {
        List <Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 5, 3, 1));
        list.stream().
                distinct().
                filter(x -> x % 2 == 0).
                reduce(Integer::sum).ifPresentOrElse(System.out::println, () -> System.out.println("There are no such elements"));
    }
}

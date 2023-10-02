package lesson15.hw4;

import java.util.function.Consumer;

public class Main4
{
    /**
     Задача 4:
     teachmeskills.by
     Используя Consumer реализовать лямбду, которая будет принимать в себя строку в
     формате “*сумма* BYN”(через пробел, вместо *сумма* вставить любое значение), а
     выводить сумму, переведенную сразу в доллары.
     */
    public static void main(String[] args)
    {
        Consumer <String> consumer = string -> System.out.println(Double.parseDouble(string.substring(0, string.length() - 3)) / 3.29);
        System.out.println("Dollar amount:");
        consumer.accept("1000 BYN");
    }
}

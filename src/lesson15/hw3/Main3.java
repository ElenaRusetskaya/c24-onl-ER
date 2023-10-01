package lesson15.hw3;

import java.util.function.Function;

public class Main3
{
    /**
     * Задача 3:
     * Используя Function реализовать лямбду, которая будет принимать в себя строку в
     * формате “*сумма* BYN”(через пробел, вместо *сумма* вставить любое значение), а
     * возвращать сумму, переведенную сразу в доллары.
     */
    public static void main(String[] args)
    {
        Function <String, Double> function = string -> Double.parseDouble(string.substring(0, string.length() - 3)) / 3.29;
        System.out.println("Dollar amount:");
        System.out.println(function.apply("1000 BYN"));
        System.out.println("USD:");
        String result = String.format("%.1f", function.apply("1000 BYN"));
        System.out.print(result);
    }
}

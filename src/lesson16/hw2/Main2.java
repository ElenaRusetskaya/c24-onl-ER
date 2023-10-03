package lesson16.hw2;

import java.util.*;

public class Main2
{
    /**
     * Задача *:
     * Создать набор данных в формате id-name, сохраненный в Map. Необходимо отобрать из
     * этого набора только те данные, id которых попадает в числовой диапазон 1/2/5/8/9/13.
     * Среди отобранных значений отобрать только те, которые имеют нечетное количество
     * букв в имени. После чего вернуть список List имен, записанных буквами задом наперед.
     */
    public static void main(String[] args)
    {
        List <Integer> integerList = List.of(1, 2, 5, 8, 9, 13);
        Map <Integer, String> map = new HashMap<>()
        {
            {
                put(1, "Elena");
                put(2, "Angelica");
                put(3, "Irina");
                put(4, "Vika");
                put(5, "Diane");
            }
        };
        List <String> listOfNamesID = map.entrySet().stream().
                filter(x -> integerList.contains(x.getKey())).
                filter(x -> x.getValue().length() % 2 != 0).
                map(x -> new StringBuilder(x.getValue()).reverse().toString()).toList();
        System.out.println("Names backwards: " + listOfNamesID);
    }
}

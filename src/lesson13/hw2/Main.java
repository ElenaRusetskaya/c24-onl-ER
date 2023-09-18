package lesson13.hw2;

import lesson13.hw2.ListAnimals;

public class Main
{
    /**
     * Задача 2:
     * Создать класс, который будет хранить в себе коллекцию с названиями животных.
     * Реализовать методы удаления и добавления животных по следующим правилам:
     * добавляется всегда в начало коллекции, а удаляется всегда из конца. Показать работу
     * объекта этого класса в main методе другого класса.
     */
    public static void main(String[] args)
    {
        ListAnimals listAnimals = new ListAnimals();
        System.out.println(listAnimals);
        listAnimals.addAnimal("Dog");
        listAnimals.addAnimal("Cat");
        listAnimals.addAnimal("Bird");
        listAnimals.typeAnimal();
        String deleteAnimal = listAnimals.delete();
        if (deleteAnimal != null)
        {
            System.out.println("Deleting the last one in the list: " + deleteAnimal);
            System.out.println();
        }
        else
        {
            System.out.println();
            System.out.println("List after processing:");
        }
        listAnimals.typeAnimal();
    }
}

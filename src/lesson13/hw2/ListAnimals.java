package lesson13.hw2;

import java.util.LinkedList;

public class ListAnimals
{
    private LinkedList<String> listOfAnimal;
    public ListAnimals()
    {
        listOfAnimal = new LinkedList<>();
    }
    public void addAnimal(String type)
    {
        listOfAnimal.addFirst(type);
    }
    public String delete()
    {
        if (!listOfAnimal.isEmpty())
        {
            return listOfAnimal.removeLast();
        }
        else
        {
            return null;
        }
    }
    public void typeAnimal()
    {
        System.out.println("List of how animals were added: ");

        for (String animal : listOfAnimal)
        {
            System.out.println(animal);
        }
    }
}

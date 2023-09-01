package lesson9;

public class Main
{
    /**
     * Задача 1:
     * Создать логически верную иерархию следующих классов: Animal, Dog, Tiger, Rabbit.
     * Переопределить методы voice(), eat(String food) чтобы они выводили верную
     * информацию. Метод eat может принимать “Meat”, “Grass” и другие строки.
     * Например, если мы создадим объект класса Rabbit, вызовем метод eat() и передадим
     * туда “Grass” он должен написать в консоли что любит есть травку. Если передадим “Meat”
     * или другую строку то он будет недоволен
     */
    public static void main(String[] args)
    {
        Animal dog = new Dog();
        Animal rabbit = new Rabbit();
        Animal tiger = new Tiger();

        System.out.println("Dog:");
        dog.voice();
        dog.eat("Meat");
        dog.eat("Grass");
        dog.eat("Fish");
        dog.eat("Mushrooms");
        System.out.println();

        System.out.println("Tiger:");
        tiger.voice();
        tiger.eat("Meat");
        tiger.eat("Grass");
        tiger.eat("Fish");
        tiger.eat("Mushrooms");
        System.out.println();

        System.out.println("Rabbit:");
        rabbit.voice();
        rabbit.eat("Meat");
        rabbit.eat("Grass");
        rabbit.eat("Fish");
        rabbit.eat("Mushrooms");

    }
}

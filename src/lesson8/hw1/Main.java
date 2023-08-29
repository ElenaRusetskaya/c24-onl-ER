package lesson8.hw1;

public class Main
{
    /**
     * Задача 1:
     * Создать классы "Директор", "Рабочий", "Бухгалтер". Реализовать интерфейс с методом,
     * который печатает название должности и имплементировать этот метод в созданные
     * классы
     */
    public static void main(String[] args)
    {
        Staff[] staff = {new Director(), new Worker(), new Accountant()};
        for (Staff staff1 : staff)
        {
            staff1.post();
        }
    }
}

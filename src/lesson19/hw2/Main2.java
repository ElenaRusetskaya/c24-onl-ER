package lesson19.hw2;

public class Main2
{
    /**
     * Задача 2:
     * Сортировка массива цифр в нескольких потоках различными алгоритмами:
     *  сортировка вставками;
     *  сортировка выбором;
     *  сортировка пузырьком.
     * Каждый вид сортировки должен запускаться в отдельном потоке. После вывести
     * результат отсортированных массивов в консоль.
     */
    public static void main(String[] args)
    {
        String[] AS1 = {"5", "112", "66", "245", "32", "74", "52"};
        String[] AS2 = {"5", "112", "66", "245", "32", "74", "52"};
        String[] AS3 = {"5", "112", "66", "245", "32", "74", "52"};

        SortSelection t1 = new SortSelection(AS1, "t1 - SortSelection");
        SortInsertion t2 = new SortInsertion(AS2, "t2 - SortInsertion");
        SortBubble t3 = new SortBubble(AS3, "t3 - SortBubble");

        t1.Start();
        t2.Start();
        t3.Start();

        try
        {
            t1.getThread().join();
            t2.getThread().join();
            t3.getThread().join();
        }
        catch (InterruptedException exception)
        {
            System.out.println("Error: " + exception.getMessage());
            return;
        }
        t1.Print();
        t2.Print();
        t3.Print();
    }
}

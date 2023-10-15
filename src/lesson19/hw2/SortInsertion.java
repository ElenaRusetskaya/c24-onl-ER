package lesson19.hw2;

class SortInsertion extends Thread
{
    private String[] k;
    private Thread thread;
    public SortInsertion (String[] k, String threadName)
    {
        this.k = k;
        thread = new Thread(this, threadName);
    }
    public void Start()
    {
        thread.start();
    }
    public void run()
    {
        System.out.println("Start of sorting: " + thread.getName());
        int i, j;
        String string;
        for (i = 0; i < k.length; i++)
        {
            string = k[i];
            for (j = i -1; j >= 0 && k[j].compareTo(string) < 0; j--)
            {
                k[j + 1] = k[j];
            }
            k[j + 1] = string;
        }
        System.out.println("End of stream: " + thread.getName());
    }
    public Thread getThread()
    {
        return thread;
    }
    public void Print()
    {
        System.out.print(thread.getName() + " - ");
        for (String string : k)
            System.out.print(string + " ");
        System.out.println();
    }
}

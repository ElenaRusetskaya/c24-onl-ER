package lesson19.hw2;

class SortSelection extends Thread
{
    private String[] k;
    private Thread thread;
    public SortSelection (String[] k, String threadName)
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
        int i, j, p;
        String string;
        for (i = 0; i < k.length; i++)
        {
            p = i;
            string = k[i];
            for (j = i + 1; j < k.length; j++)
                if (k[j].compareTo(string) > 0)
                {
                    p = j;
                    string = k[j];
                }
            k[p] = k[i];
            k[i] = string;
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

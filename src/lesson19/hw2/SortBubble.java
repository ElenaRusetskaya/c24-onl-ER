package lesson19.hw2;

class SortBubble extends Thread
{
    private String[] k;
    private Thread thread;
    public SortBubble (String[] k, String threadName)
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
            for (j = k.length - 1; j > i; j--)
            {
                if (k[j - 1].compareTo(k[j]) < 0)
                {
                    string = k[j];
                    k[j] = k[j - 1];
                    k[j - 1] = string;
                }
            }
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

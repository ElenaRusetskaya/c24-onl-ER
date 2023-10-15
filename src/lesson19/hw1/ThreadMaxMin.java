package lesson19.hw1;

class ThreadMaxMin implements Runnable
{
    private Thread thread;
    private int[] t;
    private int maximum;
    private int minimum;

    public ThreadMaxMin(int[] tMaxMin)
    {
        t = tMaxMin;
        thread = new Thread(this, "Thread.");
        thread.start();
    }
    public void run()
    {
        int max = t[0];
        int min = t[0];
        for (int i = 1; i < t.length; i++)
        {
            if (max < t[i]) max = t[i];
            if (min > t[i]) min = t[i];
        }
        maximum = max;
        minimum = min;
    }
    public Thread getThread()
    {
        return thread;
    }
    public int getMax()
    {
        return maximum;
    }
    public int getMin()
    {
        return minimum;
    }
}

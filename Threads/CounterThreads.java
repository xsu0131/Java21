package Threads;

public class CounterThreads extends Thread
{
    private String name;
    private Counter counter;
    CounterThreads(String name, Counter counter)
    {
        this.name = name;
        this.counter = counter;
    }

    @Override
    public void run()
    {
        // every thread runs increment when they start()
        counter.increment();
        System.out.println(name + " count: " + counter.getCount());
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();

        int max = 10;
        while (counter.getCount() < max)
        {
            CounterThreads t1 = new CounterThreads("Thread-1", counter);
            CounterThreads t2 = new CounterThreads("Thread-2", counter);
            CounterThreads t3 = new CounterThreads("Thread-3", counter);

            t1.start();
            t1.join();

            t2.start();
            t2.join();

            t3.start();
            t3.join();
        }
    }

}

class Counter
{
    private int count;

    public synchronized void increment()
    {
        count++;
    }

    public synchronized int getCount()
    {
        return count;
    }

}

class Counter{
    private int count = 0;

    public synchronized void increment(){
        count++;
    }

    public int getCount(){
        return count;
    }
}
class Myworker implements Runnable{
    private Counter counter;
    private String name;

    public Myworker(Counter c, String n)
    {
        this.counter = c;
        this.name = n;
    }

    public void run(){
        for(int i=1;i<=1000;i++)
        {
            counter.increment();
        }
        System.out.println(name+" khatam ho gaya!");
    }
}
public class MultiThreadingDemo {
    public static void main(String args[])
    {

        Counter sharedCounter = new Counter();
        Thread t1 = new Thread(new Myworker(sharedCounter, "Thread-A"));
        Thread t2 = new Thread(new Myworker(sharedCounter, "Thread-B"));
        Thread t3 = new Thread(new Myworker(sharedCounter, "Thread-C"));

        t1.start();
        t2.start();
        t3.start(); 

        //Main thread wait karega jabtak teeno khatam na ho jaaye
        try{
            t1.join();
            t2.join();
            t3.join();
        }catch(InterruptedException e)
        {
            e.printStackTrace();
        }
        System.out.println("Final Count = "+sharedCounter.getCount());
    }
}

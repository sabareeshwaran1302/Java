/*
Write a Java program by implementing the Runnable interface 
to create three threads that print the following number patterns 
simultaneously. Use sleep() to introduce a delay between numbers. 
Demonstrate setName(), setPriority(), isAlive(), and join(). 
Thread A: 2 4 6 8 10 
Thread B: 3 6 9 12 15 
Thread C: 5 10 15 20 25 
Assign different priorities to the three threads and 
display the priority of each thread.

*/

class NumberPattern implements Runnable
{
    public void run()
    {
        Thread t = Thread.currentThread();
        System.out.println(t.getName() + " Priority : " + t.getPriority());

        if(t.getName().equals("Thread A"))
        {
            for(int i = 2;i<=10;i+=2)
            {
                System.out.println(t.getName() + " : " + i );
                try
                {
                    Thread.sleep(1000);
                }
                catch(InterruptedException e)
                {
                    System.out.println(e);
                }
            }
        }
        else if(t.getName().equals("Thread B"))
        {
            for(int i = 3;i<=15;i+=3)
            {
                System.out.println(t.getName() + " : " + i );
                try
                {
                    Thread.sleep(2000);
                }
                catch(InterruptedException e)
                {
                    System.out.println(e);
                }
            }
        }
        else if(t.getName().equals("Thread C"))
        {
            for(int i = 5;i<=25;i+=5)
            {
                System.out.println(t.getName() + " : " + i );
                try
                {
                    Thread.sleep(3000);
                }
                catch(InterruptedException e)
                {
                    System.out.println(e);
                }
            }
        }

    }
        
}

public class Lab_qn1
{
    public static void main(String[] args)
    {
        NumberPattern obj = new NumberPattern();

        Thread t1 = new Thread(obj);
        Thread t2 = new Thread(obj);
        Thread t3 = new Thread(obj);

        t1.setName("Thread A");
        t2.setName("Thread B");
        t3.setName("Thread C");

        t1.setPriority(3);
        t2.setPriority(5);
        t3.setPriority(2);

        System.out.println("All Threads Started Executing : \n");

        t1.start();
        t2.start();
        t3.start();

        System.out.println("Thread A alive :"+t1.isAlive());
        System.out.println("Thread B alive : " + t2.isAlive());
        System.out.println("Thread C alive : " + t3.isAlive());

        try
        {
            t1.join();
            t2.join();
            t3.join();
        }
        catch(InterruptedException e)
        {
            System.out.println(e);
        }

        System.out.println("All Threads Completed.\n");
    }
}
/*

Question 3 :

Write a Java program using the Runnable interface to create two threads.

Thread 1 should print odd numbers from 1 to 9. 
Thread 2 should print even numbers from 2 to 10. 

Each thread should:
• Have a different name. 
• Have a different priority. 
• Use sleep() between numbers. 
• Display its name and priority along with the numbers.

*/

class Pattern implements Runnable
{
    public void run()
    {
        Thread t = Thread.currentThread();

        System.out.println(t.getName() + " Priority : " + t.getPriority());

        if(t.getName().equals("Odd Thread"))
        {
            for(int i = 1 ; i <= 9 ; i+=2)
            {
                System.out.println(t.getName() + " : " + "Priority : " + t.getPriority() + " : " + i);

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
        if(t.getName().equals("Even Thread"))
        {
            for(int i = 2 ; i <= 10 ; i+=2)
            {
                System.out.println(t.getName() + " : " + "Priority : " + t.getPriority() + " : " + i);

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
    }
}

public class Lab_qn3 
{
    public static void main(String[] args)
    {
        Pattern obj = new Pattern();

        Thread t1 = new Thread(obj);
        Thread t2 = new Thread(obj);

        t1.setName("Odd Thread");
        t2.setName("Even Thread");

        t1.setPriority(5);
        t2.setPriority(7);

        System.out.println("All threads Started Executing.\n");

        t1.start();
        t2.start();

        try
        {
            t1.join();
            t2.join();
        }
        catch(InterruptedException e)
        {
            System.out.println(e);
        }

        System.out.println("All threads Completed Execution.\n");
    }
    
}



/*

Here t1.join() and t2.join() are telling the main() thread to wait until t1 and t2 finishes.
The statements under t1.join() and t2.join() will only execute after t1 and t2 finishes.

If we need t2 to execute only after t1 finishes :

t1.start();
t1.join();

t2.start();
t2.join();

Here t2 is not started till t1 finishes.

*/


public class Lab_qn3 
{
    public static void main(String[] args)
    {
        Pattern obj = new Pattern();

        Thread t1 = new Thread(obj);
        Thread t2 = new Thread(obj);

        t1.setName("Odd Thread");
        t2.setName("Even Thread");

        t1.setPriority(5);
        t2.setPriority(7);

        System.out.println("All threads Started Executing.\n");

        try // The only difference is try block.
        {
            t1.start();
            t1.join();

            t2.start();
            t2.join();
        }
        catch(InterruptedException e)
        {
            System.out.println(e);
        }

        System.out.println("All threads Completed Execution.\n");
    }
    
}

/*

Question 2 :
Write a Java program by extending the Thread class to 
create three threads that print different multiplication sequences. 
Each thread should use sleep() between outputs. 

Thread 1: 2 4 6 8 10 
Thread 2: 5 10 15 20 25 
Thread 3: 10 20 30 40 50 

Set different priorities for the threads and 
demonstrate the use of isAlive() and join(). 
Display a message after all three threads complete execution.


*/
class Thread1 extends Thread
{
    public void run()
    {
        for(int i = 2 ; i <= 10 ; i+=2)
        {
            System.out.println("Thread 1 : " + i );

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

}

class Thread2 extends Thread
{
    public void run()
    {
        for(int i = 5 ; i <= 25 ; i+=5)
        {
            System.out.println("Thread 2 : " + i );

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

class Thread3 extends Thread
{
    public void run()
    {
        for(int i = 10 ; i <= 50 ; i+=10)
        {
            System.out.println("Thread 3 : " + i );

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
public class Lab_qn2 
{
    public static void main(String[] args)
    {
        Thread1 t1 = new Thread1();
        Thread2 t2 = new Thread2();
        Thread3 t3 = new Thread3();

        t1.setPriority(5);
        t2.setPriority(6);
        t3.setPriority(4);

        System.out.println("Thread 1 Alive  : " + t1.isAlive());
        System.out.println("Thread 2 Alive  : " + t2.isAlive());
        System.out.println("Thread 3 Alive  : " + t3.isAlive());

        System.out.println("\n\n");

        System.out.println("All Threads Started Executing : \n");

        t1.start();
        t2.start();
        t3.start();

        System.out.println("Thread 1 Alive  : " + t1.isAlive());
        System.out.println("Thread 2 Alive  : " + t2.isAlive());
        System.out.println("Thread 3 Alive  : " + t3.isAlive());

        System.out.println("\n\n");


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

        System.out.println("All threads Completed Execution.\n\n");

    }
    
}

/*
You could also solve the same question using one Thread class and give each object different information.
For example:

*/

class MyThread extends Thread
{
    int n;

    MyThread(int n)
    {
        this.n = n;
    }

    public void run()
    {
        for(int i = n; i <= n * 5; i += n)
        {
            System.out.println(getName() + " : " + i);
        }
    }
}

//Then

MyThread t1 = new MyThread(2);
MyThread t2 = new MyThread(5);
MyThread t3 = new MyThread(10);

t1.start();
t2.start();
t3.start();

/*

This produces:
Thread-0 : 2
Thread-0 : 4
...
Thread-1 : 5
Thread-1 : 10
...
Thread-2 : 10
Thread-2 : 20
...

So both approaches are valid.


*/




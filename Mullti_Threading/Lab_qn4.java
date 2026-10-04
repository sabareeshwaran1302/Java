/*

Question 4 : 

Write a Java program using the Producer–Consumer synchronization problem to 
simulate a petrol station. 

Requirements: 
1. Create a Producer thread representing the fuel pump. 
2. Create a Consumer thread representing vehicles refueling. 
3. The producer should add two units of fuel to the storage tank. 
4. The consumer should consume one unit of fuel at a time. 
5. When the available fuel becomes empty, the producer should supply the next two units. 
6. Use synchronized, wait(), and notify() for inter-thread communication. 
7. Display the fuel level after every production and consumption. 

Expected Output Pattern: 
Producer: Added 1 unit of fuel. Fuel level: 1 
Producer: Added 1 unit of fuel. Fuel level: 2 
Consumer: Consumed 1 unit of fuel. Fuel level: 1 
Consumer: Consumed 1 unit of fuel. Fuel level: 0 
Producer: Added 1 unit of fuel. Fuel level: 1 
Producer: Added 1 unit of fuel. Fuel level: 2 
Consumer: Consumed 1 unit of fuel. Fuel level: 1 
Consumer: Consumed 1 unit of fuel. Fuel level: 0

*/

class PetrolStation
{
    private int fuel = 0;

    synchronized void produce()
    {
        while(fuel >= 2)
        {
            try
            {
                wait();
            }
            catch(InterruptedException e)
            {
                System.out.println(e);
            }
        }

        fuel++;
        System.out.println("Producer Added 1 Unit.");
        System.out.println("Fuel Level : " + fuel);

        notify();
    }

    synchronized void consume()
    {
        while(fuel <= 0)
        {
            try
            {
                wait();
            }
            catch(InterruptedException e)
            {
                System.out.println(e);
            }
        }

        fuel--;
        System.out.println("Consumer consumed 1 Unit.");
        System.out.println("Fuel Level : " + fuel);

        notify();
    }
}

class Producer extends Thread
{
    PetrolStation station;

    Producer(PetrolStation station)
    {
        this.station = station;
    }

    public void run()
    {
        for(int i = 1 ; i <= 4 ; i++)
        {
            station.produce();

            try
            {
                Thread.sleep(100);
            }
            catch(InterruptedException e)
            {
                System.out.println(e);
            }
        }

    }
}

class Consumer extends Thread
{
    PetrolStation station;

    Consumer(PetrolStation station)
    {
        this.station = station;
    }

    public void run()
    {
        for(int i = 1 ; i <= 4 ; i++)
        {
            station.consume();

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


public class Lab_qn4 
{
    public static void main(String[] args) 
    {
        PetrolStation obj = new PetrolStation();

        Producer producer = new Producer(obj);
        Consumer consumer = new Consumer(obj);

        System.out.println("\nProducer and Consumer Started Execution.\n");

        producer.start();
        consumer.start();

        try
        {
            producer.join();
            consumer.join();
        }
        catch(InterruptedException e)
        {
            System.out.println(e);
        }

        System.out.println("\nProducer and Consumer Finished Execution.\n");
        
    }
    
}

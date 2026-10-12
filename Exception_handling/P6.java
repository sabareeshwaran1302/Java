/*
User-defined / Custom Exception  : 
Java allows us to create our own exception class.

*/


class AgeException extends Exception
{
    AgeException(String message)
    {
        super(message);
    }
}


public class P6 
{
    public static void main(String[] args)
    {
        try
        {
            int age = 15;
            if(age < 18)
            {
                throw new AgeException("Age is not Eligible.");
            }
            System.out.println("Eligible.");
        }
        catch(AgeException e)
        {
            System.out.println(e.getMessage());
        }
    }
    
}

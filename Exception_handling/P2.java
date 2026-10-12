public class P2 
{
    public static void main(String[] args) 
    {
        try
        {
            System.out.println("10/5 = " + 10/5);
            System.out.println("10/0 = " + 10/0);

            System.out.println("Statement after exception.");
        }

        catch(ArithmeticException e)
        {
            System.out.println("\n");
            System.out.println("e.getMessage()  :   " + e.getMessage());
            System.out.println("\n");

            System.out.println("e.toString()   :  " + e.toString());
            System.out.println("\n");
            
            System.out.println("e.printStaackTree() :" );
            e.printStackTrace();
            System.out.println("\n");
        }

        
    }
    
}

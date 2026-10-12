/*
Nested try-catch : 
A try block can be placed inside another try block.


*/
public class P5 {
    public static void main(String[] args) 
    {
        try
        {
            try
            {
                int a = 10/0;
            }
            catch(ArithmeticException e) // only gets executed
            { // error is handled by this catch
                System.out.println("Inside block");
            }
        }
        catch(ArithmeticException e) // Not get executed
        {
            System.out.println("Outer block");
        }
    }
}
    
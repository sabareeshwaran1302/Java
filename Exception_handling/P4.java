/*
throws :
throws
throws is used in a method declaration to indicate that the method may pass an exception to its caller.

Syntax
returnType methodName() throws ExceptionType {
}


*/

public class P4 
{
    public static void test() throws ArithmeticException
    {
        int a = 10/0;
    }
    public static void main(String[] args) {
        try
        {
            test();
        }
        catch(ArithmeticException e)
        {
            e.printStackTrace();
        }
    }
    
}

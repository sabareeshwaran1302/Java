/*
throw : 
throw is used when we explicitly want to create/throw an exception.

Syntax
throw new ExceptionType("message");


Explanation
Java normally doesn't automatically throw this particular exception because of our age condition.
We explicitly tell Java:
    throw new ArithmeticException(...)

So we are saying:
"An invalid argument has been supplied; throw an exception."

*/
public class P3 
{
    public static void main(String[] args) 
    {
        
            int age = 15;

            if(age < 18)
            {
                throw new ArithmeticException("Age is not eligible . ");
// if any statement is given here , it will cause an compilation error because it will be an unreachable/unexecutable statement.
// we can't have any unreachable statements inside a same block
// we can have statements outside this if block.
            
            }

            System.out.println("Outside try block.");
        
    }
    
}

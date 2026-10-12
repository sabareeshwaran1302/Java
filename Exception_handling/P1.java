/*
Exception Handling :

try {
    // risky code
}
catch (ExceptionType e) {
    // handling code
}



e.getMessage()
catch (ArithmeticException e) {
    System.out.println(e.getMessage());
}
Output:
/ by zero


e.toString()
System.out.println(e.toString());
Output will contain the exception type and message.


e.printStackTrace()
e.printStackTrace();
It prints detailed information about where the exception occurred.



Important rule
Put specific exceptions before general exceptions.

Correct:
catch (ArithmeticException e) {
}
catch (Exception e) {
}

Incorrect:
catch (Exception e) {
}
catch (ArithmeticException e) {
}

Because Exception can already catch ArithmeticException.



finally
The finally block contains code that normally executes whether an exception occurs or not.

Syntax
try {
    // code
}
catch (Exception e) {
    // handling
}
finally {
    // always executed
}



try	    Contains code that may cause an exception
catch	Handles the exception
finally	Executes cleanup code
throw	Explicitly throws an exception
throws	Declares that a method may throw an exception


A try block cannot normally be used alone.
It must be followed by either:
catch
or
finally


getMessage()	    Error message
toString()	        Exception type + message
printStackTrace()	Detailed exception information including location

*/
public class P1
{
    public static void main(String args[])
    {
        int arr[]={1,2,3};

        try
        {
            System.out.println("arr[2] = " + arr[0]);
            System.out.println("arr[3] = " + arr[3]);

            System.out.println("Statements after exception."); // will not be executed if exception is caught.
        }
        catch(ArrayIndexOutOfBoundsException e )
        {
            System.out.println("e.getMessage()" + e.getMessage());
            System.out.println("e.toString()" + e.toString());
            System.out.println("e.printStaackTree() :" );
            e.printStackTrace();
        }
        finally
        {
            System.out.println("Finally Block executed.");
        }
    }
}



/*

3.NullPointerException
Occurs when you try to use an object reference that contains null.

String name = null;
System.out.println(name.length());

Output:
NullPointerException

4. NumberFormatException
Occurs when an invalid String is converted to a number.

String s = "abc";
int n = Integer.parseInt(s);

Output:
NumberFormatException

*/


/*
I/O streams : 
Java already provides three standard streams:
    System.in
    System.out
    System.err

I/O stream : 
    1.Byte Stream
    2.Character Stream

Byte Stream : 
Byte Stream is used to read and write data byte by byte.

The main classes are:
InputStream  → Reading bytes
OutputStream → Writing bytes


printStackTrace(), is used to display detailed information about an exception.
    Syntax
    catch (IOException e) 
    {
        e.printStackTrace();
    }

What does it print?
It shows:
- Exception type
- Error message
- The exact line where the exception occurred
- The method/class call sequence that led to the error


FileInput Stream  


*/


import java.io.*;
public class P1 
{ // throws IOException is very important for every File handling programme.

    public static void main(String[] args)
    {
        try
        {
            FileInputStream fis = new FileInputStream("input.txt");
            int data;

            while((data = fis.read()) != -1) // read() returns -1 when the end of the stream is reached.
            {
                System.out.print((char)data);
            }

            fis.close();
        }

        catch(IOException e)
        {
            e.printStackTrace();
        }
        
    }
    
}

/*
read() gives us a numeric value.
We convert that value to a character:
    (char) data

65 → A
66 → B
67 → C
*/

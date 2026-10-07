
// FileOutput Stream : 


import java.io.*;
public class P2
{
    public static void main(String[] args) 
    {
        try
        {
            FileOutputStream fos = new FileOutputStream("output.txt");

            String s = "Hello \nHi.\nThis is Sabari.";

            fos.write(s.getBytes());

            fos.close();

        }

        catch(IOException e)
        {
            e.printStackTrace();
        }
        
        
    }
}

/*

getBytes() converts the String into bytes.
Conceptually:
    "ABC"
    ↓
    getBytes()
    ↓
    65 66 67

Then:
    fos.write(...)
writes those bytes to the file.


Consider:
FileOutputStream fos = new FileOutputStream("output.txt");

If output.txt already exists, writing this way normally overwrites its contents.
ie. Delete all the content and rewrites the given text.


If you want to append instead:
FileOutputStream fos = new FileOutputStream("output.txt", true);

    The true means:
        Append new data instead of replacing existing data.

Example:
Existing file:
Hello

Then:
FileOutputStream fos = new FileOutputStream("output.txt", true);

fos.write(" Java".getBytes());

File becomes:
    Hello Java

*/

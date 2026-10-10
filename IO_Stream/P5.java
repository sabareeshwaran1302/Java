/*
BufferedReader and BufferedWriter : 

We already know:
FileReader  → reads characters
FileWriter  → writes characters

But reading/writing one character at a time can be inefficient.
That's where buffering comes in.


1. What is a buffer?
A buffer is a temporary area in memory used to hold data while it is being transferred.

Think of carrying water.
Without a buffer:
File → get 1 character → Program
File → get 1 character → Program
File → get 1 character → Program
File → get 1 character → Program

With a buffer:
    File
    ↓
    Buffer
    ↓
    Program

A group of data is handled together, making I/O more efficient.

Buffered Reader  :
BufferedReader is used for efficiently reading character data.

The structure is:
    File
    ↓
    FileReader
    ↓
    BufferedReader
    ↓
    Program

Syntax
BufferedReader br = new BufferedReader ( new FileReader ("input.txt") );

Notice something important:
new BufferedReader( new FileReader("input.txt"));

BufferedReader is wrapping the FileReader.

BufferedReader : 
*/

import java.io.*;

public class P5 
{
    public static void main(String[] args) 
    {
        try
        {
            BufferedReader br = new BufferedReader(new FileReader("input.txt"));

            String s;

            while((s = br.readLine()) != null )
            {
                System.out.println(s);
            }

            br.close();

        }
        catch(IOException e)
        {
            e.printStackTrace();
        }

    }
    
}

/*

Remember :

read()     → int
readLine() → String

And their end conditions:
read()     → -1
readLine() → null

*/
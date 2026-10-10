/*
BufferedWriter : 
Syntax :
BufferedWriter bw = new BufferedWriter(new FileWriter("output.txt"));


*/

import java.io.*;

public class P6 
{
    public static void main(String[] args)
    {
        try
        {
            BufferedWriter bw = new BufferedWriter(new FileWriter("output.txt"));

            String s = "Hello\nWelcome\nNamaste ! \n !! ";

            bw.write(s);

            bw.close();

            System.out.println("File Copied Successfully.");

        }

        catch(IOException e)
        {
            e.printStackTrace();
        }
        
    }
}

/*

We can also use :
    bw.write("Hello Java");
    bw.newLine();
    bw.write("I am learning I/O");

Instead of manually writing:
    bw.write("\n");

you can use:
    bw.newLine();

Example:
    bw.write("Hello");
    bw.newLine();
    bw.write("Java");

File:
    Hello
    Java


Just like FileWriter, you can append by passing true to the underlying FileWriter.
    BufferedWriter bw = new BufferedWriter( new FileWriter("output.txt", true));


*/

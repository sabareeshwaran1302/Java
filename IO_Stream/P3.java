/*
Character Stream : 
The main classes are:
Reader → reading characters
Writer → writing characters

Remember:
Input  → Reader
Output → Writer

Reader
   |
   └── FileReader

So if you want to read a text file, you can use: FileReader

*/

import java.io.*;
public class P3 
{
    public static void main(String[] args)
    {
        try
        {
            FileReader fr = new FileReader("input.txt");

            int ch;

            while((ch = fr.read()) != -1 )
            {
                System.out.print((char)ch);
            }
            
            fr.close();

        }

        catch(IOException e)
        {
            e.printStackTrace();
        }  
    }
    
}

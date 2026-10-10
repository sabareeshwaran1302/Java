/*

Writer class : 
Writer is used to write character/text data.
Hierarchy:
        Writer
        |
        └── FileWriter

FileWriter :

*/
import java.io.*;

public class P4 
{
    public static void main(String[] args) 
    {
        try
        {
            FileWriter fw = new FileWriter("output.txt");

            String s = "Sabari ";

            fw.write(s); // or fw.write("Sabari");

            fw.close();

        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
    }  
}

/*

For appending : 
FileWriter fw = new FileWriter("filename.txt", true);


When should I use which?


Text file
For example:
    .txt
    .csv

Character streams are generally appropriate:
    FileReader
    FileWriter

Binary file
For example:
    .jpg
    .png
    .mp3
    .pdf

Byte streams are generally appropriate:
    FileInputStream
    FileOutputStream

Think:
Text → Character Stream
Binary → Byte Stream


*/
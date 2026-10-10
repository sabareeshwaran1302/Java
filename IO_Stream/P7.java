
// Copy one text file to another

import java.io.*;

public class P7 
{
    public static void main(String[] args)
    {
        try
        {
            BufferedReader br = new BufferedReader(new FileReader("input.txt"));

        BufferedWriter bw = new BufferedWriter(new FileWriter("output.txt"));

        String line;

        while((line = br.readLine()) != null)
        {
            bw.write(line);
            bw.newLine(); // If newLine() is not used , bw writes each line continuously.
        }

        br.close();
        bw.close();
        
        }

        catch(IOException e )
        {
            e.printStackTrace();
        }
    }
        
    

}

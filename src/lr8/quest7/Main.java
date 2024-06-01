package lr8.quest7;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = null;
        BufferedWriter out = null;
        try {
            br = new BufferedReader(new FileReader("src/lisen4/numIsh.txt"), 1024);
            out = new BufferedWriter(new FileWriter("src/lisen7/numRez_7.txt"));
            int lineCount = 0;
            String s;
            while ((s = br.readLine())!=null)
            {
                lineCount++;
                System.out.println(lineCount +":"+s);
                out.write(s);
                out.newLine();
            }
        }catch (IOException e)
        {
            System.out.println("False");
        }
        finally {
            br.close();
            out.flush();
            out.close();
        }
    }
}
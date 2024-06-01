package lr8.quest2;

import java.awt.*;
import java.io.*;
import java.net.URL;
public class Test2 {
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static void readAllByte(InputStream in) throws IOException {
        while (true) {
            int oneByte = in.read();
            if (oneByte != -1) {
                System.out.print(ANSI_GREEN+(char) oneByte);
            } else {
                System.out.print("\n"+  ANSI_YELLOW + "end" + ANSI_GREEN);
                break;
            }
        }
    }

    public static void main(String[] args) throws IOException {
        try {
            InputStream imFile = new FileInputStream("src/lisen2/MyFile1.txt");

            readAllByte(imFile);
            System.out.print("\n\n\n");
            imFile.close();

            InputStream inUrl = new URL("http://google.com").openStream();
            readAllByte(inUrl);
            System.out.print("\n\n\n");
            inUrl.close();

            InputStream inArray = new ByteArrayInputStream(new byte[]{32,42,52,66,99});
            readAllByte(inArray);
            System.out.print("\n\n\n");
            inArray.close();


        }catch (IOException e)
        {System.out.print("False"+e);}
    }
}

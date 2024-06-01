package lr8.quest3;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
public class Test {
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static void readAllByte(InputStream in) throws IOException {
        byte[] butt = new byte[5];
        while (true) {
            int oneByte = in.read(butt);
            if (oneByte != -1) {
                System.out.println(ANSI_GREEN+"Kolvo "+ANSI_YELLOW+oneByte+ANSI_GREEN+",buff "+ANSI_YELLOW+
                        Arrays.toString(butt)+ANSI_GREEN+",str= "+ANSI_YELLOW+
                        new String(butt,0,oneByte,"cp1251"));
            } else {
                break;
            }
        }
    }
    public static void main(String[]args)throws IOException
    {
        String fileName ="src/lisen2/MyFile1.txt";
        InputStream inFile =null;
        try
        {
            inFile = new FileInputStream(fileName);
            readAllByte(inFile);
        }catch (IOException e)
        {
            System.out.println("False" +fileName+e);
        }finally {
            if (inFile!=null)
            {
                try {
                    inFile.close();
                }catch (IOException r)
                {

                }
            }
        }
    }
}

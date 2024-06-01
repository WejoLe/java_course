package lr7;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.io.UnsupportedEncodingException;
public class Test4 {
    public static final String ANSI_RED = "\u001b[31;1m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";

    public static void main(String[] args) throws UnsupportedEncodingException {

        //SuperClasT1 str11 = new SuperClasT1(ANSI_PURPLE+"Передаём 1");
        //SuperClasT1.SubClasT1 str12 = new SuperClasT1.SubClasT1(SuperClasT1.str1, ANSI_PURPLE+"Передаём 2");
        //SuperClasT1.SubClasT2 str13 = new SuperClasT1.SubClasT2(SuperClasT1.str1,SuperClasT1.str2,ANSI_PURPLE+"Передаём 3");


        //System.out.println(str11+"\n"+str12+"\n"+str13);



        class1 str11 = new class1('C');
        class2 str12 = new class2("'Какойто текст'");

        class3 str13 = new class3(43434);



    }


    public static class class1 {
        private static char str1;
        private static char[] str1kopi;

        class1(char str11) {
            str1 = str11;
            ser(str1);
            System.out.println("Передан в класс (char): " + str1 + " --> " + Arrays.toString(ser(str11)));


        }

        public char[] ser(char str11) {


            String convert = "Копия из класс (char): " + str11;
            char[] str112 = convert.toCharArray();
            str1kopi = str112;
            return str112;

        }
    }

    public static class class2 {
        private static String str2;

        class2(String str11) {
            str2 = str11;
            ser(str2);
            System.out.println("Передан в класс (String): " + str2 + " --> " + ser(str2));

        }

        public String ser(String str22) {

            String sCAFV1 = "Копия из класс (String): " + str22;
            return sCAFV1;

        }
    }

    public static class class3 {
        private static int str3;

        class3(int str11) throws UnsupportedEncodingException {
            str3 = str11;
            ser(str3);
            System.out.println("Передан в класс (int): " + str3+ " --> " + "Копия из класс (int): "+ser(str3));

        }

        public int ser(int str33) throws UnsupportedEncodingException {

            int sCAFV1;
            sCAFV1 =  str3;
            return sCAFV1;
        }

    }
}

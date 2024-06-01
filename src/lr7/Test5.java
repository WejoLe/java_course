package lr7;

import java.io.UnsupportedEncodingException;
import java.util.Objects;
import java.util.Scanner;
public class Test5 {
    public static final String ANSI_RED = "\u001b[31;1m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static void main(String[] args)  {

        System.out.println(" В видите текст который попадёт в superClass ");
        Scanner scanner = new Scanner(System.in);
        String k = scanner.nextLine();

        SuperClasT1 str12 = new SuperClasT1(k);
        String re = str12.field;

        Sub1 Sub11 = new Sub1(re, 19);
        Sub2 Sub12 = new Sub2(re,  '!');


    }
    private static class SuperClasT1 {
        protected String field;



        SuperClasT1(String str11) {
            field = str11;

            System.out.println(ANSI_RED+"Наименование класса: "+this.getClass().getSimpleName()+ANSI_PURPLE+" String "+ field+" ");



        }



    }


    private static class Sub1 extends SuperClasT1
    {
        protected static int fieldInt;

        Sub1(String str11, int StrInt11 ) {
            super(str11);
            field = str11;
            fieldInt = StrInt11;
            System.out.println(ANSI_GREEN+"Наименование класса: "+ ANSI_RED+this.getClass().getSimpleName()+ANSI_GREEN +" String из SUPER class "+ ANSI_RED+ field+ANSI_GREEN +ANSI_PURPLE+" Int "+fieldInt);

        }
    }
    private static class Sub2 extends SuperClasT1
    {
        protected static char fieldChar;

        Sub2(String str11, char StrInt11 ) {
            super(str11);
            field = str11;
            fieldChar=StrInt11;
            System.out.println(ANSI_BLUE+"Наименование класса: "+ ANSI_RED+this.getClass().getSimpleName()+ANSI_BLUE +" String из SUPER class "+ ANSI_RED+ field +ANSI_PURPLE+" char "+fieldChar);

        }
    }
}

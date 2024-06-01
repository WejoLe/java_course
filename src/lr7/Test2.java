package lr7;

import java.util.Scanner;
public class Test2 {
    public static final String ANSI_RED = "\u001b[31;1m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static void main(String[] args) {

        //SuperClasT1 str11 = new SuperClasT1(ANSI_PURPLE+"Передаём 1");
        //SuperClasT1.SubClasT1 str12 = new SuperClasT1.SubClasT1(SuperClasT1.str1, ANSI_PURPLE+"Передаём 2");
        //SuperClasT1.SubClasT2 str13 = new SuperClasT1.SubClasT2(SuperClasT1.str1,SuperClasT1.str2,ANSI_PURPLE+"Передаём 3");


        //System.out.println(str11+"\n"+str12+"\n"+str13);

        System.out.println(" В видите текст который попадёт superClass ");
        Scanner scanner = new Scanner(System.in);
        String k = scanner.nextLine();

        SuperClasT1 str11 = new SuperClasT1(ANSI_PURPLE+k);
        SuperClasT1 animal1 = new SuperClasT1.SubClasT1(str11.toString(),SuperClasT1.str2);
        System.out.println( animal1);
    }


    private static class SuperClasT1 {

        private static String str1;
        private static String str3;
        private static int str2;
        private static int str21;

        SuperClasT1(String str11) {
            str1 = str11;
            str3 = str11;
            str2 = str1.length();
        }


        public String toString() {

            String sCAFV1;

            sCAFV1 =  str1 +  " пераданный  из SuperKlass ";
            return sCAFV1;

        }


        public static class SubClasT1 extends SuperClasT1 {


            SubClasT1(String str11, int sre) {
                super(str11);
                str1 = str11;
                str2 = sre;


            }

            @Override
            public String toString() {

                String sCAFV2;
                str21 = str1.length();
                sCAFV2 = ANSI_GREEN + "\n Длина строки  "+ str2+ ANSI_BLUE +" Текст ( " +str3+ ","+ANSI_GREEN+" Длина этой строки "+str21+ANSI_BLUE + ")";
                return sCAFV2;

            }
        }


    }
}

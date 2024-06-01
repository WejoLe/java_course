package lr7;

public class Test3 {
    public static final String ANSI_RED = "\u001b[31;1m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static void main(String[] args) {

        SuperClasT1 str11 = new SuperClasT1(ANSI_PURPLE+"Передаём 1");
        SuperClasT1.SubClasT1 str12 = new SuperClasT1.SubClasT1(SuperClasT1.str1, ANSI_PURPLE+"Передаём 2");
        SuperClasT1.SubClasT2 str13 = new SuperClasT1.SubClasT2(SuperClasT1.str1, SuperClasT1.str2,ANSI_PURPLE+"Передаём 3");

        System.out.println(str11+"\n"+str12+"\n"+str13);
    }


    private static class SuperClasT1 {
        private static int str=-3;
        private static String str1;
        private static String str2;
        private static String str3;

        SuperClasT1(String str11) {
            str1 = str11;

        }

        @Override
        public String toString() {
            String sCAFV;
            str = str + 1;
            sCAFV = ANSI_BLUE+"SUB наименование класса: №" +str+": " +ANSI_RED+ this.getClass().getSimpleName() + ANSI_BLUE+" 1S !" + str1;
            return sCAFV;
        }

        public String geS1() {
            return str1;
        }

        public static class SubClasT1 extends SuperClasT1 {


            SubClasT1(String str11, String str22) {
                super(str11);

                str2 = str22;
                str = str + 1;

            }
            @Override
            public String toString() {

                String sCAFV2;
                str = str + 1;
                sCAFV2 = ANSI_BLUE+"SUP наименование класса: №" +str+": " + ANSI_RED+this.getClass().getSimpleName() + ANSI_BLUE+" 2S !" + str2;
                return sCAFV2;

            }
        }

        public static class SubClasT2 extends SuperClasT1.SubClasT1 {


            SubClasT2(String str11, String str22, String str33) {
                super(str11, str22);

                str3 = str33;
                str = str + 1;
            }

            @Override
            public String toString() {

                String sCAFV3;
                str = str + 1;
                sCAFV3 = ANSI_BLUE+"SUP2 наименование класса №"+str+": " + ANSI_RED+this.getClass().getSimpleName() + ANSI_BLUE+" 3S !" + str3;
                return sCAFV3;


            }
        }
    }
}

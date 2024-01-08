package lr6.example7;

public class Main {

        public static int[] getChar(char[] ch1) {
            int[] codeArray = new int[ch1.length];
            for (int i = 0; i < ch1.length; i++) {
                codeArray[i] = (int) ch1[i];
            }
            return codeArray;
        }

        public static void main(String[] args) {
            char[] ch2 = {'А', 'Б', 'В', 'Г', 'Д'};

            int[] codeArray = getChar(ch2);
            System.out.println("Целочисленный массив кодов символов:");
            for (int code : codeArray) {
                System.out.println(code);
            }
        }
}

package lr3;

import java.util.Scanner;

public class Test4 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Введите первое чилсо: ");
        int a = in.nextInt();

        System.out.println("Введите второе чилсо: ");
        int b = in.nextInt();

        int i = 0;

        // Первый оператор цикла
        /* while (i <= 1) {
                i++;
            if (a > b) {
                System.out.println(b + ", " + a + "; \n" + a + ", " + b + ";\n");
            } else {
                System.out.println(a + ", " + b + "; \n" + b + ", " + a + ";\n");
            } */

        //Второй оператор цикла

        System.out.println("Введите число циклов: ");
        int count = in.nextInt();
        for(int c = 0; c <= count; c ++){

            if (a > b) {
                System.out.println(b + ", " + a + "; \n" + a + ", " + b + ";\n");
            } else {
                System.out.println(a + ", " + b + "; \n" + b + ", " + a + ";\n");
            }
        }
    }
}
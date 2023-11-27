package lr1;

import java.util.Scanner;

public class Example13 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        //Ввод 1го числа
        System.out.println("Enter number: ");
        int a = in.nextInt();

        //Ввод 2го числа
        System.out.println("Enter number 2: ");
        int b = in.nextInt();

        //Вывод
        int c;
        c = a + b;
        System.out.println("Answer: " +c );

        in.close();
    }
}

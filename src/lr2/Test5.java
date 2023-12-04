package lr2;

import java.util.Scanner;

public class Test5 {
    public Test5() {
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число: ");
        int a = in.nextInt();
        int result = a / 1000 % 10;
        System.out.println("В числе: " + a + "\nтысяч: " + result);
    }
}

package lr2;

import java.util.Scanner;

public class Test3 {
    public Test3() {
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите любое целое число: ");
        int x = in.nextInt();
        int result = x % 4;
        System.out.println("result = " + result + "\n");
        if (result == 0) {
            System.out.println("Введёное чилсо делиться без остатка\n");
        } else {
            System.out.println("Введёное чилсо делиться не без остатка\n");
        }

        if (x <= 10) {
            System.out.println("Введите число больше или равному 10");
        }

    }
}
package lr2;

import java.util.Scanner;

public class Test1 {
    public Test1() {
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите любое целое число");
        int x = in.nextInt();
        int result = x % 3;
        System.out.println("result = " + result);
        if (result == 0) {
            System.out.println("Введёное число делиться на три без остатка");
        } else {
            System.out.println("Введёное число не делиться на три без остатка");
        }

    }
}
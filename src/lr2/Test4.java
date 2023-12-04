package lr2;

import java.util.Scanner;

public class Test4 {
    public Test4() {
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число: ");
        int a = in.nextInt();
        switch (a) {
            case 5:
                System.out.println("Число попадает в диапозон");
                break;
            case 6:
                System.out.println("Число попадает в диапозон");
                break;
            case 7:
                System.out.println("Число попадает в диапозон");
                break;
            case 8:
                System.out.println("Число попадает в диапозон");
                break;
            case 9:
                System.out.println("Число попадает в диапозон");
                break;
            case 10:
                System.out.println("Число попадает в диапозон");
                break;
            default:
                System.out.println("Число не попадает  диаапозон");
        }

    }
}
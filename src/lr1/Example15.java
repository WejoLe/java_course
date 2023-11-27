package lr1;

import java.util.Scanner;

public class Example15 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //Ввод числа
        System.out.println("Enter number: ");
        int a = in.nextInt();

        //Ввод второго числа
        System.out.println("Enter number 2: ");
        int b = in.nextInt();


        int c;
        int j;

        //Решение
        c = a + b;
        j = a - b;

        //Вывод
        System.out.println("Сумма чисел: " + c + "\nРазность чисел: " + j);
    }
}

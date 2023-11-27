package lr1;

import java.util.Scanner;

public class Example14 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        //Ввод первого числа
        System.out.println("Enter number: ");
        int a = in.nextInt();

        //Ввод второго числа
        System.out.println("Enter number 2: ");
        int b = in.nextInt();

        //Ввод третьего числа
        System.out.println("Enter number 3: ");
        int c = in.nextInt();

        int n;
        //Сложение данных чисел
        n = a + b + c;
        n = n * n;
        //Вывод
        System.out.println("Answer: " + n );
        in.close();
    }
}

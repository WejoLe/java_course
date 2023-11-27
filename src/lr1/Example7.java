package lr1;

import java.util.Scanner;

public class Example7 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        //Ввод имени
        System.out.println("Input name: " );
        String name = in.nextLine();

        //Ввод сколько вам лет
        System.out.println("Input age: ");
        int age = in.nextInt();

        //Вывод
        System.out.println("Name: " +name);
        System.out.println("Age: " +age);
        in.close();
    }
}

package lr1;

import java.util.Scanner;

public class Example6 {
    public static void main(String[] args) {

        //Ввод Фамилии имени
        Scanner in = new Scanner(System.in);
        System.out.println("Input fitstname: ");
        String firstname = in.nextLine();

        //Ввод имя
        System.out.println("Input name: ");
        String name = in.nextLine();

        //Ввод отчество
        System.out.println("Input secondName: ");
        String secondname = in.nextLine();

        //Вывод
        System.out.println("Hello");
        System.out.println("firstName: " + firstname);
        System.out.println("Name: " + name);
        System.out.println("secondName: " + secondname);
        in.close();
    }
}

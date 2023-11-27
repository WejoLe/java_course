package lr1;

import java.util.Scanner;

public class Example11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //Ввод имени
        System.out.println("Inputname: ");
        String name = in.nextLine();

        //Ввод год рождения
        System.out.println("Inpun year of birth: ");
        int year = in.nextInt();

        //Нынешний год
        int Nowyear = 2023;
        year = Nowyear - year;

        //Вывод
        System.out.println("Name: " + name);
        System.out.println("you'r years: " +year);
        in.close();
    }
}

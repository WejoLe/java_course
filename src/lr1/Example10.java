package lr1;

import java.util.Scanner;

public class Example10 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        //Ввод сколько вам лет
        System.out.println("Input you'r years: ");
        int year = in.nextInt();

        //Нынешний год
        int Nowyer = 2023;
        year = Nowyer - year;

        //Вывод
        System.out.println("You " + year + " of the year");
        in.close();
    }
}

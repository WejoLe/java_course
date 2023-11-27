package lr1;

import java.util.Scanner;

public class Example8 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        //Ввод день недели
        System.out.println("Input days of the week: ");
        String WeekDays = in.nextLine();

        //Ввод месяца
        System.out.println("Input Name of the month: ");
        String namemotch = in.nextLine();

        //Ввод даты
        System.out.println("Input date: ");
        int date = in.nextInt();

        //Вывод
        System.out.println("days of the week: " + WeekDays);
        System.out.println("date: " + date);
        System.out.println("Name of the month: " + namemotch);
        in.close();
    }
}
